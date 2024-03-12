package Ejercicio1;

import java.util.Arrays;

public class ReservaInvalidaException extends Exception {
    public ReservaInvalidaException(String tipoError, Object... parametros) {
        super(generarMensaje(tipoError, parametros));
    }

    private static String generarMensaje(String tipoError, Object... parametros) {
        switch (tipoError) {
            case "faltaInformacion":
                return "Falta información esencial para la reserva.";
            case "asientosInsuficientes":
                return "No hay suficientes asientos disponibles para esta reserva. Solicitados: "
                        + parametros[0] + ", Disponibles: " + parametros[1] + ".";
            default:
                return "Error desconocido en la reserva.";
        }
    }
}