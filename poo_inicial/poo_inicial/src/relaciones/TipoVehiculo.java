package relaciones;

public enum TipoVehiculo {
    SEDAN(32.5, 2, 4),
    CAMIONETA(35.0, 2, 4),
    COUPE(30.0, 2, 4),
    HATCHBACK(33.0, 2, 4),
    CONVERTIBLE(31.0, 2, 4),
    SUV(36.0, 2, 4),
    TRAILLER(40.0, 3, 6);

    private final double presionNeumatica;
    private final int numeroEjes;
    private final int numeroLlantas;

    TipoVehiculo(double presionNeumatica, int numeroEjes, int numeroLlantas) {
        this.presionNeumatica = presionNeumatica;
        this.numeroEjes = numeroEjes;
        this.numeroLlantas = numeroLlantas;
    }

    public double getPresionNeumatica() {
        return presionNeumatica;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public String validarPresiones(double[] presiones) {
        if (presiones == null) {
            return "Presiones nulas";
        }
        
        for (int i = 0; i < presiones.length; i++) {
            double p = presiones[i];
            if (p != presionNeumatica) {
                String estado = p < presionNeumatica ? "menor" : "mayor";
                return "Llanta " + (i + 1) + ": " + p + " (esperada " + presionNeumatica + ") - " + estado;
            }
        }
        return "OK";
    }}