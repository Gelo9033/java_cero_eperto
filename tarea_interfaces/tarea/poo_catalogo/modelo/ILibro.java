package tarea_interfaces.tarea.poo_catalogo.modelo;

import java.util.Date;

public interface ILibro {
    Date getFechaPublicacion();
    String getAutor();
    String getTitulo();
    String getEditorial();
}
