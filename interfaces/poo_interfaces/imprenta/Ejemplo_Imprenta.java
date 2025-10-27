package interfaces.poo_interfaces.imprenta;

import java.lang.ProcessHandle.Info;

import interfaces.poo_interfaces.imprenta.modelo.Curriculo;
import interfaces.poo_interfaces.imprenta.modelo.Hoja;
import interfaces.poo_interfaces.imprenta.modelo.Imprimible;
import interfaces.poo_interfaces.imprenta.modelo.Informe;
import interfaces.poo_interfaces.imprenta.modelo.Libro;
import interfaces.poo_interfaces.imprenta.modelo.Pagina;

public class Ejemplo_Imprenta {
    public static void main(String[] args) {
        Curriculo cv= new Curriculo("Ingeniero de Sistemas con 5 años de experiencia", "Luis Felipe Gelo", "Ingeniero de Sistemas", null);
        cv.agregarHabilidad("Desarrollo de Software")
          .agregarHabilidad("Base de Datos")
          .agregarHabilidad("Inglés Intermedio");

        imprimir(cv);

        Libro libro = new Libro(Tipo_Libro.HISTORIA, "El Quijote de la Mancha", "Miguel de Cervantes");
        libro.agregarPagina(new Pagina("en algun lugar del mundo "))
                .agregarPagina(new Pagina("habia un ingeniero de sistemas que aprendia java"))
                .agregarPagina(new Pagina("y vivio feliz para siempre"));
        imprimir(libro);

        Informe informe = new Informe("Este es el contenido del informe", "Luis Felipe Gelo", "Ana Maria Perez");
        imprimir(informe);
    }

    public static void imprimir(Imprimible hoja){
        System.out.println(hoja.imprimir());
    }

}
