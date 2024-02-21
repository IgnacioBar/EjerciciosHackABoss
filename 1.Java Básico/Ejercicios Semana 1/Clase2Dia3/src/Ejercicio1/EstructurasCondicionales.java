package Ejercicio1;
import java.util.Scanner;

/*Ejercicio Nº 1 - Estructuras Condicionales - Individual

a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que,
a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
El programa debe mostrar (según cada caso) un mensaje informando la situación.*/

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
