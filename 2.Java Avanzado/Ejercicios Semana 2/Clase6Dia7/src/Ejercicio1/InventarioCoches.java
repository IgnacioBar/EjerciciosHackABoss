package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public
class InventarioCoches {
    private List<Coche> inventario;

    public InventarioCoches() {
        this.inventario = new ArrayList<>();
    }

    // Método genérico para agregar coches al inventario
    public void agregarCoche(Coche coche) {
        inventario.add(coche);
    }

    // Método genérico para buscar coches por marca
    public List<Coche> buscarPorMarca(String marca) {
        return inventario.stream()
                .filter(coche -> coche.getMarca().equalsIgnoreCase(marca))
                .collect(Collectors.toList());
    }

    // Método genérico para buscar coches por año
    public List<Coche> buscarPorAnio(int anio) {
        return inventario.stream()
                .filter(coche -> coche.getAnio() == anio)
                .collect(Collectors.toList());
    }

    // Método genérico para calcular el valor total del inventario
    public double calcularValorTotal() {
        return inventario.stream()
                .mapToDouble(Coche::getPrecio)
                .sum();
    }
}