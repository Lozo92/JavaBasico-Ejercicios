package com.openbootcamp;
/**
 * Crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 * Las cadenas de texto vendrán de una array tipo String.
 */

import java.util.Arrays;

public class EjercicioSesionTres {

    public static void main(String[] args) {

//Utilizando el método Arrays.toString para concatenar automáticamente. Se debe importar la clase Arrays.

        String[] nombres = {"Jonathan", "Bea", "Irene", "Juan", "Carlos."};
        System.out.println(Arrays.toString(nombres));



//Utilizando el método concat.

        String[] nombresPerro = {"Tara, ", "Kronos ", "y Baco"};
        String nombresConcatenados = "";

        for (String nombre : nombresPerro) {
            nombresConcatenados = nombresConcatenados.concat(nombre);
        }
        System.out.println(nombresConcatenados);



//Utilizando la sentencia print para imprimir los elementos del array en una misma línea. Sin concatenar.
        String[] saludos = {"Hola ", "a todos, ", "mi nombre es: ", "Jonathan."};

        for (String saludo : saludos) {
            System.out.print(saludo);
        }
    }
}
