package org.lfgelo.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {
    
    private String persona;
    private String carrera;
    private List<String> experiencias;

    // Constructor con el contenido de la clase abstracta Hoja
    public Curriculo(String contenido, String nombre, String titulo) {
        super(contenido);
        this.persona = nombre;
        this.carrera = titulo;
        this.experiencias = new ArrayList<>(); // Inicializar la lista de experiencias
    }


    // Metodo para agregar experiencia
    public Curriculo agregarExperiencia(String experiencia) {
        this.experiencias.add(experiencia);
        return this;
    }

    // se implementa el metodo abstracto de la clase Hoja
    @Override
    public String imprimir() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Curriculo de: ").append(this.persona).append("\n")
                    .append("Carrera: ").append(this.carrera).append("\n")
                    .append("Experiencias: \n");
        for (String exp : this.experiencias) {
            resultado.append("- ").append(exp).append("\n");
    }
    return resultado.toString();

}}
