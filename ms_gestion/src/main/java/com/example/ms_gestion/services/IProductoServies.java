package com.example.ms_gestion.services;

import com.example.ms_gestion.model.Producto;
import java.util.List;

public interface IProductoServies {
	
	public void insertarProductos(Producto nuevoProducto);
	
	public List<Producto> listarProducto();

}
