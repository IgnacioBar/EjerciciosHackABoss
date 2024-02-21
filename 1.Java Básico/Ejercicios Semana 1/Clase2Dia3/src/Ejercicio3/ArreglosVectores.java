package Ejercicio3;
import java.util.Scanner;

public class ArreglosVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diasSemana = 7;
        double[] temperaturas = new double[diasSemana];

        System.out.println("Ingresa las temperaturas máximas de la última semana:");

        for (int i = 0; i < diasSemana; i++) {
            System.out.print("Temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        double sumaTemperaturas = 0;
        for (int i = 0; i < diasSemana; i++) {
            sumaTemperaturas += temperaturas[i];
        }

        double promedio = sumaTemperaturas / diasSemana;

        System.out.println("El promedio de las temperaturas es: " + promedio);

        scanner.close();
    }
}
