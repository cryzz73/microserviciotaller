package com.uisrael.ms_cliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.ms_cliente.model.TipoCliente;

public interface ITipoClienteRepository extends MongoRepository<TipoCliente, Integer>{

}
