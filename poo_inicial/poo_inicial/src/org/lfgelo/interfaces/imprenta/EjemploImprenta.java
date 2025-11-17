package org.lfgelo.interfaces.imprenta;

import org.lfgelo.interfaces.imprenta.modelo.Curriculo;
import org.lfgelo.interfaces.imprenta.modelo.Genero;
import org.lfgelo.interfaces.imprenta.modelo.Hoja;
import org.lfgelo.interfaces.imprenta.modelo.Imprimible;
import org.lfgelo.interfaces.imprenta.modelo.Informe;
import org.lfgelo.interfaces.imprenta.modelo.Libro;
import org.lfgelo.interfaces.imprenta.modelo.Pagina;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv =new Curriculo("Contenido del curriculo", "Luis Felipe Gelo", "Ingenieria en Sistemas")
                .agregarExperiencia("Desarrollador Java en Empresa X")
                .agregarExperiencia("Analista de Sistemas en Empresa Y");
        
    Informe informe = new Informe("Contenido del informe", "Ana Perez", "Carlos Lopez");
    Libro libro= new Libro("El Quijote", "Miguel de Cervantes",Genero.NOVELA);
    libro.addPagina(new Pagina("En un lugar de La Mancha..."))
          .addPagina(new Pagina("No ha mucho tiempo que vivia un hidalgo..."));
    imprimir(libro);
            }

    public static void imprimir(Imprimible imprimir){
        System.out.println(imprimir.imprimir());
    }

}
