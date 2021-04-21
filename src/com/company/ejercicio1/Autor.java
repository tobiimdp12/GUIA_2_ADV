package com.company.ejercicio1;

public class Autor {

    private String nombre,apellido,mail;
    private char genero;//"M o F"


    public Autor (String nombre,String apellido,String mail,char genero)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.mail=mail;
        this.genero=genero;

    }

    public void printAutor(Autor autor)
    {
        String autorPrint=String.format("{%s} {%s} {%s} {%c}",autor.nombre,autor.apellido,autor.mail,autor.genero);
        System.out.println(autorPrint);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
