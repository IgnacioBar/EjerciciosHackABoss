package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Tarea proyecto = new TareaImpl("Proyecto: Desarrollo de Software");

        Tarea disenoApp = new TareaImpl("Tarea Principal: Diseño de la Aplicación");
        disenoApp.agregarSubtarea(new TareaImpl("Subtarea: Crear Prototipo"));

        Tarea disenarInterfaz = new TareaImpl("Subtarea: Diseñar Interfaz");
        disenarInterfaz.agregarSubtarea(new TareaImpl("Sub-subtarea: Definir Esquema de Colores"));
        disenarInterfaz.agregarSubtarea(new TareaImpl("Sub-subtarea: Diseñar Diseño Responsivo"));
        disenoApp.agregarSubtarea(disenarInterfaz);

        disenoApp.agregarSubtarea(new TareaImpl("Subtarea: Documentar Requisitos"));

        proyecto.agregarSubtarea(disenoApp);

        proyecto.imprimirTarea(0, new StringBuilder());
    }
}