package com.ejerciciocuatro;

/**
 * Crear clase padre llamada SmartDevice.
 * Crear clases hijas: SmartPhone y SmartWatch.
 * Agregar atributos tal cual tendrían en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Crear objetos de cada clase y utilizarlos imprimiendo los valores por consola.
 *
 */

public class Main {

    public static void main(String[] args) {


        //1. Crear objetos de la clase hija SmartPhone.

        SmartPhone smartPhone = new SmartPhone();

        SmartPhone iphone11 = new SmartPhone("Apple", "iPhone11", 194.0, 6.06,
                "rojo", true, 2, true, true, true, true,
                3, 12);


        SmartPhone xiaomiRedmi10 = new SmartPhone("Xiaomi", "Redmi10", 179.0, 6.5,
                "negro", true, 4, true, true,  false, false,
                4, 48);


        //2. Crear objetos de la clase hija SmartWatch

        SmartWatch smartWatch = new SmartWatch();

        SmartWatch iWatch6 = new SmartWatch("Apple", "iWatch6", 36.5, 1.57,
                "azul", true, 1, true, true, true, true,
                true, true);


        SmartWatch sense = new SmartWatch("fitbit", "sense", 45.9, 1.79,
                "verde", false, 7, true, true, false, true,
                true, false);


        //Mostrar en pantalla los objetos creados.

        System.out.println("Las características del iPhone 11 son:");
        System.out.println("La marca es: " + iphone11.marca);
        System.out.println("El modelo es: " + iphone11.modelo);
        System.out.println("Su peso es de: " + iphone11.peso);
        System.out.println("Su pantalla es de: " + iphone11.screenSize + " pulgadas");
        System.out.println("Este modelo es de color: " + iphone11.color);
        System.out.println("Tiene bluethooth: " + iphone11.bluethooth);
        System.out.println("Su batería dura: " + iphone11.diasBateria + " días");
        System.out.println("Es resistente al agua: " + iphone11.resisteAgua);
        System.out.println("Tiene wifi: " + iphone11.wifi);
        System.out.println("Tiene nfc: " + iphone11.nfc);
        System.out.println("Tiene lector de huellas: " + iphone11.lectorHuellas);
        System.out.println("Tiene: " + iphone11.numCamaras + " cámaras");
        System.out.println("Tiene: " + iphone11.megapixeles + " megapíxeles");


        System.out.println("Las características del Xiaomi Redmi 10 son:");
        System.out.println("La marca es: " + xiaomiRedmi10.marca);
        System.out.println("El modelo es: " + xiaomiRedmi10.modelo);
        System.out.println("Su peso es de: " + xiaomiRedmi10.peso);
        System.out.println("Su pantalla es de: " + xiaomiRedmi10.screenSize + " pulgadas");
        System.out.println("Este modelo es de color: " + xiaomiRedmi10.color);
        System.out.println("Tiene bluethooth: " + xiaomiRedmi10.bluethooth);
        System.out.println("Su batería dura: " + xiaomiRedmi10.diasBateria + " días");
        System.out.println("Es resistente al agua: " + xiaomiRedmi10.resisteAgua);
        System.out.println("Tiene wifi: " + xiaomiRedmi10.wifi);
        System.out.println("Tiene nfc: " + xiaomiRedmi10.nfc);
        System.out.println("Tiene lector de huellas: " + xiaomiRedmi10.lectorHuellas);
        System.out.println("Tiene: " + xiaomiRedmi10.numCamaras + " cámaras");
        System.out.println("Tiene: " + xiaomiRedmi10.megapixeles + " megapíxeles");


        System.out.println("Las características del Smartwatch iWatch 6 son:");
        System.out.println("La marca es: " + iWatch6.marca);
        System.out.println("El modelo es: " + iWatch6.modelo);
        System.out.println("Su peso es de: " + iWatch6.peso);
        System.out.println("Su pantalla es de: " + iWatch6.screenSize + " pulgadas");
        System.out.println("Este modelo es de color: " + iWatch6.color);
        System.out.println("Tiene bluethooth: " + iWatch6.bluethooth);
        System.out.println("Su batería dura: " + iWatch6.diasBateria + " días");
        System.out.println("Es resistente al agua: " + iWatch6.resisteAgua);
        System.out.println("Tiene wifi: " + iWatch6.wifi);
        System.out.println("Tiene nfc: " + iWatch6.nfc);
        System.out.println("Tiene capacidad para hacer electros: " + iWatch6.electro);
        System.out.println("Mide el ritmo cardiaco: " + iWatch6.ritmoCardiaco);
        System.out.println("Mide la saturación de oxigeno: " + iWatch6.saturacionOxigeno);


        System.out.println("Las características del Smartwatch sense son:");
        System.out.println("La marca es: " + sense.marca);
        System.out.println("El modelo es: " + sense.modelo);
        System.out.println("Su peso es de: " + sense.peso);
        System.out.println("Su pantalla es de: " + sense.screenSize + " pulgadas");
        System.out.println("Este modelo es de color: " + sense.color);
        System.out.println("Tiene bluethooth: " + sense.bluethooth);
        System.out.println("Su batería dura: " + sense.diasBateria + " días");
        System.out.println("Es resistente al agua: " + sense.resisteAgua);
        System.out.println("Tiene wifi: " + sense.wifi);
        System.out.println("Tiene nfc: " + sense.nfc);
        System.out.println("Tiene capacidad para hacer electros: " + sense.electro);
        System.out.println("Mide el ritmo cardiaco: " + sense.ritmoCardiaco);
        System.out.println("Mide la saturación de oxigeno: " + sense.saturacionOxigeno);


        /*Al crear el método toString se puede mostrar en pantalla todas sus características sin necesidad
        de imprimirlas una a una. Solo se llamará al objeto creado.*/
        
        System.out.println(iphone11);
        System.out.println(xiaomiRedmi10);
        System.out.println(iWatch6);
        System.out.println(sense);
    }
}
