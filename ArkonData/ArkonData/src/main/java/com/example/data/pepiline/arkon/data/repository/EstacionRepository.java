package com.example.data.pepiline.arkon.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.data.pepiline.arkon.data.models.Estacion;

@Repository
public interface EstacionRepository extends JpaRepository<Estacion, Long>{

}
