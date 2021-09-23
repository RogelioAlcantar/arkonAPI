package com.example.data.pepiline.arkon.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.pepiline.arkon.data.models.Alcaldia;
import com.example.data.pepiline.arkon.data.models.Metrobus;
import com.example.data.pepiline.arkon.data.models.Vehiculo;
import com.example.data.pepiline.arkon.data.repository.MetrobusRepository;
import com.example.data.pepiline.arkon.data.service.AlcaldiaService;
import com.example.data.pepiline.arkon.data.service.EstacionService;
import com.example.data.pepiline.arkon.data.service.VehiculoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Example;

@RestController
@Api(value = "API del metrobus de la CDMX")
public class MetrobusController {
	
	@Autowired
	private AlcaldiaService alcaldiaService;
		
	@Autowired
	private MetrobusRepository metrobusRepository;
	
	@Autowired
	private VehiculoService vehiculoService;
	
	@ApiOperation(value = "Obtener una lista de alcaldías disponibles")	
	@ApiResponses( value = { 
			@ApiResponse(code = 200, message = "Successful operation"),
			@ApiResponse(code = 400, message = "Invalid id supplied"),
			@ApiResponse(code = 404, message = "Message not found") 
	}) 
	@GetMapping("/alcaldias/disponibles")
	public ResponseEntity<Object> alcaldiasDisponibles(){
		List<Alcaldia> lista = alcaldiaService.listaAlcaldía();
		if(lista.isEmpty()) {
			return new ResponseEntity<>("No existen alcaldias disponibles", HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Obtener una lista de unidades disponibles")
	@ApiResponses( value = { 
			@ApiResponse(code = 200, message = "Successful operation"),
			@ApiResponse(code = 400, message = "Invalid id supplied"),
			@ApiResponse(code = 404, message = "Message not found") 
	}) 
	@GetMapping("/vehiculos/disponibles")
	public ResponseEntity<Object> vehiculosDisponibles(){
		List<Vehiculo> lista = vehiculoService.unidadesDisponibles();
		if(lista.isEmpty()) {
			return new ResponseEntity<>("No existen vehiculos disponibles", HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Consultar los el historial de ubicaciones/fechas de una unidad dado su ID")
	@ApiResponses( value = { 
			@ApiResponse(code = 200, message = "Successful operation"),
			@ApiResponse(code = 400, message = "Invalid id supplied"),
			@ApiResponse(code = 404, message = "Message not found") 
	}) 
	@GetMapping("/reporte/vehiculo/{id}")
	public ResponseEntity<Object> reporteVehiculo(@PathVariable Long id){
		List<Metrobus> lista = metrobusRepository.reporte(id);
				if(lista.isEmpty()) {
					return new ResponseEntity<>("Ocurrio un problema, no encontramos el id que requiere", HttpStatus.CONFLICT);
				}
				return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Obtener una lista de unidades que hayan estado dentro de una alcaldía")
	@ApiResponses( value = { 
			@ApiResponse(code = 200, message = "Successful operation"),
			@ApiResponse(code = 400, message = "Invalid id supplied"),
			@ApiResponse(code = 404, message = "Message not found") 
	}) 
	@GetMapping("/reporte/unidad/alcaldia/{alcaldia}")
	public ResponseEntity<Object> reporteAlcaldia(@PathVariable String alcaldia){
		List<Metrobus> lista = metrobusRepository.reporteAlcaldia(alcaldia);
		if(lista.isEmpty()) {
			return new ResponseEntity<>("Ocurrio un problema, no encontramos unidades en esa alcaldia", HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
}
