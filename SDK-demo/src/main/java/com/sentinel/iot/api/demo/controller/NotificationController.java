package com.sentinel.iot.api.demo.controller;

import com.sentinel.iot.api.common.NotificationType;
import com.sentinel.iot.api.core.Notification;
import com.sentinel.iot.api.demo.common.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright Sentinel NV
 * @Author: Bob.Jiang
 * @Date: 2020/9/2 13:33
 * @Description:
 */
@RestController
@Slf4j
public class NotificationController {

    @PostMapping("/notification")
    public String notification(@RequestBody Notification notification) {
        log.debug("Receive notification from Sentinel API System {} ", notification);
        switch (notification.getNotificationType()) {
            case NotificationType
                    .LOCKS_ASSIGNED:
                log.debug("Receive notification of assigned lock {} ", notification.buildLocksAssignedMessage());
                /**
                 * You can save this lock to database
                 */
                break;
            case NotificationType
                    .LOCK_UNBOUND:
                log.debug("Receive notification of unbound lock {} ", notification.buildLockUnboundMessage());
                /**
                 * You can delete this lock from database
                 */
                break;
            case NotificationType
                    .REGISTERED:
                log.debug("Receive notification of lock registration {} ", notification.buildRegistrationMessage());
                /**
                 * You can update the information stored in the database according to the returned data
                 */
                break;
            case NotificationType
                    .HEARTBEAT:
                log.debug("Receive notification of lock registration {} ", notification.buildHeartBeatMessage());
                /**
                 * You can update the information stored in the database according to the returned data
                 */
                break;
            case NotificationType
                    .BACK_CODE_MODIFIED:
                log.debug("Receive notification of modified back-code {} ", notification.buildBackCodeMessage());
                /**
                 * You can update the information stored in the database according to the returned data.
                 */
                break;
            case NotificationType
                    .EXTENSION_CODE_MODIFIED:
                log.debug("Receive notification of modified extension code {} ", notification.buildExtensionCodeMessage());
                /**
                 * You can update the information stored in the database according to the returned data.
                 */
                break;
            case NotificationType
                    .GPS_REPORTED:
                log.debug("Receive notification of reported GPS data {} ", notification.buildGpsMessage());
                /**
                 * You can update the information stored in the database according to the returned data.
                 */
                break;
            case NotificationType
                    .READ_CARD:
                log.debug("Receive card reader notification {} ", notification.buildReadCardMessage());
                /**
                 * You can check whether this card can open the Sentinel lock, if possible, please call the 'OPEN' API, if not, you can call the 'Sound Light Reminder' API.
                 */
                break;
            case NotificationType
                    .LOCK_OPENED:
                log.debug("Receive the unlock notification {} ", notification.buildLockOpenedMessage());
                /**
                 * The lock has been successfully opened
                 */
                break;
            case NotificationType
                    .LOCK_CLOSED:
                log.debug("Received the lock closed notification {} ", notification.buildLockClosedMessage());
                /**
                 * The lock has been closed
                 */
                break;
            default:
                log.error("Unknown notification {} " + notification);
                break;
        }
        return ResponseCode.SUCCESS;
    }

}
