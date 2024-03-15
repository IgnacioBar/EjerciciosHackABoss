package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public interface Tarea {
    void agregarSubtarea(Tarea subtarea);
    List<Tarea> getSubtareas();
    void imprimirTarea(int nivel, StringBuilder prefijo);
}

class TareaImpl implements Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    public TareaImpl(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void imprimirTarea(int nivel, StringBuilder prefijo) {
        System.out.println(prefijo.toString() + nombre);
        for (int i = 0; i < subtareas.size(); i++) {
            StringBuilder nuevoPrefijo = new StringBuilder(prefijo);
            nuevoPrefijo.append(i == subtareas.size() - 1 ? "    " : "|   ");
            nuevoPrefijo.append("|-- ");
            subtareas.get(i).imprimirTarea(nivel + 1, nuevoPrefijo);
        }
    }
}