package practicar2;

import java.io.Serializable;
import java.util.Scanner;

public class Producto implements Serializable {
    private String codigo;
    private String nombre;
    private String descripcion;
    private int stock;
    private double precio;

    public Producto(String codigo, String nombre, String descripcion, int stock, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void rellenarStock(){
        Scanner sc = new Scanner(System.in);
        if (stock<5){
            System.out.println("El producto tiene pocas unidades");
        }
        System.out.println("¿Cuantas unidades quieres agregar al producto? ");
        int unidades = sc.nextInt();

        stock += unidades;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                '}';
    }
}
