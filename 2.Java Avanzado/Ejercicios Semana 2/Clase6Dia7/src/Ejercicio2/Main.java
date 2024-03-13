package Ejercicio2;

/*
Ejercicio 2: Veterinaria

Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, para ello, se solicita la definición de una
clase genérica Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o id de mascota para identificar a cada una).
Crea una clase utilitaria propia llamada RegistroMascotas que cuente con métodos genéricos para:

    - Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular colecciones como ArrayList
      o LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).

    - Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos para realizar búsquedas
      eficientes por nombre o especie dentro del registro de mascotas.

    - Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de la colección y contar la cantidad total
      de mascotas registradas en la veterinaria.

    - Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios, como nombres, edades o especies,
     para agregar mascotas al registro.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegistroMascotas registro = new RegistroMascotas();

        registro.agregarMascota(new Mascota<>("Rex", 5, "Perro", "Labrador"));
        registro.agregarMascota(new Mascota<>("Whiskers", 3, "Gato", "Siames"));

        System.out.println("---------------------------------------");
        System.out.println("Todas las mascotas registradas:");
        registro.imprimirMascotas();

        System.out.println("---------------------------------------");
        System.out.println("Mascotas con nombre 'Rex':");
        List<Mascota<?>> mascotasConNombre = registro.buscarPorNombre("Rex");
        for (Mascota<?> mascota : mascotasConNombre) {
            System.out.println(mascota);
        }

        System.out.println("---------------------------------------");
        System.out.println("Mascotas de la especie 'Gato':");
        List<Mascota<?>> mascotasDeEspecie = registro.buscarPorEspecie("Gato");
        for (Mascota<?> mascota : mascotasDeEspecie) {
            System.out.println(mascota);
        }

        System.out.println("---------------------------------------");
        System.out.println("Añadiendo mascotas aleatorias...");
        for (int i = 0; i < 3; i++) {
            registro.generarMascotaAleatoria();
        }

        System.out.println("---------------------------------------");
        System.out.println("Todas las mascotas registradas:");
        registro.imprimirMascotas();

        System.out.println("---------------------------------------");
        System.out.println("Total de mascotas registradas: " + registro.contarMascotas());
        System.out.println("---------------------------------------");

    }
}
