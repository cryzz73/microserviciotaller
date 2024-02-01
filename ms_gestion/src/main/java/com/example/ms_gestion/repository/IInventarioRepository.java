package com.example.ms_gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_gestion.model.Inventario;

public interface IInventarioRepository extends JpaRepository<Inventario, Integer>{

}
