package com.ejerciciocuatro;

public class SmartPhone extends SmartDevice{

    //Atributos propios de la clase.

    boolean lectorHuellas;
    int numCamaras;
    double megapixeles;


    //Constructor vacío:
    public SmartPhone(){
    }

    //Constructor con parámetros:


    public SmartPhone(String marca, String modelo, double peso, double screenSize, String color,
                      boolean bluethooth, int diasBateria, boolean resisteAgua, boolean wifi, boolean nfc,
                      boolean lectorHuellas, int numCamaras, double megapixeles) {

        super(marca, modelo, peso, screenSize, color, bluethooth, diasBateria, resisteAgua, wifi, nfc);

        this.lectorHuellas = lectorHuellas;
        this.numCamaras = numCamaras;
        this.megapixeles = megapixeles;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", screenSize=" + screenSize +
                ", color='" + color + '\'' +
                ", bluethooth=" + bluethooth +
                ", diasBateria=" + diasBateria +
                ", resisteAgua=" + resisteAgua +
                ", wifi=" + wifi +
                ", nfc=" + nfc +
                ", lectorHuellas=" + lectorHuellas +
                ", numCamaras=" + numCamaras +
                ", megapixeles=" + megapixeles +
                '}';
    }
}
