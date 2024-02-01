package com.example.ms_gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_gestion.model.Producto;
import com.example.ms_gestion.services.IProductoServies;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("api/producto")
@Getter
@Setter
@RefreshScope
public class ProductoController {
	
	@Autowired
	
	private IProductoServies ser;
	
	@Value("${app.testPropiedad}")
	private String testPropiedad;
	
	@GetMapping("/testpro")
	public String leerContenidoTestPropiedad() {
		return this.testPropiedad;
	}
	
	@GetMapping("/listarpro")
	public List<Producto> listarProducto() {
		return this.ser.listarProducto();
	}
}
