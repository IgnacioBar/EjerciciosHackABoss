package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero(1, "León", 5, "Pelaje corto", "Carnívoro",
                4, "Vivíparo", "Amarillo", "Savana");
        Ave ave = new Ave(2, "Águila", 3, "Plumas", "Carnívoro",
                2.5, "Planeo", "Marrón", "Gancho");
        Reptil reptil = new Reptil(3, "Serpiente", 2, "Escamas", "Carnívoro",
                1.5, "Queratinosas", "Veneno neurotóxico", "Selva");

        mamifero.saludar();
        ave.saludar();
        reptil.saludar();
        Animal animal = new Mamifero(4, "Delfín", 7, "Piel lisa", "Piscívoro",
                0, "Vivíparo", "Gris", "Océano");
    }
}