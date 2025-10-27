package tarea_interfaces.tarea.poo_catalogo.modelo;

public class Comics extends Libro {
   
    String personaje;

    public Comics(double precioBase,String autor, String titulo,
            String editorial, String personaje) {
        super(precioBase, autor, titulo, editorial);
     
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.15;
    }

    public String getPersonaje() {
        return this.personaje;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", personaje='" + personaje + '\'';
    }

}
