package Ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Character>> mapaAsientos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ArrayList<Character> fila = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                fila.add('O');
            }
            mapaAsientos.add(fila);
        }

        mostrarMapa(mapaAsientos);

        boolean finalizado = false;
        while (!finalizado) {
            System.out.print("Ingresa la fila (1-5) y el número de asiento (1-5) SEPARADOS POR UN ESPACIO (o escribe 'salir' para finalizar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                finalizado = true;
            } else {
                try {
                    String[] partes = entrada.split(" ");
                    int fila = Integer.parseInt(partes[0]) - 1;
                    int asiento = Integer.parseInt(partes[1]) - 1;

                    if (fila >= 0 && fila < 5 && asiento >= 0 && asiento < 5) {
                        if (mapaAsientos.get(fila).get(asiento) == 'O') {
                            mapaAsientos.get(fila).set(asiento, 'X');
                            System.out.println("¡Asiento reservado con éxito!");
                            mostrarMapa(mapaAsientos);
                        } else {
                            System.out.println("El asiento ya está ocupado. Por favor, elige otro.");
                        }
                    } else {
                        System.out.println("La fila y el número de asiento deben estar entre 1 y 5.");
                    }
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Por favor, ingresa la fila y el número de asiento SEPARADOS POR UN ESPACIO.");
                }
            }
        }

        scanner.close();
    }

    private static void mostrarMapa(ArrayList<ArrayList<Character>> mapa) {
        System.out.println("Mapa de Asientos:");
        for (ArrayList<Character> fila : mapa) {
            for (Character asiento : fila) {
                System.out.print(asiento + " ");
            }
            System.out.println();
        }
    }
}
