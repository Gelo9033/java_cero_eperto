package org.lfgelo.ejemplo;

import org.lfgelo.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno =new Alumno("Luis Felipe", "Gelo",25,"UTPL",8.5,7.0,9.0);
        

        Profesor profesor = new Profesor("Ana Maria", "Lopez");
                 profesor.setMateria("Matemáticas");

        AlumnoInternacional alumnoInt = new AlumnoInternacional("John", "Smith","USA");
        alumnoInt.setNotaIdiomas(4.5);
        //alumnoInt.setNotaMatematica(9);
        //alumnoInt.setNotaHistoria(8);



        //System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        //System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellido() + ", Materia: " + profesor.getMateria()); 
        // System.out.println("Alumno Internacional: " + alumnoInt.getNombre() +
        //                    " " + alumnoInt.getApellido() + 
        //                    "\nPaís: " + alumnoInt.getPais() + 
        //                    "\nNota Idiomas: " + alumnoInt.getNotaIdiomas()+
        //                    "\nNota Matemáticas: " + alumnoInt.getNotaMatematica()+
        //                    "\nNota Historia: " + alumnoInt.getNotaHistoria()
        //                    );
        
        imprimirPersona(alumno);
        

    }

     public static void imprimirPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre()
                + "\nApellido: " + persona.getApellido()
                + "\nEdad: " + persona.getEdad()
                + "\nDirección: " + persona.getDireccion());

        if (persona instanceof Alumno) {
            if (persona instanceof AlumnoInternacional) {
                System.out.println("\n-- Es un alumno internacional --");
  
                System.out.println("El alumno es de: " + ((AlumnoInternacional) persona).getPais());
                System.out.println("Nota de Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
            } else {
                System.out.println("\n-- Es un alumno --");
                System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
                System.out.println("\n Nota de Matemáticas: " + ((Alumno) persona).getNotaMatematica());
                System.out.println("\n Nota de Historia: " + ((Alumno) persona).getNotaHistoria());
                System.out.println("\n Nota de Lenguaje: " + ((Alumno) persona).getNotaLenguaje());
            }
            System.out.println("============== sobre escritura promedio ===============");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("============== sobre escritura promedio ===============");
        }

        if (persona instanceof Profesor) {
            System.out.println("\n-- Es un profesor --");
            System.out.println("Es profesor de: " + ((Profesor) persona).getMateria());
        }
        System.out.println("============== sobre escritura saludar ===============");
        System.out.println(persona.saludar());
        System.out.println("=============================");
    }
}

