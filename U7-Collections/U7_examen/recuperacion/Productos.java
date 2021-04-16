package com.abg;

import java.io.Serializable;
import java.util.Objects;

public class Productos implements Serializable, Comparable<Productos> {
    private String nombre;
    private int cantidad;
    private double precio;
    private int codigo;

    public Productos(String nombre, int cantidad, double precio, int codigo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Productos productos = (Productos) o;
        return codigo == productos.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public int compareTo(Productos o) {
        return (int)(this.getPrecio()-o.getPrecio());
    }
}
