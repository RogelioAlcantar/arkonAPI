package com.example.data.pepiline.arkon.data.service;

import java.util.List;

import com.example.data.pepiline.arkon.data.models.Metrobus;

public interface MetrobusService {
	
	public List<Metrobus> reporte(Long id);
	
	public List<Metrobus> reporteAlcaldia(String alcaldia);

}
