package org.lfgelo.interfaces.imprenta.modelo;

public abstract class Hoja {
    protected String contenido;

    //Constructor
    public Hoja(String contenido) {
        this.contenido = contenido;
    }



    //Metodo abstracto
    abstract public String imprimir();



}
