package com.example.data.pepiline.arkon.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.data.pepiline.arkon.data.models.Vehiculo;
import com.example.data.pepiline.arkon.data.repository.VehiculoRepository;

@Service
public class VehiculoServiceImpl implements VehiculoService{
	
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo> unidadesDisponibles() {
		return vehiculoRepository.unidadesDisponibles();
	}
}
