package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, double precio, int cantidad) {
        try {
            Producto producto = new Producto(nombre, precio, cantidad);
            productos.add(producto);
            System.out.println("Producto agregado exitosamente: " + producto.getNombre());
        } catch (IllegalArgumentException e) {
            System.err.println("Error al agregar producto: " + e.getMessage());
        }
    }

    public void mostrarInventario() {
        if(productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("Inventario:");
        for(Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + " | Precio: " + producto.getPrecio() + " | Cantidad: " + producto.getCantidad());
        }
    }
}
