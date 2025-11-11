package org.lfgelo.factura.modelo;
public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    public static int ultimoCodigo;

    public Producto() {
        this.codigo= ++ultimoCodigo;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
       
    }
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
