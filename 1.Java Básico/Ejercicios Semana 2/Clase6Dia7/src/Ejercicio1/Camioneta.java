package Ejercicio1;

public class Camioneta extends Vehiculo implements Combustion {
    private double capacidadTanque; // En litros
    private double consumoCombustible; // Km/L

    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public int calcularAntiguedad() {
        return java.time.LocalDate.now().getYear() - año;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la camioneta.");
    }
}
