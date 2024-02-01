package com.example.ms_gestion.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestion.model.Compras;
import com.example.ms_gestion.repository.IComprasRepository;
import com.example.ms_gestion.services.IComprasServices;
@Service
public class IComprasServicesImpl implements IComprasServices{

	@Autowired
	private IComprasRepository repo;
	@Override
	public void insertarCompras(Compras nuevaCompra) {
		repo.save(nuevaCompra);
		
	}

	@Override
	public List<Compras> listarCompras() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
