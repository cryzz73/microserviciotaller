package com.example.ms_gestion.services;

import java.util.List;

import com.example.ms_gestion.model.Compras;

public interface IComprasServices {
	
	public void insertarCompras (Compras nuevaCompra);
	
	public List<Compras> listarCompras();

}
