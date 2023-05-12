package com.Abstractas.ModelosEjercicio1;

public class PlantaTropical extends Planta {
    private int humedad;

    public PlantaTropical(String nombre, String especie, int altura, int humedad) {
        super(nombre, especie, altura);
        this.humedad = humedad;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        humedad += cantidad;
        System.out.println(getNombre() + " ha sido regada con " + cantidad + " ml de agua durante " + tiempo + " minutos. La humedad actual es de " + humedad + ".");
    }
}
