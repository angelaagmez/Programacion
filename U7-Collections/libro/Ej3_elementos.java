package libro;

import java.util.Objects;

public class Ej3_elementos {
    private String nombreproducto;
    private double precio;
    private int cantidad;

    public Ej3_elementos(String nombreproducto, double precio, int cantidad) {
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ej3_elementos that = (Ej3_elementos) o;
        return precio == that.precio && nombreproducto.equals(that.nombreproducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreproducto, precio);
    }

    @Override
    public String toString() {
        return "Ej3_elementos{" +
                "nombreproducto='" + nombreproducto + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad + '\n' +
                '}';
    }
}
