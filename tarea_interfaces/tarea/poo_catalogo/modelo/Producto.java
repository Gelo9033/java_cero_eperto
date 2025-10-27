package tarea_interfaces.tarea.poo_catalogo.modelo;

public abstract class Producto implements IProducto {
   private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

     @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " precio=" + precio;
    }

}
