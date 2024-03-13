package Ejercicio1;

class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public Coche(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "\nMarca = " + marca +
                "\nModelo = " + modelo +
                "\nAño = " + anio +
                "\nPrecio = " + precio;
    }
}

