import java.util.Objects;

public class Atleta {
    private String nombre;
    private String pais;
    private int marca;
    private String categoria;
    private boolean finisher;

    public Atleta(String nombre, String pais, int marca, String categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.marca = marca;
        this.categoria = categoria;
        this.finisher = true;
    }

    public Atleta(String nombre, String pais, String categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.marca = 0;
        this.categoria = categoria;
        this.finisher = false;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return marca == atleta.marca;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria=" + categoria +
                ", finisher=" + finisher +
                '}';
    }
}
