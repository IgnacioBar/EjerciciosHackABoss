public class Main {
    public static void main(String[] args) {
        Verdura[] verduras = new Verdura[5];

        verduras[0] = new Verdura(1, "Zanahoria", "Naranja", 41, false);
        verduras[1] = new Verdura(2, "Espinaca", "Verde", 23, true);
        verduras[2] = new Verdura(3, "Tomate", "Rojo", 18, false);
        verduras[3] = new Verdura(4, "Brócoli", "Verde", 34, true);
        verduras[4] = new Verdura(5, "Papa", "Marrón", 77, true);

        System.out.println("\nVerduras:");
        for (Verdura verdura : verduras) {
            System.out.println(verdura.getNombre() + " tiene " + verdura.getCalorias() + " calorías.");
        }

        System.out.println("\nAntes de los cambios:");
        for (Verdura verdura : verduras) {
            System.out.println(verdura);
        }

        verduras[1].setNombre("Lechuga");
        verduras[1].setColor("Verde");
        verduras[1].setCalorias(15);
        verduras[1].setDebeCocinarse(false);

        verduras[3].setNombre("Pepino");
        verduras[3].setColor("Verde");
        verduras[3].setCalorias(16);
        verduras[3].setDebeCocinarse(false);

        System.out.println("Mostrando cambios realizados:");
        for (Verdura verdura : verduras) {
            verdura.mostrarCambios();
        }


        System.out.println("\nVerduras de color verde:");
        for (Verdura verdura : verduras) {
            if ("Verde".equalsIgnoreCase(verdura.getColor())) {
                System.out.println(verdura.getNombre() + " -> " + verdura.getColor());
            }
        }
    }
}
