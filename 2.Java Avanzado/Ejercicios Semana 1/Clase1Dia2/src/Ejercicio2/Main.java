package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir un producto");
            System.out.println("2. Mostrar todos los productos");
            System.out.println("0. Salir");

            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el precio del producto: ");
                        if (scanner.hasNextDouble()) {
                            double precio = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Ingrese la cantidad del producto: ");
                            if (scanner.hasNextInt()) {
                                int cantidad = scanner.nextInt();
                                scanner.nextLine();

                                inventario.agregarProducto(nombre, precio, cantidad);
                            } else {
                                System.out.println("\nError: La cantidad debe ser un número entero.");
                                scanner.nextLine();
                            }
                        } else {
                            System.out.println("\nError: El precio debe ser un número decimal.");
                            scanner.nextLine();
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("\nError al agregar producto: " + e.getMessage());
                    }
                    break;

                case 2:
                    inventario.mostrarInventario();
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
