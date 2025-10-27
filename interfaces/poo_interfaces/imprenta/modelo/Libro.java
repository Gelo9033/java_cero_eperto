package interfaces.poo_interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

import interfaces.poo_interfaces.imprenta.Tipo_Libro;

public class Libro implements Imprimible {

    private List <Imprimible> paginas;
    private Tipo_Libro tipo;
    private String titulo;
    private String autor;

    public Libro( Tipo_Libro tipo, String titulo, String autor) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }
     public Libro agregarPagina(Imprimible pagina) {
         this.paginas.add(pagina);
         return this;
     }

    public String imprimir() {
        StringBuilder sb = new StringBuilder("Libro: " + this.titulo + "\n");
        sb.append("Autor: ").append(this.autor).append("\n");
        sb.append("Tipo: ").append(this.tipo).append("\n");
        sb.append("Contenido:\n");
        for (Imprimible pagina : paginas) {
            sb.append(pagina.imprimir()).append("\n");
        }
        return sb.toString();   


}}
