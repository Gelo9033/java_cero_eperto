package tarea_interfaces.tarea.poo_catalogo.modelo;

public abstract class Electronico extends Producto implements IElectronico 
{
    private String fabricante;

    public Electronico(String fabricante, double precioBase) {
        super(precioBase);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", fabricante='" + fabricante + '\'';
    }


}
