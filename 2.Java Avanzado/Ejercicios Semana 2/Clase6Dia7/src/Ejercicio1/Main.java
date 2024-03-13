package Ejercicio1;

/*
Ejercicio 1: Concesionaria de Autos

Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:

    - Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.

    - Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.

    - Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InventarioCoches inventario = new InventarioCoches();

        inventario.agregarCoche(new Coche("Toyota", "Corolla", 2020, 20000));
        inventario.agregarCoche(new Coche("Ford", "Mustang", 2021, 35000));
        inventario.agregarCoche(new Coche("Toyota", "Camry", 2022, 25000));

        System.out.println("---------------------------------------");
        System.out.println("Coches de la marca Toyota:");
        List<Coche> cochesPorMarca = inventario.buscarPorMarca("Toyota");
        for (Coche coche : cochesPorMarca) {
            System.out.println(coche);
        }

        System.out.println("---------------------------------------");
        System.out.println("Coches del año 2021:");
        List<Coche> cochesPorAnio = inventario.buscarPorAnio(2021);
        for (Coche coche : cochesPorAnio) {
            System.out.println(coche);
        }

        System.out.println("---------------------------------------");
        System.out.println("\nValor total del inventario: " + inventario.calcularValorTotal());
    }
}