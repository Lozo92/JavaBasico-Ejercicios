package com.openbootcamp;

public class EjercicioDos {

    public static void main(String[] args) {
        
        double precioFinal = precioIva(10.60, 1.21);
        System.out.println("El precio del producto con IVA incluido es: " + precioFinal);


        double Iva = cantidadIva(10.60, 0.21 );
        System.out.println("La cantidad total de IVA pagado es: " + Iva);
    }

    static double precioIva(double precio, double iva){
        return  precio * iva;
    }

    static double cantidadIva(double precio, double porcentajeIva){
        return precio * porcentajeIva;
    }
}
