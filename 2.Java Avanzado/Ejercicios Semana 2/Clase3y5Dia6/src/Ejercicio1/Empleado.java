package Ejercicio1;

public class Empleado {
    private String nombre;
    private double salario;
    private String categoria;

    public Empleado(String nombre, double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "\nNombre = " + nombre +
                "\nSalario = " + salario +
                "\nCategoria = " + categoria;
    }
}
