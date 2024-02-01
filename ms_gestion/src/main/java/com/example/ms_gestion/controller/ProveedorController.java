package com.example.ms_gestion.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("api/proveedor")
@Getter
@Setter
@RefreshScope
public class ProveedorController {
	@Value("${app.testPropiedad}")
	private String testPropiedad;
	
	@GetMapping("/testprove")
	public String leerContenidoTestPropiedad() {
		return this.testPropiedad;
	}
}
