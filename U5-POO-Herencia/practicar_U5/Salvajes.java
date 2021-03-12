package practicar_U5;

public abstract class Salvajes extends Animales {
    int cantMatado;

    public Salvajes(String nombre, int peso, int cantMatado) {
        super(nombre, peso);
        this.cantMatado = cantMatado;
    }

    public int getCantMatado() {
        return cantMatado;
    }

    public void setCantMatado(int cantMatado) {
        this.cantMatado = cantMatado;
    }

    @Override
    public String toString() {
        return "Salvajes{" +
                "cantMatado=" + cantMatado +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
