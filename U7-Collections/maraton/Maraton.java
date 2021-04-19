package maraton;

import java.io.*;
import java.util.*;

public class Maraton {
    private Map<Integer,Atleta> lista_atletas;

    public Maraton(Map<Integer, Atleta> lista_atletas) {
        this.lista_atletas = new HashMap<>();
    }

    public Map<Integer, Atleta> getLista_atletas() {
        return lista_atletas;
    }

    public void setLista_atletas(Map<Integer, Atleta> lista_atletas) {
        this.lista_atletas = lista_atletas;
    }

    public void cargarAtletas(){
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("./src/maraton/atletas.dat"));
            while (true){
                Atleta a = (Atleta) leer.readObject();
                lista_atletas.put(a.getDorsal(),a);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void guardarAtletas(){
        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/maraton/atletas.dat"));
            Collection<Atleta> aux = lista_atletas.values();
            Iterator it = aux.iterator();
            while (it.hasNext()){
                Atleta a = (Atleta) it.next();
                escribir.writeObject(a);
            }
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inscribirAtleta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce el pais");
        String pais = sc.nextLine();
        System.out.println("Introduce la categoria");
        String categoria = sc.nextLine();

        Atleta a = new Atleta(nombre,pais,categoria);
        lista_atletas.put(a.getDorsal(),a);

        System.out.println("¿Ha acabado la carrera?");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("si")){
            System.out.println("Introduce la marca");
            Double marca = sc.nextDouble();
            lista_atletas.get(a.getDorsal()).setMarca(marca);
        }
    }

    public void guardarTiempo(int dorsal,double tiempo){
        if (lista_atletas.containsKey(dorsal)){
            if (tiempo>=0){
                lista_atletas.get(dorsal).setMarca(tiempo);
                lista_atletas.get(dorsal).setFinisher(true);
            }
        } else {
            System.out.println("No se encuentra el atleta");
        }
    }

    public void borrarAtleta(int dorsal){
        if (lista_atletas.containsKey(dorsal)){
            lista_atletas.remove(dorsal);
        } else {
            System.out.println("No se encuentra el atleta");
        }
    }

    public void mostrarListaFinishers(){
        Collection<Atleta> aux = lista_atletas.values();
        ArrayList<Atleta> atletas = new ArrayList<>();

        Iterator it = aux.iterator();
        while (it.hasNext()){
            Atleta a = (Atleta) it.next();
            if (a.isFinisher()){
                atletas.add(a);
            }
        }
        atletas.sort(new Comparator<Atleta>() {
            @Override
            public int compare(Atleta o1, Atleta o2) {
                return (int)(o2.getMarca()-o1.getMarca());
            }
        });
        System.out.println(atletas);
    }

    public void mostrarListaCategoria(String categoria){
        Collection<Atleta> aux = lista_atletas.values();
        ArrayList<Atleta> atletas = new ArrayList<>();

        Iterator it = aux.iterator();
        while (it.hasNext()){
            Atleta a = (Atleta) it.next();
            if (a.getCategoria().equalsIgnoreCase(categoria)){
                atletas.add(a);
            }
        }
        atletas.sort(new Comparator<Atleta>() {
            @Override
            public int compare(Atleta o1, Atleta o2) {
                return (int)(o2.getMarca()-o1.getMarca());
            }
        });
        System.out.println(atletas);
    }

    public int participantesPorPais(String pais){
        int contador=0;
        Collection<Atleta> aux = lista_atletas.values();

        Iterator it = aux.iterator();
        while (it.hasNext()){
            Atleta a = (Atleta) it.next();
            if (a.getPais().equalsIgnoreCase(pais)){
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        return "Maraton{" +
                "lista_atletas=" + lista_atletas +
                '}';
    }
}
