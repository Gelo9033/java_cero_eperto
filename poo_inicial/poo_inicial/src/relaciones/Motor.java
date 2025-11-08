package relaciones;

public class Motor {

    private double cilindrada;
    private TipoMotor tipo;

    public Motor() {
    }   

    public Motor(double cilindrada, TipoMotor tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

}
