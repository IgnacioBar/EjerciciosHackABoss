package Ejercicio1;

public class Auto extends Vehiculo implements Electrico {
    private int capacidadBateria;
    private int autonomia;

    public Auto(int id, String placa, String marca, String modelo, int año, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public int calcularAntiguedad() {
        return java.time.LocalDate.now().getYear() - año;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Cargando energía del auto eléctrico.");
    }
}
