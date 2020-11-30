package com.sentinel.iot.api.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Set;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/24
 * @Description:
 */
public class HttpUtils {

    private static Logger log = LoggerFactory.getLogger(HttpUtils.class);

    public static String doPostForm(String url, Map<String, Object> parameterMap, String token) {
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        String result = null;
        try {
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(15000);
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if (token != null && token.length() > 0) {
                connection.setRequestProperty("Authorization", token);
            }

            outputStream = connection.getOutputStream();

            if (parameterMap != null && parameterMap.size() > 0) {
                StringBuilder sb = new StringBuilder();
                Set<Map.Entry<String, Object>> entrySet = parameterMap.entrySet();
                for (Map.Entry<String, Object> entry : entrySet) {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(entry.getKey()).append("=").append(entry.getValue());
                }
                outputStream.write(sb.toString().getBytes());
            }
            int httpStatus = connection.getResponseCode();
            if (httpStatus == 200) {
                inputStream = connection.getInputStream();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                StringBuffer sb = new StringBuffer();
                String temp;
                while ((temp = bufferedReader.readLine()) != null) {
                    sb.append(temp).append("\r\n");
                }
                result = sb.toString();
            }
            StringBuilder logStringBuilder = new StringBuilder()
                    .append("\nRequest : ").append(url)
                    .append("\nParameter : ").append(parameterMap)
                    .append("\nHttpStatus : ").append(httpStatus)
                    .append("\nResponse : ").append(result);
            log.debug(logStringBuilder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != bufferedReader) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            connection.disconnect();
        }
        return result;
    }
}