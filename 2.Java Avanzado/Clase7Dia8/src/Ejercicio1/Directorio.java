package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public void agregarSubdirectorio(Directorio subdirectorio) {
        subdirectorios.add(subdirectorio);
    }

    public void agregarArchivo(String archivo) {
        archivos.add(archivo);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }
}
