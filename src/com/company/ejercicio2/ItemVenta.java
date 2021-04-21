package com.company.ejercicio2;
import java.util.UUID;
public class ItemVenta {

    private String id=UUID.randomUUID().toString().substring(0, 8);//genero un codigo random de 8 caracteres;
    private String nombre;
    private String descripcion;
    private double precioUnitario;


    public ItemVenta(String nombre,String descripcion,double precioUnitario)
    {
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precioUnitario=precioUnitario;

    }

    @Override
    public String toString() {
        return "\n ItemVenta{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + precioUnitario +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
