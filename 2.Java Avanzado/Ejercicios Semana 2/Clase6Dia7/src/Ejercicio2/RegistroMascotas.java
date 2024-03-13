package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas {

    private List<Mascota<?>> mascotas;

    public RegistroMascotas() {
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota<?> mascota) {
        this.mascotas.add(mascota);
    }

    public List<Mascota<?>> buscarPorNombre(String nombre) {
        List<Mascota<?>> resultado = new ArrayList<>();
        for (Mascota<?> mascota : this.mascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                resultado.add(mascota);
            }
        }
        return resultado;
    }

    public List<Mascota<?>> buscarPorEspecie(String especie) {
        List<Mascota<?>> resultado = new ArrayList<>();
        for (Mascota<?> mascota : this.mascotas) {
            if (mascota.getEspecie().equalsIgnoreCase(especie)) {
                resultado.add(mascota);
            }
        }
        return resultado;
    }

    public int contarMascotas() {
        return this.mascotas.size();
    }

    public void generarMascotaAleatoria() {
        String[] nombres = {"Fido", "Garfield", "Tweety", "Spike"};
        String[] especies = {"Perro", "Gato", "Ave", "Reptil"};
        Random random = new Random();
        String nombre = nombres[random.nextInt(nombres.length)];
        String especie = especies[random.nextInt(especies.length)];
        int edad = random.nextInt(15) + 1;
        this.agregarMascota(new Mascota<>(nombre, edad, especie, null));
    }

    public void imprimirMascotas() {
        for (Mascota<?> mascota : this.mascotas) {
            System.out.println(mascota);
        }
    }
}
