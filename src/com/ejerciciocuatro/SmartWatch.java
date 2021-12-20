package com.ejerciciocuatro;

public class SmartWatch extends SmartDevice{

    //Atributos propios.

    boolean electro;
    boolean ritmoCardiaco;
    boolean saturacionOxigeno;


    //Constructor vacío:
    public SmartWatch(){
    }

    //Constructor con parámetros:

    public SmartWatch(String marca, String modelo, double peso, double screenSize, String color,
                      boolean bluethooth, int diasBateria, boolean resisteAgua, boolean wifi, boolean nfc,
                      boolean electro, boolean ritmoCardiaco, boolean saturacionOxigeno) {

        super(marca, modelo, peso, screenSize, color, bluethooth, diasBateria, resisteAgua, wifi, nfc);
        this.electro = electro;
        this.ritmoCardiaco = ritmoCardiaco;
        this.saturacionOxigeno = saturacionOxigeno;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
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
                ", electro=" + electro +
                ", ritmoCardiaco=" + ritmoCardiaco +
                ", saturacionOxigeno=" + saturacionOxigeno +
                '}';
    }
}
