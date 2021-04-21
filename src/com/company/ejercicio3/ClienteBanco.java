package com.company.ejercicio3;

import java.util.UUID;

public class ClienteBanco extends Persona {
    private String id = UUID.randomUUID().toString().substring(0, 8);//genero un codigo random de 8 caracteres

    public ClienteBanco(String nombre,char genero)
    {
        super(nombre,genero);
    }

    public  String getNombre()
    {
        return this.nombre;
    }
    @Override
    public String toString() {
        return "\n ClienteBanco{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }
}
