package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Tarea proyecto = new Tarea("Proyecto Final");
        Tarea investigacion = new Tarea("Investigación");
        Tarea desarrollo = new Tarea("Desarrollo");
        Tarea testing = new Tarea("Testing");

        proyecto.agregarSubtarea(investigacion);
        proyecto.agregarSubtarea(desarrollo);
        proyecto.agregarSubtarea(testing);

        investigacion.agregarSubtarea(new Tarea("Recopilar materiales"));
        investigacion.agregarSubtarea(new Tarea("Leer artículos"));

        desarrollo.agregarSubtarea(new Tarea("Implementar funcionalidades"));
        desarrollo.agregarSubtarea(new Tarea("Revisión de código"));

        testing.agregarSubtarea(new Tarea("Tests unitarios"));
        testing.agregarSubtarea(new Tarea("Tests de integración"));

        proyecto.imprimirTarea(0);
    }
}
