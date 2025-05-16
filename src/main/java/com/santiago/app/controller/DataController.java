package com.santiago.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santiago.app.model.DataModel;
import com.santiago.app.service.DataService;


@RestController
public class DataController {

	private DataService dataService;

	public DataController(DataService controlador) {
		this.dataService = controlador;
	}

	@GetMapping("/data")
	public List<DataModel> getAllData() {
		return dataService.getAllData();
	}

}
