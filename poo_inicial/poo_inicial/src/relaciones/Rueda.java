package relaciones;

public class Rueda {
    private String fabricante;
    private String marca;
    private int ring;
    private double ancho;
    private double presionNeumatica;

    public Rueda(String fabricante, String marca, int ring, double ancho, double presionNeumatica) {
        this.fabricante = fabricante;
        this.marca = marca;
        this.ring = ring;
        this.ancho = ancho;
        this.presionNeumatica=presionNeumatica;
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
     public double getPresionNeumatica() {
        return presionNeumatica;
    }

    public String detalleRueda() {
        return 
                "Fabricante = " + fabricante + '\n' +
                "Marca = " + marca + '\n' +
                "Ring = " + ring +'\n' +
                "Ancho = " + ancho+'\n'+
                "Presion Neumatica = " + presionNeumatica + '\n';
    }



}
