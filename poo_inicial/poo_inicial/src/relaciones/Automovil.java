package relaciones;

public class Automovil {

    private Motor motor;
    private Tanque tanque;
    private Persona propietario;
    private Rueda[] ruedas;

    public Automovil(Motor motor, Tanque tanque, Persona propietario, Rueda[] ruedas) {
        this.motor = motor;
        this.tanque = tanque;
        this.propietario = propietario;
        this.ruedas = ruedas;
    }
    

}
