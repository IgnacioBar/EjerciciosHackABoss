package Ejercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Ejercicio Nº 4 - Operaciones de Lectura - Grupal

Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos:
suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.*/
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0, numero2 = 0;
        boolean datosValidos = false;

        while (!datosValidos) {
            try {
                System.out.print("Ingrese el primer número: ");
                numero1 = scanner.nextInt();

                System.out.print("Ingrese el segundo número: ");
                numero2 = scanner.nextInt();

                datosValidos = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese números enteros válidos.");
                scanner.next();
            }
        }

        int suma = sumar(numero1, numero2);
        int resta = restar(numero1, numero2);
        int multiplicacion = multiplicar(numero1, numero2);
        double division = dividir(numero1, numero2);

        System.out.println("\n------------RESULTADOS------------");
        System.out.println("Resultado de la Suma: " + suma);
        System.out.println("Resultado de la Resta: " + resta);
        System.out.println("Resultado de la Multiplicación: " + multiplicacion);

        if (!Double.isNaN(division)) {
            System.out.println("Resultado de la División: " + division);
        } else {
            System.out.println("No es posible dividir entre cero.");
        }
        System.out.println("----------------------------------");

        scanner.close();
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            return Double.NaN;
        } else {
            return (double) a / b;
        }
    }
}


