package com.company;
import com.company.ejercicio1.Autor;
import com.company.ejercicio1.Libro;
import com.company.ejercicio2.Cliente;
import com.company.ejercicio2.Factura;
import com.company.ejercicio2.ItemVenta;
import com.company.ejercicio3.ClienteBanco;
import com.company.ejercicio3.CuentaBancariaCliente;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // inicializo al objeto autor
        Autor autNumero1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        Autor autNumero2 = new Autor("Tobias", "Selva", "totott@email.com", 'M');
        autNumero1.printAutor(autNumero1);//lo muestro por pantalla

        // inicializo al objeto autor
        Libro libroNumero1 = new Libro("Effective Java", 450, 150, autNumero1);
        libroNumero1.añadirAutor(autNumero1);
        libroNumero1.añadirAutor(autNumero2);


        libroNumero1.printLibro(libroNumero1);//lo muestro por pantalla

        //Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        //cantidad en 50 copias.

        libroNumero1.setPrecio(500);
        libroNumero1.setStock(libroNumero1.getStock() + 50);
        libroNumero1.printLibro(libroNumero1);//lo muestro por pantalla
        //Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        //Libro “Effective Java”.

        libroNumero1.autorSingle.printAutor(autNumero1);
        //Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        //siguiente mensaje:
        //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        //libroNumero1.printLibroG(libroNumero1);
        /*
        * Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
        cambios necesarios en el método del punto g, para imprimir un nuevo
        mensaje que liste los autores que contribuyeron a ese libro.

        * */

        libroNumero1.printLibroG(libroNumero1);

        Cliente cl1=new Cliente("roman","yourName@yahoo.com",3);
        Cliente cl2=new Cliente("romana","yourNickName@yahoo.com",5);
        System.out.println(cl1.toString());

        cl2.toString();
        /*
        * Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
monto total luego de aplicarle el descuento.

        * */


        Factura f2=new Factura(cl1,2500);

        //aniado los items que compro el cliente
        ItemVenta item=new ItemVenta("tomate","la mejor fruta/verdura",200);
        System.out.println(item.toString());
        f2.addItem(item);
        ItemVenta item2=new ItemVenta("lechuga","la mejor verdura",300);
        System.out.println(item2.toString());
        item2.toString();
        ItemVenta item3=new ItemVenta("pizza","la mejor cena",500);
        System.out.println(item3.toString());
        item3.toString();

           /*Cree un método que facilite la impresión del objeto de tipo Factura y que
        siga el siguiente formato.
        Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,
        email=?, descuento=?]]*/
        f2.toString();
        System.out.println("monto sin descuento "+f2.calcularMontoTotal());
        System.out.println("monto con descuento "+f2.calcularDescuento(f2.montoTotal, cl1.getDescuento()));

        ClienteBanco client=new ClienteBanco("tobias",'f');
        client.toString();

        CuentaBancariaCliente cuenta=new CuentaBancariaCliente(10000,client);


        /*
        *  Analice cómo implementaría con las herramientas conocidas hasta el
momento, llevar un registro de como máximo 10 operaciones de depósito y
extracción que se realizaron en la cuenta. En donde se almacene en
memoria de alguna forma la siguiente cadena de texto:
i. Depósito: "El {NombreCliente}, depositó {MontoDepositado}"
ii. Extracción: "El {NombreCliente}, retiró {MontoRetirado}"
        * */
        int cantidadDeOperaciones=0;
        Scanner inputOp=new Scanner(System.in);
        int op=0;
        while(cantidadDeOperaciones<10 && op!=3)
        {
            System.out.println(op);
            System.out.println("Ingrese:" +
                    "\n 1=depositar"+
                    "\n 2=extraer"+
                    "\n 3=salir");
            op=inputOp.nextInt();
            if(cantidadDeOperaciones<10)
            {


                switch (op)
                {
                    case 1:
                        System.out.println("Ingrese la cantidad a depositar");
                        Scanner inputDepo=new Scanner(System.in);
                        double valueDep=inputDepo.nextDouble();
                        cuenta.depositar(valueDep);
                        String printDep=String.format("Deposito: El {%s}, ingreso {%.0f $}",//%.0f elimino los decimales
                                client.getNombre(),valueDep);
                        System.out.println("fff"+printDep);
                        cantidadDeOperaciones++;
                        System.out.println("operacion n° "+cantidadDeOperaciones);
                    break;

                    case 2:
                        System.out.println("Ingrese la cantidad a extraer");
                        Scanner inputExt=new Scanner(System.in);
                        double valueExt=inputExt.nextDouble();
                        cuenta.extraer(valueExt);
                        String printExtr=String.format("Extracción: El {%s}, retiró {%.0f $}",
                                client.getNombre(),valueExt);
                        System.out.println(printExtr);

                        cantidadDeOperaciones++;
                        System.out.println("operacion n° "+cantidadDeOperaciones);
                        break;

                }
            }else
            {
                System.out.println("lslslals");
            }
            //System.out.println("saliendo");
        }
        System.out.println("salir");

    }
}
