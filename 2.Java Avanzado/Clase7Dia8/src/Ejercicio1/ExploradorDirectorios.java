package Ejercicio1;

public class ExploradorDirectorios {

    public void explorarDirectorio(Directorio directorio, int nivel) {
        imprimirIndentacion(nivel);
        System.out.println(directorio.getNombre());

        for (String archivo : directorio.getArchivos()) {
            imprimirIndentacion(nivel + 1);
            System.out.println(archivo);
        }

        for (Directorio subdirectorio : directorio.getSubdirectorios()) {
            explorarDirectorio(subdirectorio, nivel + 1);
        }
    }

    private void imprimirIndentacion(int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
    }
}
