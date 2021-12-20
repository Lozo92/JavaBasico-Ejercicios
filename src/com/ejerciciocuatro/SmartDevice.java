package com.ejerciciocuatro;

public class SmartDevice {

    //Atributos comunes.
    String marca;
    String modelo;
    double peso;
    double screenSize;
    String color;
    boolean bluethooth;
    int diasBateria;
    boolean resisteAgua;
    boolean wifi;
    boolean nfc;

    //Constructor vacío.
    public SmartDevice(){
    }

    //Constructor con parámetros.
    public SmartDevice(String marca, String modelo, double peso, double screenSize, String color,
                       boolean bluethooth, int diasBateria, boolean resisteAgua, boolean wifi, boolean nfc) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.screenSize = screenSize;
        this.color = color;
        this.bluethooth = bluethooth;
        this.diasBateria = diasBateria;
        this.resisteAgua = resisteAgua;
        this.wifi = wifi;
        this.nfc = nfc;

    }

//Al crear el método toString, se permitirá mostrar en pantalla todos los atributos solo invocando al objeto.
    @Override
    public String toString() {
        return "SmartDevice{" +
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
                '}';
    }
}
