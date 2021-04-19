package practicar;

import java.util.Comparator;

public class Ballenas extends Animales implements Comparator<Ballenas> {
    private int velocidadNado;
    private int longitud;

    public Ballenas(int peso, String nombre, int velocidadNado, int longitud) {
        super(peso, nombre);
        this.velocidadNado = velocidadNado;
        this.longitud = longitud;
    }

    public int getVelocidadNado() {
        return velocidadNado;
    }

    public void setVelocidadNado(int velocidadNado) {
        this.velocidadNado = velocidadNado;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Ballenas{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", velocidadNado=" + velocidadNado +
                ", longitud=" + longitud +
                '}';
    }

    @Override
    public int compare(Ballenas o1, Ballenas o2) {
        return o1.velocidadNado-o2.velocidadNado;
    }
}
