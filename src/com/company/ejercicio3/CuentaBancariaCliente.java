package com.company.ejercicio3;

import java.util.UUID;

public class CuentaBancariaCliente {
    private String id = UUID.randomUUID().toString().substring(0, 8);//genero un codigo random de 8 caracteres
    private  double balance;
    public ClienteBanco clienteDuenio;
    public  double saldoDeudor;

    public CuentaBancariaCliente (double balance , ClienteBanco cliente)
    {
        this.balance=balance;
        this.clienteDuenio=cliente;
    }

    public void depositar(double montoAdepositar)
    {

        this.balance+=montoAdepositar;
        System.out.println("plata ingresada");
    }
    /*
    * Es necesario agregar una variante de Cuenta que permita un saldo deudor,
de máximo 2000 pesos. Esto significa que la cuenta puede aceptar un
balance negativo con un máximo de - 2000. Realice los cambios y pruebas
necesarias.

    * */
    public void extraer(double montoAextraer)
    {
        if(balance>=montoAextraer)
        {//     200  -    2000=-1800
            this.balance-=montoAextraer;
        }else if(saldoDeudor>=-2000)
        {// -1800
            saldoDeudor+=this.balance-montoAextraer;

        }else
        {
            System.out.println("Error usted no posee el saldo suficiente para realizar esta operacion :(");
        }

    }

}

