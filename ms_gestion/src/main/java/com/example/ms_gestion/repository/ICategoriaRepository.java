package com.example.ms_gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_gestion.model.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {

}
