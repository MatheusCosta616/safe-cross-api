package com.safeCrossApi.dto;

import java.math.BigDecimal;

public class AffectedAreaRegisterRequestDTO {
    private Long userId;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String description;
    private Long validationStatusId;

    public AffectedAreaRegisterRequestDTO() {}

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public BigDecimal getLatitude() { return latitude; }
    public void setLatitude(BigDecimal latitude) { this.latitude = latitude; }

    public BigDecimal getLongitude() { return longitude; }
    public void setLongitude(BigDecimal longitude) { this.longitude = longitude; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Long getValidationStatusId() { return validationStatusId; }
    public void setValidationStatusId(Long validationStatusId) { this.validationStatusId = validationStatusId; }
}