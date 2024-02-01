package com.uisrael.ms_cliente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.ms_cliente.model.TipoCliente;
import com.uisrael.ms_cliente.repository.ITipoClienteRepository;
import com.uisrael.ms_cliente.service.ITipoClienteServices;


@Service
public class TipoClienteServicesImpl implements ITipoClienteServices{

	@Autowired
	private ITipoClienteRepository repo;

	@Override
	public boolean guardarTipoCliente(TipoCliente tipocliente) {
		// TODO Auto-generated method stub
		return repo.save(tipocliente) != null;
	}

	@Override
	public List<TipoCliente> listartipo() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	


}
