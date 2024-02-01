package com.example.ms_gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_gestion.model.Proveedores;

public interface IProveedorRepository extends JpaRepository<Proveedores, Integer> {

}
