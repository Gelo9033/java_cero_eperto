package org.lfgelo.pooherencia;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private double notaIdiomas;

    
    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    
    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        String saludar= super.saludar();
       return saludar+"soy un alumno internacional";
    }


    @Override
    public double calcularPromedio() {
        return (super.calcularPromedio()+this.notaIdiomas)/4;
    }

    

}
