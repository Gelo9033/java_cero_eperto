package tarea_interfaces.tarea.poo_catalogo.modelo;

public class Iphone extends Electronico  {
    String color;
    String modelo;

    public Iphone(String fabricante, String modelo, String color, double precioBase) {
        super(fabricante, precioBase);
        this.modelo = modelo;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public String getModelo() {
        return modelo;
    }

     @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.15;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'';
    }
}
