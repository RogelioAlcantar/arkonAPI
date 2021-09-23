package com.example.data.pepiline.arkon.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.data.pepiline.arkon.data.repository.EstacionRepository;

@Service
public class EstacionServiceImplement implements EstacionService{
	
	@Autowired
	private EstacionRepository estacionRepository;
}
