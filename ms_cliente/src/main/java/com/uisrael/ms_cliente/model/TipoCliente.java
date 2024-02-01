package com.uisrael.ms_cliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "tipoCliente")
@Getter
@Setter
@NoArgsConstructor
public class TipoCliente {
    @Id
    private int idTipoCliente;
    private String descripcion;

}
