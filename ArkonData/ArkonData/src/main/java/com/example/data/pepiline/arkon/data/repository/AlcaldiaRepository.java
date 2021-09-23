package com.example.data.pepiline.arkon.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.data.pepiline.arkon.data.models.Alcaldia;

@Repository
public interface AlcaldiaRepository extends JpaRepository<Alcaldia, Long>{
	
	@Query("select a from Alcaldia a where  a.alcaldia_status= 1")
	public List<Alcaldia> alcladiasDisponibles();
}
