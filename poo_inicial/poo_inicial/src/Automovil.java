public class Automovil {
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindraje;
    private int capaTanque = 45;

    public static final int VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo, String color, double cilindraje) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCapaTanque() {
        return capaTanque;
    }

    public void setCapaTanque(int capaTanque) {
        this.capaTanque = capaTanque;
    }

    // public String detallesDelAuto() {
    // StringBuilder detalles = new StringBuilder();
    // detalles.append("Fabricante: "+this.fabricante+"\n");
    // detalles.append("Modelo: "+this.modelo +"\n");
    // detalles.append("Color: "+this.color +"\n");
    // detalles.append("Cilindraje: "+this.cilindraje +"\n");
    // return detalles.toString();

    // }

    public String detallesDelAuto() {
        return "Fabricante: " + this.fabricante + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Cilindraje: " + this.cilindraje + "\n"+
                "Velocidad en ciudad"+ Automovil.VELOCIDAD_MAXIMA_CIUDAD+"\n"+
                "Velocidad en carretera"+ Automovil.VELOCIDAD_MAXIMA_CARRETERA;
            
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " ha acelerado a " + rpm + " revoluciones por minuto.";
    }

    public String frenar() {
        return "El auto " + this.fabricante + " se ha detenido.";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int kmRecorridos, float litrosConsumidos) {
        // Mantener la fórmula original pero devolver el resultado redondeado a 2
        // decimales.
        // Protección básica contra división por cero.
        if (litrosConsumidos == 0f || capaTanque == 0) {
            return 0f;
        }
        float consumo = (float) kmRecorridos / (capaTanque * litrosConsumidos);
        // Redondear a 2 decimales
        return Math.round(consumo * 100f) / 100f;
    }

}
