package Ejercicio2;

public class Mascota<T> {
    private static int contadorId = 0;
    private final int id;
    private String nombre;
    private int edad;
    private String especie;
    private T detalleEspecie;

    public Mascota(String nombre, int edad, String especie, T detalleEspecie) {
        this.id = ++contadorId; // Incrementa y asigna un ID único
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.detalleEspecie = detalleEspecie;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public T getDetalleEspecie() {
        return detalleEspecie;
    }

    public void setDetalleEspecie(T detalleEspecie) {
        this.detalleEspecie = detalleEspecie;
    }

    @Override
    public String toString() {
        return "\nId=" + id +
                "\nNombre = " + nombre +
                "\nEdad = " + edad +
                "\nEspecie = " + especie +
                "\nDetalleEspecie = " + detalleEspecie;
    }
}
