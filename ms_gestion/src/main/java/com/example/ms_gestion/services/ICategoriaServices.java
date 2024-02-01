package com.example.ms_gestion.services;

import java.util.List;

import com.example.ms_gestion.model.Categoria;

public interface ICategoriaServices {

	public void insertarCategoria (Categoria nuevaCategoria);
	
	public List<Categoria> listarCategoria();
}
