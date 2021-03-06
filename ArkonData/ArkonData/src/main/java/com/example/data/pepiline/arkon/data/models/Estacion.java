package com.example.data.pepiline.arkon.data.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "estaciones")
@ApiModel(value = "Representa la abstracion de una Estacion")
public class Estacion implements Serializable {

	@ApiModelProperty(value = "Id de la estacion")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estacion")
	private Long id_estacion;

	@ApiModelProperty(value = "Latitud de la estacion")
	@NotNull
	@Column(name = "position_latitude")
	private Double position_latitude;
	
	@ApiModelProperty(value = "Longitud de la estacion")
	@NotNull
	@Column(name = "position_longitude")
	private Double position_longitude;
	
	@ApiModelProperty(value = "Punto geografico de la estación")
	@NotNull
	@Column(name = "geographic_point")
	private String geographic_point;
	
	@ApiModelProperty(value = "Id de la alcaldia a la cual pertece la estacion")
	@ManyToOne
	@JoinColumn(name = "id_alcaldia")
	private Alcaldia id_alcaldia;

	public Long getId_estacion() {
		return id_estacion;
	}

	public void setId_estacion(Long id_estacion) {
		this.id_estacion = id_estacion;
	}

	public Double getPosition_latitude() {
		return position_latitude;
	}

	public void setPosition_latitude(Double position_latitude) {
		this.position_latitude = position_latitude;
	}

	public Double getPosition_longitude() {
		return position_longitude;
	}

	public void setPosition_longitude(Double position_longitude) {
		this.position_longitude = position_longitude;
	}

	public String getGeographic_point() {
		return geographic_point;
	}

	public void setGeographic_point(String geographic_point) {
		this.geographic_point = geographic_point;
	}

	public Alcaldia getAlcaldia() {
		return id_alcaldia;
	}

	public void setAlcaldia(Alcaldia id_alcaldia) {
		this.id_alcaldia = id_alcaldia;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
