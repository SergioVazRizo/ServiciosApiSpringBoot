package com.becas.becas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "beca")
public class Beca {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long becaId;
    
    @Column(nullable = false)
    private String nombreBeca;
    
    @Column(nullable = false)
    private String descripcion;
    
    @Column(nullable = false)
    private String estatus; // activa/inactiva
}
