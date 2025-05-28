package com.safeCrossApi.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "registro_area_afetada")
public class AffectedAreaRegisterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private UserModel user;

    @Column(name = "latitude", precision = 10, scale = 8)
    private BigDecimal latitude;

    @Column(name = "longitude", precision = 11, scale = 8)
    private BigDecimal longitude;

    @Column(name = "data_hora_registro")
    private LocalDateTime registerDateTime;

    @Column(name = "descricao", length = 255)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_status_validacao", nullable = false)
    private ValidationStatusModel validationStatus;

    public AffectedAreaRegisterModel() {}

    public AffectedAreaRegisterModel(Long id, UserModel user, BigDecimal latitude, BigDecimal longitude, LocalDateTime registerDateTime, String description, ValidationStatusModel validationStatus) {
        this.id = id;
        this.user = user;
        this.latitude = latitude;
        this.longitude = longitude;
        this.registerDateTime = registerDateTime;
        this.description = description;
        this.validationStatus = validationStatus;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserModel getUser() { return user; }
    public void setUser(UserModel user) { this.user = user; }

    public BigDecimal getLatitude() { return latitude; }
    public void setLatitude(BigDecimal latitude) { this.latitude = latitude; }

    public BigDecimal getLongitude() { return longitude; }
    public void setLongitude(BigDecimal longitude) { this.longitude = longitude; }

    public LocalDateTime getRegisterDateTime() { return registerDateTime; }
    public void setRegisterDateTime(LocalDateTime registerDateTime) { this.registerDateTime = registerDateTime; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public ValidationStatusModel getValidationStatus() { return validationStatus; }
    public void setValidationStatus(ValidationStatusModel validationStatus) { this.validationStatus = validationStatus; }
}