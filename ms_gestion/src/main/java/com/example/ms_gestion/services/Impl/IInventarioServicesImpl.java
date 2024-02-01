package com.example.ms_gestion.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestion.model.Inventario;
import com.example.ms_gestion.repository.IInventarioRepository;
import com.example.ms_gestion.services.IInventarioServices;
@Service
public class IInventarioServicesImpl implements IInventarioServices {

	
	@Autowired
	private IInventarioRepository repo;
	@Override
	public void insertarInventario(Inventario nuevoInventario) {
		
		repo.save(nuevoInventario);
	}

	@Override
	public List<Inventario> listarInventario() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
