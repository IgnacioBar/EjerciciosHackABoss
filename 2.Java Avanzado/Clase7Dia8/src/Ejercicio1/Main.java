package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Directorio raiz = new Directorio("Raiz");
        Directorio documentos = new Directorio("\nDocumentos");
        Directorio imagenes = new Directorio("\nImagenes");
        Directorio musica = new Directorio("\nMusica");

        raiz.agregarSubdirectorio(documentos);
        raiz.agregarSubdirectorio(imagenes);
        raiz.agregarSubdirectorio(musica);

        documentos.agregarArchivo("CV.pdf");
        documentos.agregarArchivo("Tesis.docx");

        imagenes.agregarArchivo("foto1.jpg");
        imagenes.agregarArchivo("foto2.png");

        musica.agregarArchivo("song1.mp3");
        musica.agregarArchivo("song2.wav");

        ExploradorDirectorios explorador = new ExploradorDirectorios();
        explorador.explorarDirectorio(raiz, 0);
    }
}
