package relaciones;

public class Persona {

    private String nombre;
    private String apellido;
    private String ci;

    public Persona(String nombre, String apellido, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + "\nCI: " + ci;
    }
}
