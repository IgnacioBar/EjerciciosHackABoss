public class Verdura {
    private int id;
    private String nombre;
    private String color;
    private int calorias;
    private boolean debeCocinarse;

    // Atributos para rastrear los cambios
    private String nombreOriginal;
    private String colorOriginal;
    private int caloriasOriginal;
    private boolean debeCocinarseOriginal;

    public Verdura(int id, String nombre, String color, int calorias, boolean debeCocinarse) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.debeCocinarse = debeCocinarse;
        guardarEstadoOriginal();
    }

    private void guardarEstadoOriginal() {
        this.nombreOriginal = nombre;
        this.colorOriginal = color;
        this.caloriasOriginal = calorias;
        this.debeCocinarseOriginal = debeCocinarse;
    }

    // Métodos setters modificados para no necesitar rastreo adicional aquí

    // Método para mostrar cambios específicos
    public void mostrarCambios() {
        boolean cambio = false;

        if (!nombre.equals(nombreOriginal)) {
            System.out.println("Nombre cambiado de " + nombreOriginal + " a " + nombre + ".");
            cambio = true;
        }
        if (!color.equals(colorOriginal)) {
            System.out.println("Color cambiado de " + colorOriginal + " a " + color + ".");
            cambio = true;
        }
        if (calorias != caloriasOriginal) {
            System.out.println("Calorías cambiadas de " + caloriasOriginal + " a " + calorias + ".");
            cambio = true;
        }
        if (debeCocinarse != debeCocinarseOriginal) {
            System.out.println("DebeCocinarse cambiado de " + debeCocinarseOriginal + " a " + debeCocinarse + ".");
            cambio = true;
        }

        if (!cambio) {
            System.out.println("No hay cambios en " + nombre + ".");
        }
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getCalorias() {
        return calorias;
    }

    public boolean getDebeCocinarse() {
        return debeCocinarse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        if (!this.nombre.equals(nombre)) {
            this.nombre = nombre;
            guardarEstadoOriginal();
        }
    }

    public void setColor(String color) {
        if (!this.color.equals(color)) {
            this.color = color;
            guardarEstadoOriginal();
        }
    }

    public void setCalorias(int calorias) {
        if (this.calorias != calorias) {
            this.calorias = calorias;
            guardarEstadoOriginal();
        }
    }

    public void setDebeCocinarse(boolean debeCocinarse) {
        if (this.debeCocinarse != debeCocinarse) {
            this.debeCocinarse = debeCocinarse;
            guardarEstadoOriginal();
        }
    }
}
