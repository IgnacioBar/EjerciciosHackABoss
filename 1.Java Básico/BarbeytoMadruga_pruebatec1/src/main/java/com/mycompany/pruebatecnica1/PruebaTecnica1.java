package com.mycompany.pruebatecnica1;
import com.mycompany.pruebatecnica1.logica.Controladora;
import com.mycompany.pruebatecnica1.logica.Empleado;
import java.util.InputMismatchException;

import java.util.List;
import java.util.Scanner;

public class PruebaTecnica1 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        Empleado emple = new Empleado();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("\n=== Menú Principal ===\n");
                System.out.println("1. Agregar un nuevo empleado");
                System.out.println("2. Listar empleados");
                System.out.println("3. Actualizar información de un empleado");
                System.out.println("4. Eliminar un empleado");
                System.out.println("5. Buscar empleados por cargo");
                System.out.println("0. Salir");
                System.out.print("\nSeleccione una opción: ");

                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("\n=== Agregar Nuevo Empleado ===\n");
                        control.crearEmpleado(emple);
                    }
                    case 2 -> {
                        List<Empleado> listaEmpleados = control.traerEmpleados();
                        for (Empleado e : listaEmpleados) {
                            System.out.println(e.toString());
                        }
                    }
                    case 3 -> {
                        System.out.println("\n=== Editar Empleado ===\n");
                        try {
                                System.out.print("ID del Empleado a Editar: ");
                                int idEditar = scanner.nextInt();
                                scanner.nextLine();
                                Empleado empleEdit = control.buscarEmpleado(idEditar);
                                if (empleEdit != null) {
                                    control.editarEmpleado(empleEdit);
                                } else {
                                    System.out.println("Empleado no encontrado.");
                                }
                            } catch (InputMismatchException ime) {
                                System.out.println("Por favor, ingrese un número válido para el ID.");
                                scanner.nextLine();
                            }
                    }
                    case 4 -> {
                            System.out.println("\n=== Eliminar Empleado ===\n");
                            try {
                                System.out.print("ID del Empleado a Eliminar: ");
                                int idEliminar = scanner.nextInt();
                                scanner.nextLine();
                                control.eliminarEmpleado(idEliminar);
                            } catch (InputMismatchException ime) {
                                System.out.println("Por favor, ingrese un número válido para el ID.");
                                scanner.nextLine();
                            }
                    }
                    case 5 -> {
                        System.out.println("\n=== Buscar Empleado Por Cargo ===");
                        System.out.print("Cargo del Empleado: ");
                        String cargo = scanner.nextLine();
                        control.buscarEmpleadoCargo(cargo);
                    }
                    case 0 -> System.out.println("Saliendo del programa. ¡Hasta luego!");
                    default ->System.out.println("Ingrese un número del 0 al 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese una opción válida.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
                scanner.nextLine();
            }
        } while (opcion != 0);
    }
}

