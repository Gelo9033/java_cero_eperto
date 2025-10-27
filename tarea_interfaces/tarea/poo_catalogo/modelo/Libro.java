package tarea_interfaces.tarea.poo_catalogo.modelo;

import java.util.Date;

public class Libro extends Producto implements IProducto, ILibro {
    double precioVenta;
    Date fechaPublicacion = new Date();
    String autor;
    String titulo;
    String editorial;

    

    public Libro(double precioBase, String autor, String titulo,String editorial) {
        super(precioBase);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.15;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", fechaPublicacion=" + fechaPublicacion +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'';
    }
}
