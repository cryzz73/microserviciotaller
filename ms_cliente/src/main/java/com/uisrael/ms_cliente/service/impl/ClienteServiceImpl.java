package com.uisrael.ms_cliente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.ms_cliente.model.Cliente;
import com.uisrael.ms_cliente.repository.IClienteRepository;
import com.uisrael.ms_cliente.service.IClienteSercice;

@Service
public class ClienteServiceImpl implements IClienteSercice {
	
	@Autowired
	private IClienteRepository repo;


	@Override
	public boolean guardarCliente(Cliente nuevoCliente) {
		// TODO Auto-generated method stub
		return repo.save(nuevoCliente) != null;
	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
