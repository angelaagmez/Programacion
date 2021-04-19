package practicar;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.*;

// añadir, sacar, mostrar, buscar, guardar en archivo y obtener de archivo

public class Zoo implements Serializable{
    private Map<String, ArrayList<Animales>> lista_animales;

    public Zoo() {
        this.lista_animales = new HashMap<String, ArrayList<Animales>>();
    }

    public Map<String, ArrayList<Animales>> getLista_animales() {
        return lista_animales;
    }

    public void setLista_animales(Map<String, ArrayList<Animales>> lista_animales) {
        this.lista_animales = lista_animales;
    }

    public void addAnimales(String tipo, Animales animal){
        if (animal.getClass().getSimpleName().equalsIgnoreCase(tipo)){
            if (!lista_animales.containsKey(tipo)){
                lista_animales.put(tipo, new ArrayList<>());
            }
            lista_animales.get(tipo).add(animal);
        } else {
            System.out.println("No existe el tipo de animal");
        }
    }

    public void deleteAnimales(Animales animal){
        if (lista_animales.containsKey(animal.getClass().getSimpleName())){
            lista_animales.get(animal.getClass().getSimpleName()).remove(animal);
        } else {
            System.out.println("No existe ese tipo de animal");
        }
    }

    public void mostrarAnimales(){
        Collection<ArrayList<Animales>> aux = lista_animales.values();

        Iterator it = aux.iterator();
        while (it.hasNext()){
            ArrayList<Animales> anim = (ArrayList<Animales>) it.next();
            System.out.println(anim);
        }
    }

    public void buscarAnimales(String nombre){
        Collection<ArrayList<Animales>> aux = lista_animales.values();
            Iterator it = aux.iterator();
            while (it.hasNext()){
                ArrayList<Animales> anim = (ArrayList<Animales>) it.next();
                for (Animales a: anim) {
                    if (a.getNombre().equalsIgnoreCase(nombre)){
                        System.out.println(anim);
                    }
                }
            }
    }

    public void cargarAnimales(){
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("./src/practicar/zoo.dat"));
            while (true){
                Animales a = (Animales) leer.readObject();
                addAnimales(a.getClass().getSimpleName(), a);
            }
            // lista_animales = (HashMap<String, ArrayList<Animales>>) leer.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void guardarAnimales(){
        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/practicar/zoo.dat"));
            Collection<ArrayList<Animales>> aux = lista_animales.values();
            Iterator it = aux.iterator();
            while (it.hasNext()){
                ArrayList<Animales> anim = (ArrayList<Animales>) it.next();
                for (Animales a: anim) {
                    escribir.writeObject(a);
                }

                // escribir.writeObject(lista_animales);
            }
            escribir.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "lista_animales=" + lista_animales +
                '}';
    }
}
