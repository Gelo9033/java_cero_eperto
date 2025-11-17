package org.lfgelo.claaesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.lfgelo.claaesabstractas.form.elementos.select.Opcion;

public class EjemploFormMain {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("correo", "email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("experiencia", 5, 9);
        SelectForm lenguaje = new SelectForm("lenguaje");
        //Opcion java = new Opcion("1", "Java");
        lenguaje.agregarOpcion(new Opcion("1", "Java"))
                .agregarOpcion(new Opcion("2", "Python"))
                .agregarOpcion(new Opcion("3", "JavaScript"))
                .agregarOpcion(new Opcion("4", "TypeScript").setSelected(true))
                .agregarOpcion(new Opcion("5", "C#"));

        username.setValor("lfgelo");
        password.setValor("12345");
        email.setValor("lfgelo@gmail.com");
        edad.setValor("28");
        experiencia.setValor("... experiencia en ...");
        // java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(
                username,
                password,
                email,
                edad,
                experiencia,
                lenguaje);

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>"); 
        });

        }

    }


