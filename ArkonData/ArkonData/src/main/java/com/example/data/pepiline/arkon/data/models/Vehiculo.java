package com.example.data.pepiline.arkon.data.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "vehiculos")
@ApiModel(value = "Representa la abstracion de un Vehiculo")
public class Vehiculo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "Id del vehiculo")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vehiculo")
	private Long id_vehiculo;
	
	@ApiModelProperty(value = "Label del vehiculo")
	@Column(name = "vehicle_label")
	private Long vehicle_label;
	
	@ApiModelProperty(value = "Estatus del vehiculo")
	@Column(name ="vehicle_current_status")
	private Long vehicle_current_status;

	public Long getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(Long id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public Long getVehicle_label() {
		return vehicle_label;
	}

	public void setVehicle_label(Long vehicle_label) {
		this.vehicle_label = vehicle_label;
	}

	public Long getVehicle_current_status() {
		return vehicle_current_status;
	}

	public void setVehicle_current_status(Long vehicle_current_status) {
		this.vehicle_current_status = vehicle_current_status;
	}
	


}
