package Ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Character>> mapaAsientos = inicializarMapaAsientos();

        mostrarMapa(mapaAsientos);

        boolean finalizado = false;
        while (!finalizado) {
            System.out.print("Ingresa la fila (1-5) y el número de asiento (1-5) SEPARADOS POR UN ESPACIO (o escribe 'salir' para finalizar): ");
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
        for (int i = 0; i < 5; i++) {
            ArrayList<Character> fila = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
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

            if (fila >= 0 && fila < 5 && asiento >= 0 && asiento < 5) {
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
        System.out.println("\nMapa de Asientos:");
        for (ArrayList<Character> fila : mapa) {
            System.out.print("| ");
            for (Character asiento : fila) {
                System.out.print(asiento + " | ");
            }
            System.out.println();
        }
    }
}
