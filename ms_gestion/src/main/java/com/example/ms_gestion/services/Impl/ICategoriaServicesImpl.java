package com.example.ms_gestion.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestion.model.Categoria;
import com.example.ms_gestion.repository.ICategoriaRepository;
import com.example.ms_gestion.services.ICategoriaServices;
@Service
public class ICategoriaServicesImpl implements ICategoriaServices {

	
	@Autowired
	public ICategoriaRepository repo;
	@Override
	public void insertarCategoria(Categoria nuevaCategoria) {
		
		repo.save(nuevaCategoria);
	}

	@Override
	public List<Categoria> listarCategoria() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
