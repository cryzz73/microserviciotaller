package com.example.ms_gestion.services;

import java.util.List;

import com.example.ms_gestion.model.Inventario;

public interface IInventarioServices {
	
	public void insertarInventario(Inventario nuevoInventario);
	
	public List<Inventario> listarInventario();

}
