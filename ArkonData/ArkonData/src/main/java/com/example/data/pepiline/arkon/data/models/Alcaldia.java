package com.example.data.pepiline.arkon.data.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "alcaldias")
@ApiModel(value = "Representa la abstracion de una Alcaldia")
public class Alcaldia implements Serializable {

	@ApiModelProperty(value = "El id de la alcaldia")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alcaldia")
	private Long id_alcaldia;

	@ApiModelProperty(value = "Nombre que tiene la alcaldia")
	@Column(name = "nombre")
	@NotNull
	private String nombre;

	@ApiModelProperty(value = "Estado de la republica a la cual pertenece")
	@NotNull
	@Column(name = "estado")
	private String estado;

	@ApiModelProperty(value = "Estatus de una alcaldia, 1 activo y 2 inactivo")
	@NotNull
	@Column(name = "alcaldia_status")
	private String alcaldia_status;

	public Long getId_alcaldia() {
		return id_alcaldia;
	}

	public void setId_alcaldia(Long id_alcaldia) {
		this.id_alcaldia = id_alcaldia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAlcaldia_status() {
		return alcaldia_status;
	}

	public void setAlcaldia_status(String alcaldia_status) {
		this.alcaldia_status = alcaldia_status;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
