package com.safeCrossApi.dto;

import java.math.BigDecimal;

public class AffectedAreaRegisterFindByCoordinatesRequestDTO {
    private BigDecimal latitude;
    private BigDecimal longitude;

    public AffectedAreaRegisterFindByCoordinatesRequestDTO() {}

    public BigDecimal getLatitude() { return latitude; }
    public void setLatitude(BigDecimal latitude) { this.latitude = latitude; }

    public BigDecimal getLongitude() { return longitude; }
    public void setLongitude(BigDecimal longitude) { this.longitude = longitude; }
}