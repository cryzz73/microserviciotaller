package com.example.ms_gestion.services;

import java.util.List;

import com.example.ms_gestion.model.Proveedores;

public interface IProveedorServices {
	
	public void insertarProveedor(Proveedores nuevoProveedor);
	
	public List<Proveedores> listarProveedores();

}
