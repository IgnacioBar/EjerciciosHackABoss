package Ejercicio1;
import java.util.Scanner;

public class EstructurasCondicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes pasar al concierto. ¡Disfruta!");
        } else {
            System.out.println("Lo siento, eres menor de 18 años. No puedes pasar al concierto.");
        }

        scanner.close();
    }
}
