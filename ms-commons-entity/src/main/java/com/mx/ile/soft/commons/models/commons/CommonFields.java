package com.mx.ile.soft.commons.models.commons;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

/**
 * @author IleSoft
 * @version 1.0 04/08/2021
 */
@Data
@MappedSuperclass
public class CommonFields {

	/**
	 * Identificador de las tablas.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * Fecha de creacion de un registro en las tablas.
	 */
	@Column(name = "fecha_creacion")
	private LocalDateTime fechaCreacion;
}
