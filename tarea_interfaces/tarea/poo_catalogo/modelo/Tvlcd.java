package tarea_interfaces.tarea.poo_catalogo.modelo;

public class Tvlcd extends Electronico {
    private double pulgadas;
    


    public Tvlcd(String fabricante, double precioBase, double pulgadas) {
        super(fabricante, precioBase);
        this.pulgadas = pulgadas;
       
    }

    public double getPulgadas() {
        return this.pulgadas;
    }

   
   @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.8;
    }

     @Override
    public String toString() {
        return super.toString() +
                ", pulgadas=" + pulgadas;
    }

}
