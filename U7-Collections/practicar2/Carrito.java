package practicar2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Carrito {
    Set<Producto> lista_compra;
    private int cont;

    public Carrito() {
        this.lista_compra = new HashSet<Producto>();
        cont++;
    }

    public Set<Producto> getLista_compra() {
        return lista_compra;
    }

    public void setLista_compra(Set<Producto> lista_compra) {
        this.lista_compra = lista_compra;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void comprarProducto(Producto producto, int cantidad){
        Producto prod = new Producto(producto.getCodigo(),producto.getNombre(),producto.getDescripcion(),cantidad,producto.getPrecio());
        Set<Producto> aux = new HashSet<Producto>();

        if (lista_compra.contains(producto)) {
            prod.setStock(cantidad);
            lista_compra.add(prod);
        } else {
            Iterator it = aux.iterator();
            while (it.hasNext()){
                Producto comprobar = (Producto) it.next();
                if (comprobar.equals(aux)){
                    comprobar.setStock(cantidad);
                }
            }
        }
    }

    public void soltarProducto(Producto producto){
        if (lista_compra.contains(producto)){
            lista_compra.remove(producto);
        }
    }

    public void pagar(){
        try {
            double total=0;
            BufferedWriter escribir = new BufferedWriter(new FileWriter("./src/practicar2/Factura_"+cont+".txt"));
            Iterator it = lista_compra.iterator();
            while (it.hasNext()){
                Producto prod = (Producto) it.next();
                escribir.write(prod.getNombre()+" ");
                escribir.write(prod.getStock()+" ");
                escribir.write(prod.getPrecio()+" ");
                escribir.write((prod.getPrecio()*prod.getStock()+" "));
                escribir.newLine();

                total += prod.getPrecio()*prod.getStock();
            }

            escribir.write("Precio total: "+total);

            escribir.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        lista_compra.clear();
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "lista_compra=" + lista_compra +
                '}';
    }
}
