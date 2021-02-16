package examen_U4U5;

public class PrendaNormal extends Prendas{
    public PrendaNormal(double precio, String nombre, int codigo, int peso) {
        super(precio, nombre, codigo, peso, false);
    }


    @Override
    public String toString() {
        return "PrendaNormal{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", peso=" + peso +
                ", colgar=" + colgar +
                '}';
    }


    @Override
    public void colgar() {

    }
}
