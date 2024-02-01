package com.uisrael.ms_cliente.service;

import java.util.List;


import com.uisrael.ms_cliente.model.Cliente;

public interface IClienteSercice  {
	
	public boolean guardarCliente(Cliente nuevoCliente);
	public List<Cliente> listarCliente();


}
