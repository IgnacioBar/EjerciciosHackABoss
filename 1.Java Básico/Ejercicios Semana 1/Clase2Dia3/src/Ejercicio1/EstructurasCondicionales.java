package Ejercicio1;

import java.util.Scanner;

public class VerificacionEdadRecital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes ingresar al recital. ¡Disfruta del evento!");
        } else {
            System.out.println("Lo siento, eres menor de 18 años. No puedes ingresar al recital.");
        }

        scanner.close();
    }
}
