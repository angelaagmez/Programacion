package com.abg;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PedidosOnline extends Pedido implements Log, Serializable {
    private String ip;
    private String metodoPago;

    public PedidosOnline(String id, String fechaRealizacion, String fechaEntregado, String ip, String metodoPago) {
        super(id, fechaRealizacion, fechaEntregado);
        this.ip = ip;
        this.metodoPago = metodoPago;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
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
        return "PedidosOnline{" +
                "id='" + id + '\'' +
                ", lista_productos=" + lista_productos +
                ", fechaRealizacion='" + fechaRealizacion + '\'' +
                ", fechaEntregado='" + fechaEntregado + '\'' +
                ", ip='" + ip + '\'' +
                ", metodoPago='" + metodoPago + '\'' +
                '}';
    }

    @Override
    public void printLog() {
        System.out.println("Fecha de realizacion: "+fechaRealizacion);
        System.out.println("Fecha de entrega: "+fechaEntregado);
        System.out.println("Metodo de pago: "+metodoPago);
        System.out.println("Coste total: "+calcularTotal());
    }

}
