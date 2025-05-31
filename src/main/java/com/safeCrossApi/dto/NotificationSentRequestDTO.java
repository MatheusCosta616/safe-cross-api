package com.safeCrossApi.dto;

import java.math.BigDecimal;

public class NotificationSentRequestDTO {
    private Long userId;
    private Long notificationTypeId;
    private BigDecimal targetLatitude;
    private BigDecimal targetLongitude;

    public NotificationSentRequestDTO() {}

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Long getNotificationTypeId() { return notificationTypeId; }
    public void setNotificationTypeId(Long notificationTypeId) { this.notificationTypeId = notificationTypeId; }

    public BigDecimal getTargetLatitude() { return targetLatitude; }
    public void setTargetLatitude(BigDecimal targetLatitude) { this.targetLatitude = targetLatitude; }

    public BigDecimal getTargetLongitude() { return targetLongitude; }
    public void setTargetLongitude(BigDecimal targetLongitude) { this.targetLongitude = targetLongitude; }
}