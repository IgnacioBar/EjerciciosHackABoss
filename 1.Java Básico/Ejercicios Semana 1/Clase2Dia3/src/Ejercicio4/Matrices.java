package Ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;

/*Ejercicio Nº 4 - Matrices

Imagina que estás trabajando en un sistema de reservas de asientos para un teatro.
Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:

    -Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

    -Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2").
     El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.

    -Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.

    -A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.

    -Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. ¿Funciona para todos los casos?
     ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?

    -El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.*/

public class Matrices {
    private static final int MATRIZ = 5;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Character>> mapaAsientos = inicializarMapaAsientos();

        mostrarMapa(mapaAsientos);

        boolean finalizado = false;
        while (!finalizado) {
            System.out.print("\nIngresa la fila (1-" + MATRIZ + ") y el número de asiento (1-" + MATRIZ + ") SEPARADOS POR UN ESPACIO (o escribe 'salir' para finalizar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                finalizado = true;
            } else {
                procesarEntrada(entrada, mapaAsientos);
            }
        }

        scanner.close();
    }

    private static ArrayList<ArrayList<Character>> inicializarMapaAsientos() {
        ArrayList<ArrayList<Character>> mapaAsientos = new ArrayList<>();
        for (int i = 0; i < MATRIZ; i++) {
            ArrayList<Character> fila = new ArrayList<>();
            for (int j = 0; j < MATRIZ; j++) {
                fila.add('O'); // O = asiento vacío
            }
            mapaAsientos.add(fila);
        }
        return mapaAsientos;
    }

    private static void procesarEntrada(String entrada, ArrayList<ArrayList<Character>> mapaAsientos) {
        try {
            String[] partes = entrada.split(" ");
            int fila = Integer.parseInt(partes[0]) - 1;
            int asiento = Integer.parseInt(partes[1]) - 1;

            if (fila >= 0 && fila < MATRIZ && asiento >= 0 && asiento < MATRIZ) {
                if (mapaAsientos.get(fila).get(asiento) == 'O') {
                    mapaAsientos.get(fila).set(asiento, 'X'); // X = asiento ocupado
                    System.out.println("¡Asiento reservado con éxito!");
                } else {
                    System.out.println("El asiento ya está ocupado. Por favor, elige otro.");
                }
                mostrarMapa(mapaAsientos);
            } else {
                System.out.println("La fila y el número de asiento deben estar entre 1 y 5.");
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Por favor, ingresa la fila y el número de asiento SEPARADOS POR UN ESPACIO.");
        }
    }

    private static void mostrarMapa(ArrayList<ArrayList<Character>> mapa) {
        System.out.println("\n|--Mapa de Asiento--|");
        System.out.println("---------------------");
        for (ArrayList<Character> fila : mapa) {
            System.out.print("| ");
            for (Character asiento : fila) {
                System.out.print(asiento + " | ");
            }
            System.out.println();
        }
    }
}
