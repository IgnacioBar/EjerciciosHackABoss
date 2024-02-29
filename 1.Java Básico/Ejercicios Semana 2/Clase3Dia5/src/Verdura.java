public class Verdura {
    private int id;
    private String nombre;
    private String color;
    private int calorias;
    private boolean debeCocinarse;

    public Verdura(int id, String nombre, String color, int calorias, boolean debeCocinarse) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.debeCocinarse = debeCocinarse;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setDebeCocinarse(boolean debeCocinarse) {
        this.debeCocinarse = debeCocinarse;
    }

    @Override
    public String toString() {
        return "VERDURA " + id +
                "\nNombre = " + nombre +
                "\nColor = " + color +
                "\nCalorias = " + calorias +
                "\n¿Debe cocinarse? = " + cocinarsiono() + ".\n";
    }

    private String cocinarsiono() {
        return debeCocinarse ? "Si" : "No";
    }

}
