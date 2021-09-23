package com.example.data.pepiline.arkon.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.data.pepiline.arkon.data.models.Vehiculo;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long>{
	
	@Query("select v from Vehiculo v where v.vehicle_current_status = 1")
	public List<Vehiculo> unidadesDisponibles();
}
