package com.uisrael.ms_cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.ms_cliente.model.TipoCliente;
import com.uisrael.ms_cliente.service.ITipoClienteServices;

@RestController
@RequestMapping("/api/tipo")
public class TipoClienteController {

	
	@Autowired
	private ITipoClienteServices servicioTipo;
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void guardarCliente(@RequestBody TipoCliente nuevoCliente) {
		servicioTipo.guardarTipoCliente(nuevoCliente);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<TipoCliente> lisEquipos(){
		return servicioTipo.listartipo();
	}
}
