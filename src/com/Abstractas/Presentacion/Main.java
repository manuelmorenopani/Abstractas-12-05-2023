package com.Abstractas.Presentacion;
import com.Abstractas.ModelosEjercicio1.Cactus;
import com.Abstractas.ModelosEjercicio1.Planta;
import com.Abstractas.ModelosEjercicio1.PlantaTropical;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Planta planta1 = new PlantaTropical("Planta 1", "Tropicalis", 20, 50);
        Planta planta2 = new Cactus("Planta 2", "Cactaceae", 30, true);

        planta1.crecer(5);
        planta1.regar(100, 10);

        planta2.crecer(3);
        planta2.regar(50, 5);

    }
}