package Ejercicio2;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Ejercicio Nº 2 - Gestor de Eventos - Individual

Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones utilizando Streams y Optionals:

    - Filtra los eventos que están programados para una fecha específica.

    - Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.

    - Encuentra el evento más próximo en el tiempo utilizando Optionals.
 */

public class Main {

    public static void main(String[] args) {
        List<Evento> eventos = List.of(
                new Evento("Reunión Equipo", LocalDate.of(2024, 3, 15), "Reunión"),
                new Evento("Conferencia Tech", LocalDate.of(2024, 3, 20), "Conferencia"),
                new Evento("Taller Programación", LocalDate.of(2024, 3, 25), "Taller"),
                new Evento("Presentación Proyecto", LocalDate.of(2024, 3, 18), "Presentación")
        );

        // Filtra los eventos que están programados para una fecha específica.
        LocalDate fechaEspecifica = LocalDate.of(2024, 3, 20);
        List<Evento> eventosEnFecha = eventos.stream()
                .filter(evento -> evento.getFecha().equals(fechaEspecifica))
                .toList();

        System.out.println("\nEventos en la fecha " + fechaEspecifica + ":\n ");
        eventosEnFecha.forEach(evento ->
                System.out.println(evento.toString().substring(1, evento.toString().length() - 1)));


        // Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        Map<String, Long> cantidadEventosPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));

        System.out.println("\n---------------------------------------");
        System.out.println("Cantidad de eventos por categoría:\n ");
        cantidadEventosPorCategoria.forEach((categoria, cantidad) ->
                System.out.println(categoria + ": " + cantidad));

        // Encuentra el evento más próximo en el tiempo utilizando Optionals.
        Optional<Evento> eventoMasProximo = eventos.stream()
                .min(java.util.Comparator.comparing(Evento::diasHastaEvento));

        System.out.println("\n---------------------------------------");
        if (eventoMasProximo.isPresent()) {
            System.out.println("Evento más próximo en el tiempo:\n " + eventoMasProximo.get());
        } else {
            System.out.println("No hay eventos.\n");
        }
    }
}