package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        try {
            reservarVuelo("Juan Pérez", "Cancún", "2024-04-15", 3, 2); // Intenta reservar más asientos de los disponibles
        } catch (ReservaInvalidaException e) {
            System.out.println("Error en la reserva: " + e.getMessage());
        }

        try {
            reservarVuelo("", "", "", 2, 5); // Falta información
        } catch (ReservaInvalidaException e) {
            System.out.println("Error en la reserva: " + e.getMessage());
        }

        try {
            reservarVuelo("Ignacio Barbeyto", "Madrid", "2024-12-12", 2, 5); // Bien
        } catch (ReservaInvalidaException e) {
            System.out.println("Error en la reserva: " + e.getMessage());
        }
    }
    public static void reservarVuelo(String nombre, String destino, String fechaDeViaje, int numeroDeAsientos, int asientosDisponibles) throws ReservaInvalidaException {
        if (nombre == null || nombre.isEmpty() || destino == null || destino.isEmpty() || fechaDeViaje == null || fechaDeViaje.isEmpty()) {
            throw new ReservaInvalidaException("faltaInformacion", nombre, destino, fechaDeViaje);
        }

        if (numeroDeAsientos > asientosDisponibles) {
            throw new ReservaInvalidaException("asientosInsuficientes", numeroDeAsientos, asientosDisponibles);
        }

        System.out.println("Reserva realizada exitosamente para " + nombre + ". Destino: " + destino + ", Fecha: " + fechaDeViaje + ", Asientos: " + numeroDeAsientos + ".");
    }
}