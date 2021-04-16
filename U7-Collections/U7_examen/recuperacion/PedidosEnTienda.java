package com.abg;

import java.util.Iterator;
import java.util.Set;

public class PedidosEnTienda extends Pedido{
    private String direccion;

    public PedidosEnTienda(String id, String fechaRealizacion, String fechaEntregado, String direccion) {
        super(id, fechaRealizacion, fechaEntregado);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void addProducto(Productos producto, int cantidad) {
        producto.setCantidad(0);
        if (!lista_productos.contains(producto)){
            if (cantidad>0){
                producto.setCantidad(cantidad);
                lista_productos.add(producto);
            }
        } else {
            producto.setCantidad(producto.getCantidad()+cantidad);
            lista_productos.add(producto);
        }
    }

    @Override
    public boolean borrarProducto(Productos prod) {
        if (lista_productos.contains(prod)){
            lista_productos.remove(prod);
            return true;
        }else {
            System.out.println("El producto no existe");
            return false;
        }
    }

    @Override
    public int numeroProductos() {
        int cont = 0;
        Iterator it = lista_productos.iterator();
        while (it.hasNext()) {
            Productos p = (Productos) it.next();
            if (lista_productos.contains(p)) {
                cont++;
            }
        }
        return cont;
    }


    @Override
    public double calcularTotal() {
        double total = 0;
        Iterator it = lista_productos.iterator();
        while (it.hasNext()){
            Productos p = (Productos) it.next();
            if (p.getPrecio()>0){
                total = p.getPrecio()*p.getCantidad();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "PedidosEnTienda{" +
                "id='" + id + '\'' +
                ", lista_productos=" + lista_productos +
                ", fechaRealizacion='" + fechaRealizacion + '\'' +
                ", fechaEntregado='" + fechaEntregado + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
