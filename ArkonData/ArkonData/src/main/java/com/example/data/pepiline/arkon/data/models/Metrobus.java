package com.example.data.pepiline.arkon.data.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@Table(name = "metrobuses")
@ApiModel(value = "Representa la abstracion de un Metrobus")
public class Metrobus implements Serializable {
	
	@ApiModelProperty(value = "Id de los metrobuses")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ApiModelProperty(value = "Fecha de actualizacion")
	@NotNull
	@Column(name = "date_updated")
	private String date_updated;
	
	@ApiModelProperty(value = "Id del vehiculo")
	@ManyToOne
	@JoinColumn(name = "id_vehiculo")
	private Vehiculo id_vehiculo;
	
	@ApiModelProperty(value = "Id de la estacion")
	@OneToOne
	@JoinColumn(name = "id_estacion")
	private Estacion id_estacion;
	
	@ApiModelProperty(value = "Velocidad")
	@NotNull
	@Column(name = "position_speed")
	private Long position_speed;
	
	@ApiModelProperty(value = "Odometro")
	@NotNull
	@Column(name = "position_odometer")
	private Long position_odometer;
	
	@ApiModelProperty(value = "Horario de relacion")
	@Column(name = "trip_schedule_relationship")
	private Long trip_schedule_relationship;
	
	@ApiModelProperty(value = "Id del viaje")
	@Column(name = "trip_id")
	private Long trip_id;
	
	@ApiModelProperty(value = "Fecha de inicio")
	@Column(name = "trip_start_date")
	private Long trip_start_date;
	
	@ApiModelProperty(value = "Id de la ruta")
	@Column(name = "trip_route_id")
	private Long trip_route_id;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDate_updated() {
		return date_updated;
	}


	public void setDate_updated(String date_updated) {
		this.date_updated = date_updated;
	}


	public Vehiculo getVehiculo() {
		return id_vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.id_vehiculo = vehiculo;
	}


	public Estacion getEstacion() {
		return id_estacion;
	}


	public void setEstacion(Estacion estacion) {
		this.id_estacion = estacion;
	}


	public Long getPosition_speed() {
		return position_speed;
	}


	public void setPosition_speed(Long position_speed) {
		this.position_speed = position_speed;
	}


	public Long getPosition_odometer() {
		return position_odometer;
	}


	public void setPosition_odometer(Long position_odometer) {
		this.position_odometer = position_odometer;
	}


	public Long getTrip_schedule_relationship() {
		return trip_schedule_relationship;
	}


	public void setTrip_schedule_relationship(Long trip_schedule_relationship) {
		this.trip_schedule_relationship = trip_schedule_relationship;
	}


	public Long getTrip_id() {
		return trip_id;
	}


	public void setTrip_id(Long trip_id) {
		this.trip_id = trip_id;
	}


	public Long getTrip_start_date() {
		return trip_start_date;
	}


	public void setTrip_start_date(Long trip_start_date) {
		this.trip_start_date = trip_start_date;
	}


	public Long getTrip_route_id() {
		return trip_route_id;
	}


	public void setTrip_route_id(Long trip_route_id) {
		this.trip_route_id = trip_route_id;
	}


	private static final long serialVersionUID = 1L;

}
