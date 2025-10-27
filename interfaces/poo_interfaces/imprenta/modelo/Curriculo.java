package interfaces.poo_interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo  extends Hoja implements Imprimible {

    private String nombre;
    private String profesion;
    private List<String> habilidades;

    public Curriculo(String contenido, String nombre, String profesion, List<String> habilidades) {
        super(contenido);
        this.nombre = nombre;
        this.profesion = profesion;
        this.habilidades = new ArrayList<>();
    }

    public Curriculo agregarHabilidad(String habilidad) {
        this.habilidades.add(habilidad);
        return this;
    }

    @Override
    public String imprimir() {
       StringBuilder sb = new StringBuilder("Curriculo vitae de : ");
       sb.append(this.nombre).append("\n")
         .append("Resumen: ").append(this.contenido).append("\n")
         .append("Profesión: ").append(this.profesion).append("\n")
         .append("Habilidades: \n");
         for (String habilidad : habilidades) {
             sb.append("- ").append(habilidad).append("\n");
         }
       return sb.toString();
    }


}
