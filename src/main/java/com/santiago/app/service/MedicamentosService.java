package com.santiago.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.santiago.app.model.MedicamentosModel;
import com.santiago.app.repository.MedicamentosRepository;
@Service
public class MedicamentosService {

	// en el servicio inyectamos el repositorio
	private final MedicamentosRepository repository;

	public MedicamentosService(MedicamentosRepository medRepository) {
		this.repository = medRepository;
	}

	public List<MedicamentosModel> getAllMedicamentos() {
		return repository.getMedicamentos();
	}

}
