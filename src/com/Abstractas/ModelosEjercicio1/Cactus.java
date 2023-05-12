package com.Abstractas.ModelosEjercicio1;

public class Cactus extends Planta {
    private boolean espinas;

    public Cactus(String nombre, String especie, int altura, boolean espinas) {
        super(nombre, especie, altura);
        this.espinas = espinas;
    }

    public boolean tieneEspinas() {
        return espinas;
    }

    public void setEspinas(boolean espinas) {
        this.espinas = espinas;
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println(getNombre() + " es un cactus y no necesita ser regado con frecuencia.");
    }
}
