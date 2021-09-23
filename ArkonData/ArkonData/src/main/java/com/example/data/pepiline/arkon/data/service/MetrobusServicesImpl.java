package com.example.data.pepiline.arkon.data.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.data.pepiline.arkon.data.models.Metrobus;
import com.example.data.pepiline.arkon.data.repository.MetrobusRepository;

@Service
public class MetrobusServicesImpl implements MetrobusService{

	@Autowired
	private MetrobusRepository metrobusReposiroty; 
	
	@Override
	@Transactional(readOnly = true)
	public List<Metrobus> reporte(Long id) {
		return metrobusReposiroty.reporte(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Metrobus> reporteAlcaldia(String alcaldia) {
		return metrobusReposiroty.reporteAlcaldia(alcaldia);
	}

}
