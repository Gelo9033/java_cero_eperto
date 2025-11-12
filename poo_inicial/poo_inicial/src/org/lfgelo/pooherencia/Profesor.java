package org.lfgelo.pooherencia;

public class Profesor extends Persona {
    private String materia;

    
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    

    public Profesor(String nombre, String apellido, String materia) {
        super(nombre, apellido);
        this.materia = materia;
    }



    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String saludar() {
        String saludar= super.saludar();
       return saludar+"soy un profesor";
    }
}
