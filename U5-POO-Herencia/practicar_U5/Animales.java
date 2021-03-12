package practicar_U5;

public abstract class Animales implements Comparable<Animales>{
    protected String nombre;
    protected int peso;

    public Animales(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public abstract void sonido();

    @Override
    public String toString() {
        return "Animales{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }

    @Override
    public int compareTo(Animales o) {
        return o.getPeso()-this.getPeso();
    }
}
