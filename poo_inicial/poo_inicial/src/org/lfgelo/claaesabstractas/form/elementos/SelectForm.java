package org.lfgelo.claaesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import org.lfgelo.claaesabstractas.form.elementos.select.Opcion;

public class SelectForm extends ElementoForm {
    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm agregarOpcion(Opcion opcion) {
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("nombre= '")
            .append(this.nombre)
            .append("'>\n");
            for(Opcion opcion : this.opciones) {
                sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
                    if(opcion.isSelected()) {
                        sb.append(" selected ");
                        this.valor = opcion.getValor();
                    }
                    sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
                }
        sb.append("\n</select>");
        return sb.toString();
            
    }

}
