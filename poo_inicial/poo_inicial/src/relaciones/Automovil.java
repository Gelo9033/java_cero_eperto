package relaciones;

public class Automovil {

    private String marca;
    private String modelo;
    private Motor motor;
    private Tanque tanque;
    private Persona propietario;
    private Rueda[] ruedas;
    private TipoVehiculo tipoVehiculo;

     public Automovil(String marca, String modelo, Motor motor, Tanque tanque, Persona propietario) {
        this(marca, modelo, motor, tanque, propietario, TipoVehiculo.SEDAN, null);
    }

    public Automovil(String marca, String modelo, Motor motor, Tanque tanque, Persona propietario, TipoVehiculo tipoVehiculo, Rueda[] ruedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tanque = tanque;
        this.propietario = propietario;
        this.tipoVehiculo = tipoVehiculo;

        if (ruedas == null) {
            int n = tipoVehiculo.getNumeroLlantas();
            this.ruedas = new Rueda[n];
            for (int i = 0; i < n; i++) {
                this.ruedas[i] = new Rueda("desconocido", "desconocido", 16, 205.0, tipoVehiculo.getPresionNeumatica());
            }
        } else {
            if (ruedas.length != tipoVehiculo.getNumeroLlantas()) {
                throw new IllegalArgumentException("Se esperaban " + tipoVehiculo.getNumeroLlantas() + " ruedas");
            }
            this.ruedas = ruedas;
        }
    }

    
    public String ingresarPresiones(double[] presiones) {
        if (presiones == null) {
            return "Presiones nulas";
        }
        if (presiones.length != tipoVehiculo.getNumeroLlantas()) {
            return "Se esperaban " + tipoVehiculo.getNumeroLlantas() + " llantas, recibió " + presiones.length;
        }

        
        if (this.ruedas == null) {
            this.ruedas = new Rueda[presiones.length];
            for (int i = 0; i < presiones.length; i++) {
                this.ruedas[i] = new Rueda("desconocido", "desconocido", 16, 205.0, presiones[i]);
            }
        } else {
            for (int i = 0; i < presiones.length; i++) {
                Rueda r = this.ruedas[i];
                this.ruedas[i] = new Rueda(r.getFabricante(), r.getMarca(), r.getRing(), r.getAncho(), presiones[i]);
            }
        }

        return tipoVehiculo.validarPresiones(presiones);
    }

    public String validarPresiones() {
        if (ruedas == null) {
            return "No hay ruedas registradas";
        }
        double[] pres = new double[ruedas.length];
        for (int i = 0; i < ruedas.length; i++) {
            pres[i] = ruedas[i].getPresionNeumatica();
        }
        return tipoVehiculo.validarPresiones(pres);
    }

    public String getDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalles de Automovil: ").append(this.marca).append('\n')
          .append("Modelo: ").append(this.modelo).append('\n')
          .append("Motor: ").append(this.motor != null ? this.motor.getCilindrada() : "N/A").append('\n')
          .append("Tanque: ").append(this.tanque != null ? this.tanque.getCapacidadGalones() : "N/A").append('\n')
          .append("Propietario: ").append(this.propietario != null ? this.propietario.toString() : "N/A").append('\n')
          .append("Ruedas:\n");
        if (ruedas != null) {
            for (int i = 0; i < ruedas.length; i++) {
                sb.append("  R").append(i + 1).append(" -> ").append(ruedas[i].detalleRueda()).append('\n');
            }
        } else {
            sb.append("  No registradas\n");
        }
        return sb.toString();
    }
}
