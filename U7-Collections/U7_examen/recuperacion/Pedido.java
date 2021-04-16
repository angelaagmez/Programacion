package com.abg;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class Pedido {
    protected String id;
    protected Set<Productos> lista_productos;
    protected String fechaRealizacion;
    protected String fechaEntregado;
    protected int cont=0;

    public Pedido(String id,String fechaRealizacion, String fechaEntregado) {
        this.id = id;
        this.lista_productos = new HashSet<>();
        this.fechaRealizacion = fechaRealizacion;
        this.fechaEntregado = fechaEntregado;
        cont++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<Productos> getLista_productos() {
        return lista_productos;
    }

    public void setLista_productos(Set<Productos> lista_productos) {
        this.lista_productos = lista_productos;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(String fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public abstract void addProducto(Productos producto, int cantidad);

    public abstract boolean borrarProducto(Productos prod);

    public abstract int numeroProductos();

    public abstract double calcularTotal();

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", lista_productos=" + lista_productos +
                ", fechaRealizacion='" + fechaRealizacion + '\'' +
                ", fechaEntregado='" + fechaEntregado + '\'' +
                '}';
    }

}
