package examen2;

import java.io.Serializable;
import java.util.Objects;

public class Atleta2 implements Serializable, Comparable<Atleta2> {
    private int dorsal=0;
    private String nombre;
    private String pais;
    private int marca;
    private String categoria;
    private boolean finisher;

    public Atleta2(String nombre, String pais, String categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.marca = 0;
        this.categoria = categoria;
        dorsal++;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    @Override
    public String toString() {
        return "Atleta2{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria='" + categoria + '\'' +
                ", finisher=" + finisher +
                '}';
    }

    @Override
    public int compareTo(Atleta2 o) {
        return this.marca-o.marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta2 atleta2 = (Atleta2) o;
        return dorsal == atleta2.dorsal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dorsal);
    }
}
