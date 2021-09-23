package com.example.data.pepiline.arkon.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.data.pepiline.arkon.data.models.Alcaldia;
import com.example.data.pepiline.arkon.data.repository.AlcaldiaRepository;

@Service
public class AlcaldiaServiceImplement implements AlcaldiaService{
	
	@Autowired
	private AlcaldiaRepository alcaldiaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Alcaldia> listaAlcaldía() {
		return alcaldiaRepository.alcladiasDisponibles();
	}
}
