package com.company.ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class Libro {
    /*
    Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
precio, stock y Autor, este último posee las características de nombre, apellido,
email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
único autor. Ejecute las siguientes instrucciones:

     */
    private String titulo;
    private double precio;
    private int stock;
    public Autor autorSingle;
    List<Autor> autor=new ArrayList<Autor>();

    public Libro(String titulo ,double precio,int stock,Autor autorSingle)
    {
        this.titulo=titulo;
        this.precio=precio;
        this.stock=stock;
        this.autorSingle=autorSingle;//preguntar como seria para asignar valores a un array o list
    }
    public void añadirAutor(Autor autorToAdd)
    {
        autor.add(autorToAdd);
    }
    public void printLibro(Libro libro)
    {
        String libroPrint= String.format("{%s} {%f} {%d} {%s %s}",libro.titulo,libro.precio,libro.stock,libro.autorSingle.getNombre(),libro.autorSingle.getApellido());
        System.out.println(libroPrint);
    }
    public void printLibroG(Libro libro)
    {


        System.out.print("El libro "+libro.titulo);

        System.out.print(" de ");

        for (Autor a:
                libro.autor) {

            System.out.print(" , "+a.getNombre());
        }

        System.out.print(" Se vende a "+libro.precio);
        /*
         for (Autor a:
                libro.autor) {
            System.out.println(a.getNombre());
        }
        String libroPrint= String.format("El libro %s de %s se vende a %f pesos",
                libro.titulo,libro.autor.getNombre(),libro.precio);
        System.out.println(libroPrint);
        */

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
