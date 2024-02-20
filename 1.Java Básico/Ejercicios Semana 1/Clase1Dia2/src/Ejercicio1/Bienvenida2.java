package Ejercicio1;
import java.util.Scanner;

/*Ejercicio Nº 1 - Sintaxis básica - Individual

b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable y se muestre el mismo en el mensaje.
Por ejemplo: “Hola Eduardo, bienvenida al sistema”.*/

public class Bienvenida2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + ", bienvenido al sistema");

        scanner.close();
    }
}
