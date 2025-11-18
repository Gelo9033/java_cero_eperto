package org.lfgelo.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {
    private String titulo;
    private String autor;
    private Genero genero;
    List <Imprimible> paginas;
    
    public Libro(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.paginas=new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo de libro: ");
        sb.append(this.titulo).append("\n");
        sb.append("Autor: ").append(this.autor).append("\n");
        sb.append("Genero: ").append(this.genero).append("\n");
        for(Imprimible pagina : this.paginas){
            sb.append("Título de pagina: "+pagina.imprimir()).append("\n");
        }
        return sb.toString();
    }
    


}
