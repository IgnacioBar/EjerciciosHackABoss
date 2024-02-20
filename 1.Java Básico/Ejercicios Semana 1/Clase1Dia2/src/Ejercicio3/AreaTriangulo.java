package Ejercicio3;
import java.util.Scanner;

/*Ejercicio Nº 3 - Variables y Operadores - Individual
Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla..
Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).*/

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }
}
