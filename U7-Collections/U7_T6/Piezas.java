package U7_T6;

public class Piezas {
    private String nombre;
    private Integer valor;

    public Piezas(String nombre, Integer valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Piezas{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }
}
