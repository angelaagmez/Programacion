package practicar2;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CajaRegistradora implements Serializable {
    private Map<String, Producto> lista_productos;
    private Carrito carrito;

    public CajaRegistradora() {
        this.lista_productos = new HashMap<String, Producto>();
        this.carrito = new Carrito();
    }

    public Map<String, Producto> getLista_productos() {
        return lista_productos;
    }

    public void setLista_productos(Map<String, Producto> lista_productos) {
        this.lista_productos = lista_productos;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public void addProductos(String codigo, Producto producto){
        if (producto.getCodigo().equalsIgnoreCase(codigo)){
            if (!lista_productos.containsKey(codigo)){
                lista_productos.put(codigo,producto);
            }
        }else {
            System.out.println("No existe el producto");
        }
    }

    public void removeProductos(String codigo){
        if (lista_productos.containsKey(codigo)){
            lista_productos.remove(codigo);
        }else {
            System.out.println("No existe el producto");
        }
    }

    public void comprar(String cod, int cantidad){
        Producto prod = new Producto(cod,"","",cantidad,0.0);
        if (lista_productos.containsKey(cod)){
            if (lista_productos.get(cod).getStock()>cantidad){
                carrito.comprarProducto(lista_productos.get(cod),cantidad);
            }
        }
    }

    public void cobrar(){
        carrito.pagar();
    }

    public void cargarProductos(){
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("./src/practicar2/productos.dat"));

            while (true){
                Producto prod = (Producto) leer.readObject();
                lista_productos.put(prod.getCodigo(), prod);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Productos cargados");
        }
    }

    public void guardarProductos(){
        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/practicar2/productos.dat"));

            Collection<Producto> aux = lista_productos.values();

            Iterator it = aux.iterator();
            while (it.hasNext()){
                Producto prod = (Producto) it.next();
                escribir.writeObject(prod);
            }
            escribir.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "CajaRegistradora{" +
                "lista_productos=" + lista_productos +
                '}';
    }
}
