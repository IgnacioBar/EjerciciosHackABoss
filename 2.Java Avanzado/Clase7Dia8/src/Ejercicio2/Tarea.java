package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    public void imprimirTarea(int nivel) {
        imprimirIndentacion(nivel);
        System.out.println("- " + nombre);
        for (Tarea subtarea : subtareas) {
            subtarea.imprimirTarea(nivel + 1);
        }
    }

    private void imprimirIndentacion(int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
    }
}
