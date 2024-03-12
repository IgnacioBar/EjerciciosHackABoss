package Ejercicio2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private String categoria;

    // Constructor
    public Evento(String nombre, LocalDate fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    // Método para obtener la cantidad de días hasta la fecha del evento
    public long diasHastaEvento() {
        return LocalDate.now().until(fecha, ChronoUnit.DAYS);
    }

    @Override
    public String toString() {
        return "\nNombre = " + nombre +
                "\nFecha = " + fecha +
                "\nCategoria = " + categoria;
    }
}
