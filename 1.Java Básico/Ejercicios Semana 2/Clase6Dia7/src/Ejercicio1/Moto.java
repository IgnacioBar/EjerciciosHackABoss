package Ejercicio1;

public class Moto extends Vehiculo implements Combustion {
    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int año, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public int calcularAntiguedad() {
        return java.time.LocalDate.now().getYear() - año;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la moto.");
    }
}

