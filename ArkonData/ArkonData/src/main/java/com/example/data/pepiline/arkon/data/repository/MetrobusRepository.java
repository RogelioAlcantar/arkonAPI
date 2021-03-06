package com.example.data.pepiline.arkon.data.repository;
 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.data.pepiline.arkon.data.models.Metrobus;

@Repository
public interface MetrobusRepository extends JpaRepository<Metrobus, Long>{
	
	@Query("select m from Metrobus m join fetch m.id_vehiculo v where v.vehicle_current_status = 1 and v.id_vehiculo = ?1")
	public List<Metrobus> reporte(Long id);
	
	@Query("select m from Metrobus m join fetch m.id_estacion e join fetch e.id_alcaldia a where a.nombre like %?1%")
	public List<Metrobus> reporteAlcaldia(String alcaldia);
}
