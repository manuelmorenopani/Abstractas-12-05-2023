package com.Abstractas.ModelosEjercicio1;

public abstract class Planta {
    private String nombre;
    private String especie;
    private int altura;

    public Planta(String nombre, String especie, int altura) {
        this.nombre = nombre;
        this.especie = especie;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crecer(int cantidad) {
        altura += cantidad;
        System.out.println(nombre + " ha crecido " + cantidad + " cm y ahora mide " + altura + " cm.");
    }

    public abstract void regar(int cantidad, int tiempo);
}
