package com.uisrael.ms_cliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.ms_cliente.model.Cliente;

public interface IClienteRepository extends MongoRepository<Cliente, Integer>{

}
