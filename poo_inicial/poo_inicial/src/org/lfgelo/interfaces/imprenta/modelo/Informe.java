package org.lfgelo.interfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible {

    private String autor;
    private String revisor;

    // Constructor con el contenido de la clase abstracta Hoja
    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    // se implementa el metodo abstracto de la clase Hoja
    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor + "\n" +
                "Revisado por: " + this.revisor + "\n"+ this.contenido;
    }

}
