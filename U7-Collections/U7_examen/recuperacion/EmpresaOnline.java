package com.abg;

import java.io.*;
import java.util.*;

public class EmpresaOnline {
    private Map<String,PedidosOnline> lista_pedidos;
    private String nombre;

    public EmpresaOnline(String nombre) {
        this.lista_pedidos = new HashMap<>();
        this.nombre = nombre;
    }

    public Map<String, PedidosOnline> getLista_pedidos() {
        return lista_pedidos;
    }

    public void setLista_pedidos(Map<String, PedidosOnline> lista_pedidos) {
        this.lista_pedidos = lista_pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cargarPedidos(){
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("./src/com/abg/online.dat"));
            while (true){
                PedidosOnline p = (PedidosOnline) leer.readObject();
                lista_pedidos.put(p.getId(),p);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Pedidos cargados");
        }
    }

    public void escribirPedidos(){
        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/com/abg/online.dat"));

            Collection<PedidosOnline> aux = lista_pedidos.values();
            Iterator it = aux.iterator();
            while (it.hasNext()){
                PedidosOnline ped = (PedidosOnline) it.next();
                escribir.writeObject(ped);
            }
            escribir.close();
        } catch (IOException e) {
            System.out.println("Pedidos guardados");
        }
    }

    public void addPedidoOnline(PedidosOnline pedidos) {
        if (!lista_pedidos.containsKey(pedidos.getId())){
            lista_pedidos.put(pedidos.getId(),pedidos);
        } else {
            System.out.println("No se encuentra el pedido");
        }
    }

    public void mostrarPedidosOrdenados(){
        Collection<PedidosOnline> aux = lista_pedidos.values();
        ArrayList<PedidosOnline> pedidos = new ArrayList<>();

        Iterator it = aux.iterator();
        while (it.hasNext()){
            PedidosOnline ped = (PedidosOnline) it.next();
            if (lista_pedidos.isEmpty()){
                pedidos.add(ped);
            }
        }
        pedidos.sort(new Comparator<PedidosOnline>() {
            @Override
            public int compare(PedidosOnline o1, PedidosOnline o2) {
                return (int)(o1.calcularTotal()-o2.calcularTotal());
            }
        });

        System.out.println(pedidos);
    }

    public void vendidoProducto(int cod){
        if (lista_pedidos.containsKey(cod)){
            System.out.println("Se ha vendido en un Pedido online");
        } else {
            System.out.println("No se encuentra en ningun pedido Online");
        }

        Collection<PedidosOnline> aux = lista_pedidos.values();
        ArrayList<PedidosOnline> pedidos = new ArrayList<>();

        Iterator it = aux.iterator();
        while (it.hasNext()){
            PedidosOnline prodOnline = (PedidosOnline) it.next();
            if (lista_pedidos.containsKey(cod)){
                pedidos.add(prodOnline);
            }
        }
        System.out.println("El producto ha sido vendido en este pedido online: ");
        System.out.println(pedidos);
    }

    @Override
    public String toString() {
        return "EmpresaOnline{" +
                "lista_pedidos=" + lista_pedidos +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
