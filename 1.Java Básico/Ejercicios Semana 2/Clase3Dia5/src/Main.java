public class Main {
    public static void main(String[] args) {
        Verdura[] verduras = new Verdura[5];

        verduras[0] = new Verdura(1, "Zanahoria", "Naranja", 50, false);
        verduras[1] = new Verdura(2, "Lechuga", "Verde", 10, false);
        verduras[2] = new Verdura(3, "Tomate", "Rojo", 20, false);
        verduras[3] = new Verdura(4, "Brócoli", "Verde", 30, true);
        verduras[4] = new Verdura(5, "Pimiento", "Rojo", 15, true);

        System.out.println("Verduras almacenadas:");
        for (Verdura verdura : verduras) {
            System.out.println("Nombre: " + verdura.getNombre() + ", Calorías: " + verdura.getCalorias());
        }

        verduras[0].setNombre("Cebolla");
        verduras[0].setColor("Blanco");
        verduras[0].setCalorias(25);
        verduras[0].setDebeCocinarse(true);

        verduras[3].setNombre("Espinaca");
        verduras[3].setColor("Verde");
        verduras[3].setCalorias(15);
        verduras[3].setDebeCocinarse(true);

        System.out.println("\nVerduras después del cambio:");
        for (Verdura verdura : verduras) {
            System.out.println(verdura.toString());
        }

        System.out.println("\nVerduras de color verde:");
        for (Verdura verdura : verduras) {
            if ("Verde".equalsIgnoreCase(verdura.getColor())) {
                System.out.println(verdura);
            }
        }
    }
}