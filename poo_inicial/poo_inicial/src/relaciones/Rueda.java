package relaciones;

public class Rueda {
    private String fabricante;
    private String marca;
    private int ring;
    private double ancho;

    public Rueda(String fabricante, String marca, int ring, double ancho) {
        this.fabricante = fabricante;
        this.marca = marca;
        this.ring = ring;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getMarca() {
        return marca;
    }
    public int getRing() {
        return ring;
    }
    public double getAncho() {
        return ancho;
    }



}
