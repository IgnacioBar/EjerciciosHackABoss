package Ejercicio1;

public abstract class Vehiculo {
    protected int id;
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double costo;

    public Vehiculo(int id, String placa, String marca, String modelo, int año, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.costo = costo;
    }

    public abstract int calcularAntiguedad();
}
