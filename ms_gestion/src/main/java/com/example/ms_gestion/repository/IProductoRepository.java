package com.example.ms_gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_gestion.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
