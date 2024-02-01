package com.example.ms_gestion.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.ms_gestion.model.Producto;
import com.example.ms_gestion.repository.IProductoRepository;
import com.example.ms_gestion.services.IProductoServies;
@Service
@Component
public class IProductoServicesImpl  implements IProductoServies{

	@Autowired
	private IProductoRepository repo;
	
	@Override
	public void insertarProductos(Producto nuevoProducto) {
				
		repo.save(nuevoProducto);
	}

	@Override
	public List<Producto> listarProducto() {
		return repo.findAll();
	}




}
