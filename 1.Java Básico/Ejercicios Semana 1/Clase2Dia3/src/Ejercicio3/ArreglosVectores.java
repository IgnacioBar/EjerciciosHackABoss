package Ejercicio3;
import java.util.Scanner;

/*Ejercicio Nº 3 - Arreglos: Vectores - Individual

Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.

Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.*/

public class ArreglosVectores {
    private static final int DIAS_SEMANA = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[DIAS_SEMANA];

        capturarTemperaturas(scanner, temperaturas);
        double promedio = calcularPromedio(temperaturas);

        System.out.printf("El promedio de las temperaturas es: %.2f%n", promedio);

        scanner.close();
    }

    private static void capturarTemperaturas(Scanner scanner, double[] temperaturas) {
        System.out.println("Ingresa las temperaturas máximas de la última semana:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Temperatura del día %d: ", i + 1);
            temperaturas[i] = scanner.nextDouble();
        }
    }

    private static double calcularPromedio(double[] temperaturas) {
        double sumaTemperaturas = 0;
        for (double temperatura : temperaturas) {
            sumaTemperaturas += temperatura;
        }
        return sumaTemperaturas / temperaturas.length;
    }
}
