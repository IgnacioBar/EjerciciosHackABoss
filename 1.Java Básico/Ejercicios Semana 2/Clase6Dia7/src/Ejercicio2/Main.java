package Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("001", "Teléfono", "Samsung", "Electrónico", 300, 500, 50));
        productos.add(new Producto("002", "Laptop", "Dell", "Electrónico", 700, 1000, 30));
        productos.add(new Producto("003", "Auriculares", "Sony", "Electrónico", 50, 150, 100));
        productos.add(new Producto("004", "Cargador", "Anker", "Electrónico", 10, 25, 200));
        productos.add(new Producto("005", "Tablet", "Apple", "Electrónico", 400, 650, 25));
        productos.add(new Producto("006", "Smartwatch", "Xiaomi", "Electrónico", 100, 200, 60));
        productos.add(new Producto("007", "Monitor", "LG", "Electrónico", 150, 300, 40));
        productos.add(new Producto("008", "Teclado", "Logitech", "Electrónico", 70, 120, 80));
        productos.add(new Producto("009", "Mouse", "Razer", "Electrónico", 40, 80, 150));
        productos.add(new Producto("010", "Cámara", "Canon", "Electrónico", 500, 800, 20));

        Producto mayorPrecioVenta = encontrarProductoConMayorPrecioVenta(productos);
        Producto menorPrecioCosto = encontrarProductoConMenorPrecioCosto(productos);

        System.out.println("Producto con mayor precio de venta: " + mayorPrecioVenta);
        System.out.println("Producto con menor precio de costo: " + menorPrecioCosto);

        productos.remove(5);
        System.out.println("Producto en la posición 5 borrado.");

        Producto mayorCantidadStock = productos.stream().max(Comparator.comparing(Producto::getCantidadStock)).orElse(null);
        if (mayorCantidadStock != null) {
            mayorCantidadStock.setCantidadStock(mayorCantidadStock.getCantidadStock() - 3);
            System.out.println("Actualizado el stock del producto con mayor cantidad en stock: " + mayorCantidadStock);
        }

        System.out.println("Listado de productos actualizado:");
        productos.forEach(System.out::println);

    }
    private static Producto encontrarProductoConMayorPrecioVenta(ArrayList<Producto> productos) {
        Producto productoConMayorPrecioVenta = null;

        for (Producto producto : productos) {
            if (productoConMayorPrecioVenta == null || producto.getPrecioVenta() > productoConMayorPrecioVenta.getPrecioVenta()) {
                productoConMayorPrecioVenta = producto;
            }
        }

        return productoConMayorPrecioVenta;
    }

    private static Producto encontrarProductoConMenorPrecioCosto(ArrayList<Producto> productos) {
        Producto productoConMenorPrecioCosto = null;

        for (Producto producto : productos) {
            if (productoConMenorPrecioCosto == null || producto.getPrecioCosto() < productoConMenorPrecioCosto.getPrecioCosto()) {
                productoConMenorPrecioCosto = producto;
            }
        }

        return productoConMenorPrecioCosto;
    }
}
