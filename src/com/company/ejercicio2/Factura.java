package com.company.ejercicio2;

import com.company.ejercicio1.Autor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Factura {
    public double montoTotal;
    private String id = UUID.randomUUID().toString().substring(0, 8);//genero un codigo random de 8 caracteres
    public String fecha=formatFecha();
    public Cliente cliente;
    ArrayList<ItemVenta> itemVenta=new ArrayList<ItemVenta>();//diferencia ArrayList<ItemVenta> itemVenta=new ArrayList<ItemVenta>();

    public Factura(Cliente cliente,double montoTotal)
    {
        this.cliente=cliente;
        this.montoTotal=montoTotal;
    }

    public void addItem(ItemVenta item)
    {
        itemVenta.add(item);
    }
    public double calcularMontoTotal()
    {
        double sumaMonto=0;
        for (ItemVenta item:itemVenta) {
            sumaMonto+=item.getPrecioUnitario();
        }
        return sumaMonto;
    }
    public String formatFecha()
    {
        LocalDate fecha=LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd MM yyyy");
        String formattedString = fecha.format(formatter);

        return  formattedString;
    }

    @Override
    public String toString() {
        return "Factura{" +

                "id factura='" + id + '\'' +
                ", fecha de emision='" + fecha + '\'' +
                ",montoTotal=\"" + montoTotal+
                ",montoDesc=\\\"\""+ calcularDescuento(this.montoTotal,this.cliente.getDescuento())+
                ", Cliente[" + cliente.toString() +
                '}';
    }

    public double calcularDescuento(double montoTotal,double descuentoCliente)
    {
        double loQueDescuento=(calcularMontoTotal()*descuentoCliente)/100;
        return montoTotal-loQueDescuento;
    }
}
