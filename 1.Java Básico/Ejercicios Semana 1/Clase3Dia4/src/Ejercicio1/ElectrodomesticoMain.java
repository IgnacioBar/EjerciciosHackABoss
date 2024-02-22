package Ejercicio1;

/*Ejercicio Nº 1 - Clases y Objetos - Individual

Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde)
con los siguientes atributos: cod, marca, modelo, consumo y color.

Luego, realiza las siguientes acciones:

a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.

b) Crea 1 objeto de la clase Electrodomestico sin parámetros.

c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.

d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?*/

public class ElectrodomesticoMain {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[4];

        electrodomesticos[0] = new Electrodomestico(101, "Samsung", "Lavadora", 150, "Blanco");
        electrodomesticos[1] = new Electrodomestico(202, "LG", "Nevera", 200, "Plateado");
        electrodomesticos[2] = new Electrodomestico(303, "Sony", "Televisor", 100, "Negro");

        Electrodomestico electrodomesticoSinParametros = new Electrodomestico();
        electrodomesticos[3] = electrodomesticoSinParametros;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            validarYMostrarMarca(electrodomestico);
            validarYMostrarModelo(electrodomestico);
            validarYMostrarConsumo(electrodomestico);
            validarYMostrarColor(electrodomestico);
        }
    }

    private static void validarYMostrarMarca(Electrodomestico electrodomestico) {
        if (electrodomestico.validarMarca()) {
            System.out.println("Marca válida: " + electrodomestico.getMarca());
        } else {
            System.out.println("Marca no válida");
        }
    }

    private static void validarYMostrarModelo(Electrodomestico electrodomestico) {
        if (electrodomestico.validarModelo()) {
            System.out.println("Modelo válido: " + electrodomestico.getModelo());
        } else {
            System.out.println("Modelo no válido");
        }
    }

    private static void validarYMostrarConsumo(Electrodomestico electrodomestico) {
        if (electrodomestico.validarConsumo()) {
            System.out.println("Consumo válido: " + electrodomestico.getConsumo());
        } else {
            System.out.println("Consumo no válido");
        }
    }

    private static void validarYMostrarColor(Electrodomestico electrodomestico) {
        if (electrodomestico.validarColor()) {
            System.out.println("Color válido: " + electrodomestico.getColor());
            System.out.println("-----------------------");
        } else {
            System.out.println("Color no válido");
            System.out.println("-----------------------");
        }
    }
}

class Electrodomestico {
    private int cod;
    private String marca;
    private String modelo;
    private int consumo;
    private String color;

    public Electrodomestico() {
    }

    public Electrodomestico(int cod, String marca, String modelo, int consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public int getCod() {
        return cod;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getConsumo() {
        return consumo;
    }

    public String getColor() {
        return color;
    }


    public boolean validarMarca() {
        return marca != null && !marca.isEmpty();
    }

    public boolean validarModelo() {
        return modelo != null && !modelo.isEmpty();
    }

    public boolean validarConsumo() {
        return consumo > 0;
    }

    public boolean validarColor() {
        return color != null && !color.isEmpty();
    }
}
