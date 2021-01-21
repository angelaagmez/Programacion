package U4_T1.pizzeria;

public class Ingrediente {
    private String nombre;
    private int calorias;

    public Ingrediente() {
        this.nombre = "Queso";
        this.calorias = 250;
    }

    public Ingrediente(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
