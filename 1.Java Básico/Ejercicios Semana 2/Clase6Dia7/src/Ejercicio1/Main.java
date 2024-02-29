package Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto(1, "ABC123", "Tesla", "Model S", 2018, 75000, 100000, 24));
        vehiculos.add(new Camioneta(2, "XYZ789", "Ford", "F-150", 2020, 30000, 80, 10));
        vehiculos.add(new Moto(3, "DEF456", "Yamaha", "YZF", 2019, 15000, 600, "4 tiempos"));

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.marca + ", Modelo: " + vehiculo.modelo + ", Antigüedad: " + vehiculo.calcularAntiguedad() + " años.");
            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarEnergia();
            } else if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }
        }
    }
}
