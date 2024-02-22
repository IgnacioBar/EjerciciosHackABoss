package Ejercicio2;

/*Ejercicio Nº 2 - POO - Individual

Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
(tener en cuenta todos sus atributos, constructores y métodos getters y setters).

a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.

b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.

c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y
luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.

d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.*/

public class PersonaMain {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

        personas[0] = new Persona(1, "Juan", 25, "Calle A #123", "123456789");
        personas[1] = new Persona(2, "Ana", 40, "Calle B #456", "987654321");
        personas[2] = new Persona(3, "Carlos", 35, "Calle C #789", "111222333");
        personas[3] = new Persona(4, "Elena", 28, "Calle D #012", "444555666");
        personas[4] = new Persona(5, "Luis", 32, "Calle E #345", "777888999");

        System.out.println("Datos de las personas:");
        for (Persona persona : personas) {
            if (persona.validarCampos()) {
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            } else {
                System.out.println("Persona con ID " + persona.getId() + " tiene campos inválidos.");
            }
        }

        System.out.println("\nCambio de nombres:");
        System.out.print("(Antes)    ");
        mostrarDatosPersona(personas[1]);
        personas[1].setNombre("Alicia");
        System.out.print("(Después)  ");
        mostrarDatosPersona(personas[1]);

        System.out.print("\n(Antes)    ");
        mostrarDatosPersona(personas[3]);
        personas[3].setNombre("Carlota");
        System.out.print("(Después)  ");
        mostrarDatosPersona(personas[3]);

        System.out.println("\nPersonas mayores de 30 años:");
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                mostrarDatosPersona(persona);
            }
        }
    }

    private static void mostrarDatosPersona(Persona persona) {
        System.out.println("ID: " + persona.getId() + ", Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad() +
                ", Dirección: " + persona.getDireccion() + ", Teléfono: " + persona.getNumeroTelefono());
    }
}

class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private String numeroTelefono;

    public Persona(int id, String nombre, int edad, String direccion, String numeroTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }


    public boolean validarCampos() {
        return validarNombre() && validarEdad() && validarDireccion() && validarNumeroTelefono();
    }

    private boolean validarNombre() {
        return nombre != null && !nombre.isEmpty();
    }

    private boolean validarEdad() {
        return edad > 0;
    }

    private boolean validarDireccion() {
        return direccion != null && !direccion.isEmpty();
    }

    private boolean validarNumeroTelefono() {
        return numeroTelefono != null && !numeroTelefono.isEmpty();
    }
}
