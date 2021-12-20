package com.openbootcamp;

public class EjercicioSesionDos {

    public static void main(String[] args) {
        
        
        //Se invoca la función, dando valor a los parámetros requeridos, para calcula el precio con el IVA añadido.
        double precioFinal = precioIva(10.60, 1.21);
        System.out.println("El precio del producto con IVA incluido es: " + precioFinal);


        //Se invoca la función, dando valor a los parámetros requeridos, para calcular la cantidad de IVA que se pagará.
        double Iva = cantidadIva(10.60, 0.21 );
        System.out.println("La cantidad total de IVA pagado es: " + Iva);
    }

    
    //Función para calcular el precio con IVA. Devuelve un tipo double.
    static double precioIva(double precio, double iva){
        return  precio * iva;
    }

    
    //Función para calcular la cantidad de IVA a pagaar.
    static double cantidadIva(double precio, double porcentajeIva){
        return precio * porcentajeIva;
    }
}
