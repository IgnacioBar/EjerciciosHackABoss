package Ejercicio2;
import java.util.Scanner;

/*Ejercicio Nº 2 - Estructuras Repetitivas - Individual

a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.

Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar.
Luego, muestra el total de la compra que debe abonar.*/

public class EstructurasRepetitivas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCompra = 0;

        System.out.println("Bienvenido al cajero del supermercado. Ingresa el precio de los productos. Para finalizar, escribe 'fin'.");

        String entradaUsuario;
        do {
            System.out.print("Precio del producto (escribe 'fin' para finalizar): ");
            entradaUsuario = scanner.next().toLowerCase();

            if (!entradaUsuario.equals("fin")) {
                try {
                    double precioProducto = Double.parseDouble(entradaUsuario);
                    if (precioProducto > 0) {
                        totalCompra += precioProducto;
                    } else {
                        System.out.println("Por favor, ingresa un número válido mayor a 0.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingresa un número válido o escribe 'fin' para finalizar.");
                }
            }
        } while (!entradaUsuario.equals("fin"));

        System.out.println("El total de la compra es: " + totalCompra + " €.");

        scanner.close();
    }
}
