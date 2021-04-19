package practicar;

import java.io.Serializable;
import java.util.Objects;

public abstract class Animales implements Comparable<Animales>, Serializable {
    protected int peso;
    protected String nombre;

    public Animales(int peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animales animales = (Animales) o;
        return peso == animales.peso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(peso);
    }

    @Override
    public int compareTo(Animales o) {
        return this.peso-o.peso;
    }
}
