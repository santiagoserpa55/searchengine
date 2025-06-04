package com.santiago.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.santiago.app.model.DataModel;
import com.santiago.app.repository.DataRepository;

@Service
public class DataService {
	// en el servicio inyectamos el repositorio
	private final DataRepository repository;

	public DataService(DataRepository dataRepository) {
		this.repository = dataRepository;
	}

	public List<DataModel> getAllContratos() {
		return repository.getContratos();
	}

	public List<DataModel> getRazones() {
		return repository.filtroRazones();
	}

}
