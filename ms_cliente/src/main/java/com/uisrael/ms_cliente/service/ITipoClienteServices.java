package com.uisrael.ms_cliente.service;

import java.util.List;

import com.uisrael.ms_cliente.model.TipoCliente;

public interface ITipoClienteServices {

	public List<TipoCliente> listartipo();
	
	public boolean guardarTipoCliente(TipoCliente tipocliente);

}
