package practicar3;

import java.io.Serializable;

public class Atletas implements Serializable {
    private int dorsal;
    private int cont=0;
    private String nombre;
    private String pais;
    private double marca;
    private String categoria;
    private boolean finisher;

    public Atletas(String nombre, String pais, String categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.marca = 0;
        this.categoria = categoria;
        this.dorsal = cont;
        cont++;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
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

    public double getMarca() {
        return marca;
    }

    public void setMarca(double marca) {
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
        return "Atletas{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria='" + categoria + '\'' +
                ", finisher=" + finisher +
                '}';
    }
}
