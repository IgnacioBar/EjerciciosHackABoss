package Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Ejercicio Nº 1 - Empleados - Individual

Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones utilizando Streams y Optionals:

    - Filtra los empleados cuyo salario sea mayor a cierto valor específico.

    - Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.

    - Encuentra al empleado con el salario más alto utilizando Optionals.
 */

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Juan", 50000, "Desarrollador"),
                new Empleado("Ana", 60001, "Analista"),
                new Empleado("Carlos", 75000, "Gerente"),
                new Empleado("Maria", 55000, "Desarrollador")
        );

        // Filtra los empleados cuyo salario sea mayor a cierto valor específico.
        List<Empleado> empleadosFiltrados = empleados.stream()
                .filter(empleado -> empleado.getSalario() > 60000)
                .toList();
        System.out.println("\nEmpleados con salario mayor a 60000: ");
        empleadosFiltrados.forEach(empleado ->
                System.out.println("\n" + empleado.toString().substring(1, empleado.toString().length() - 1)));


        // Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        Map<String, Double> salarioPromedioPorCategoria = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));
        System.out.println("\nSalario promedio por categoría:\n ");
        salarioPromedioPorCategoria.forEach((categoria, salarioPromedio) ->
                System.out.println(categoria + ": " + salarioPromedio));

        // Encuentra al empleado con el salario más alto utilizando Optionals.
        Optional<Empleado> empleadoConMayorSalario = empleados.stream()
                .max(java.util.Comparator.comparing(Empleado::getSalario));
        if (empleadoConMayorSalario.isPresent()) {
            System.out.println("Empleado con salario más alto: " + empleadoConMayorSalario.get());
        } else {
            System.out.println("No hay empleados.");
        }
    }

}
