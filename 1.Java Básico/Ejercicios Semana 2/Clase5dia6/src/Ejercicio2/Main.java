package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Vestimenta[] vectorVestimenta = new Vestimenta[9];

        vectorVestimenta[0] = new Zapato(1, "Zapato1", 50.0, "Nike", "40", "Negro", "Cuero", "Cordones");
        vectorVestimenta[1] = new Zapato(2, "Zapato2", 45.0, "Adidas", "38", "Blanco", "Sintético", "Velcro");
        vectorVestimenta[2] = new Zapato(3, "Zapato3", 55.0, "Puma", "42", "Azul", "Cuero", "Cremallera");

        vectorVestimenta[3] = new Pantalon(4, "Pantalon1", 30.0, "Levi's", "M", "Azul", "Skinny", "Algodón");
        vectorVestimenta[4] = new Pantalon(5, "Pantalon2", 40.0, "Tommy Hilfiger", "L", "Negro", "Regular", "Mezclilla");
        vectorVestimenta[5] = new Pantalon(6, "Pantalon3", 35.0, "Zara", "S", "Gris", "Slim", "Lino");

        vectorVestimenta[6] = new Camiseta(7, "Camiseta1", 20.0, "H&M", "L", "Blanco", "Manga corta", "Cuello redondo");
        vectorVestimenta[7] = new Camiseta(8, "Camiseta2", 18.0, "Forever 21", "S", "Negro", "Manga larga", "Cuello en V");

        vectorVestimenta[8] = new Sombrero(9, "Sombrero1", 25.0, "Brixton", "Única", "Marrón", "Fedora", "Mediano");

        for (Vestimenta vestimenta : vectorVestimenta) {
            if (vestimenta instanceof Zapato) {
                ((Zapato) vestimenta).mostrarMensaje();
            } else if (vestimenta instanceof Pantalon) {
                ((Pantalon) vestimenta).mostrarMensaje();
            } else if (vestimenta instanceof Camiseta) {
                ((Camiseta) vestimenta).mostrarMensaje();
            } else if (vestimenta instanceof Sombrero) {
                ((Sombrero) vestimenta).mostrarMensaje();
            }
        }
    }
}