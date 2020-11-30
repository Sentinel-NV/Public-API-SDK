package com.sentinel.iot.api.model;


/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/25
 * @Description:
 */
public class GeoPoint {

    /**
     * longitude
     */
    private Double longitude;

    /**
     * latitude
     */
    private Double latitude;

    private String tripUUID;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getTripUUID() {
        return tripUUID;
    }

    public void setTripUUID(String tripUUID) {
        this.tripUUID = tripUUID;
    }

    @Override
    public String toString() {
        return "GeoPoint{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", tripUUID='" + tripUUID + '\'' +
                '}';
    }
}
