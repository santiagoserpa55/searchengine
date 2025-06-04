package com.santiago.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santiago.app.model.DataModel;
import com.santiago.app.service.DataService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DataController {

	private DataService dataService;

	public DataController(DataService controlador) {
		this.dataService = controlador;
	}

	@GetMapping("/contratos")
	public List<DataModel> getContratos() {
		return dataService.getAllContratos();
	}
	//campo que filtra la razon social unica
	@GetMapping("/getRazonUnica")
	public List<DataModel> getRazones() {
		return dataService.getRazones();
	}

}
