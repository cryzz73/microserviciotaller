package com.example.ms_gestion.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestion.model.Proveedores;
import com.example.ms_gestion.repository.IProveedorRepository;
import com.example.ms_gestion.services.IProveedorServices;
@Service
public class IProveedoresServicesImpl implements IProveedorServices{

	
	@Autowired
	private IProveedorRepository repo;
	@Override
	public void insertarProveedor(Proveedores nuevoProveedor) {
		
		repo.save(nuevoProveedor);
	}

	@Override
	public List<Proveedores> listarProveedores() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
