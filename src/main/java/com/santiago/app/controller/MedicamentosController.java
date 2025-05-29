package com.santiago.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santiago.app.model.MedicamentosModel;
import com.santiago.app.service.MedicamentosService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MedicamentosController {
	private MedicamentosService medicamentosService;

	public MedicamentosController(MedicamentosService controlador) {
		this.medicamentosService = controlador;
	}

	@GetMapping("/medicamentos")
	public List<MedicamentosModel> getMedicamentos() {
		return medicamentosService.getAllMedicamentos();
	}
}
