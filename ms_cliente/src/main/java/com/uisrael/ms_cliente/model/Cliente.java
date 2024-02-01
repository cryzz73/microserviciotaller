package com.uisrael.ms_cliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "cliente")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
    @Id
    private int idCliente;
    private String nombre;
    private String apellido;
    private String ci;
    private String direccion;
    private String email;
    private String telefono;
    private boolean estado;

    // Utiliza @DBRef para establecer una referencia a un solo TipoCliente
    @DBRef
    private int  tipoCliente;

    public Cliente(String nombre, String apellido, String ci, String direccion, String email, String telefono, boolean estado, int tipoCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
        this.tipoCliente = tipoCliente;
    }
}
