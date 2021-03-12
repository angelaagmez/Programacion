package practicar_U5;

public abstract class Compania extends Animales{
    int cantAvisos;

    public Compania(String nombre, int peso, int cantAvisos) {
        super(nombre, peso);
        this.cantAvisos = cantAvisos;
    }

    public int getCantAvisos() {
        return cantAvisos;
    }

    public void setCantAvisos(int cantAvisos) {
        this.cantAvisos = cantAvisos;
    }

    @Override
    public String toString() {
        return "Compania{" +
                "cantAvisos=" + cantAvisos +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
