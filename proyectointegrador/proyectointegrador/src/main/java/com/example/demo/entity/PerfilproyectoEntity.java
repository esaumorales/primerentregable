package com.example.demo.entity;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PERFILPROYECTO")
public class PerfilproyectoEntity implements Serializable {
private static final long serialVersionUID = -2170897015344177815L;

@Id
@Column(name = "ID")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "NOMBRE")
	private String nombre;

@Column(name = "ESTADO")
	private String estado;

@Column(name = "LIMITE_PROYECTO")
private String limite_proyecto;

	
}