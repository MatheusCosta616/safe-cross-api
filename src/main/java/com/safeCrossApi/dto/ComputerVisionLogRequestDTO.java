package com.safeCrossApi.dto;

import java.math.BigDecimal;

public class ComputerVisionLogRequestDTO {
    private Long userId;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Double orientation;

    public ComputerVisionLogRequestDTO() {}

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public BigDecimal getLatitude() { return latitude; }
    public void setLatitude(BigDecimal latitude) { this.latitude = latitude; }

    public BigDecimal getLongitude() { return longitude; }
    public void setLongitude(BigDecimal longitude) { this.longitude = longitude; }

    public Double getOrientation() { return orientation; }
    public void setOrientation(Double orientation) { this.orientation = orientation; }
}