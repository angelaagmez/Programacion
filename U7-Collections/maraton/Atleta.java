package maraton;

public class Atleta {
    private int dorsal=0;
    private String nombre;
    private String pais;
    private double marca;
    private String categoria;
    private boolean finisher;

    public Atleta( String nombre, String pais, String categoria) {
        dorsal++;
        this.nombre = nombre;
        this.pais = pais;
        this.marca = 0;
        this.categoria = categoria;
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
        return "Atleta{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria='" + categoria + '\'' +
                ", finisher=" + finisher +
                '}';
    }
}
