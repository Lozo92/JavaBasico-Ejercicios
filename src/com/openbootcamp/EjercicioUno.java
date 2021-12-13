package com.openbootcamp;

public class EjercicioUno {

    public static void main(String[] args) {


        //DATOS PRIMITIVOS.

        //Datos Numéricos Enteros:

        byte numero1 = 4;
        short numero2 = 9;
        int numero3 = 20;
        long numero4 = 400;

        System.out.println("Los tipos de datos enteros son: ");
        System.out.println("byte: " + numero1);
        System.out.println("short: " + numero2);
        System.out.println("int: " + numero3);
        System.out.println("long: " + numero4);


        //Datos Numéricos Decimales o Punto flotante:

        float numeroDecimal1 = 4.99f;
        double numeroDecimal2 = 6.494d;

        System.out.println("Los tipos de datos decimales son: ");
        System.out.println("float: " + numeroDecimal1);
        System.out.println("double: " + numeroDecimal2);


        //Datos Booleanos:

        boolean casado = true;
        boolean divorciado = false;

        System.out.println("Los tipos de datos booleanos son: ");
        System.out.println(casado);
        System.out.println(divorciado);

        //Datos de texto:

        char letra = 'a';
        char numero0 = '5';
        char simbolo= '$';

        System.out.println("Los tipos de dato de texto son: ");
        System.out.println("char: " + letra);
        System.out.println("char numero: " + numero0);
        System.out.println("char símbolo: " + simbolo);

        String palabra = "Hola";
        String saludo = "Buenas tardes, mi nombre es Jonathan!";

        System.out.println("String palabra: " + palabra);
        System.out.println("String frase: " + saludo);


        //Datos envoltorio:

        Byte envoltorio1 = null;
        Short envoltorio2 = null;
        Integer envoltorio3 = null;
        Long envoltorio4 = null;
        Float envoltorio5 = null;
        Double envoltorio6 = null;
        Boolean envoltorio7 = null;
        Character envoltorio8 = null;

        System.out.println("Las datos envoltorios sirven para dar valor nulo a los datos primitivos: ");
        System.out.println("byte: " + envoltorio1);
        System.out.println("short: " + envoltorio2);
        System.out.println("int: " + envoltorio3);
        System.out.println("long: " + envoltorio4);
        System.out.println("float: " + envoltorio5);
        System.out.println("double: " + envoltorio6);
        System.out.println("boolean: " + envoltorio7);
        System.out.println("char: " + envoltorio8);
    }
}
