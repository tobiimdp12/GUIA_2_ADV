package com.company.ejercicio2;
import java.util.UUID;
public class Cliente {
    private String id = UUID.randomUUID().toString().substring(0, 8);//genero un codigo random de 8 caracteres
    private String nombre;
    private String email;

    private double descuento;

    public Cliente(String nombre,String email,double descuento)
    {
    this.nombre=nombre;
    this.email=email;
    this.descuento=descuento;
    }
    public String getId()
    {
        return this.id;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getEmail()
    {
        return this.email;
    }
    public double getDescuento()
    {
        return this.descuento;
    }
    @Override
    public String toString() {
        return "Cliente[" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                ']';
    }
}