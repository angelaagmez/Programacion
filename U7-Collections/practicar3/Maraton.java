package practicar3;

import java.io.*;
import java.util.*;

public class Maraton{
    private Map<Integer,Atletas> lista_atletas;

    public Maraton() {
        this.lista_atletas = new HashMap<>();
    }

    public Map<Integer, Atletas> getLista_atletas() {
        return lista_atletas;
    }

    public void setLista_atletas(Map<Integer, Atletas> lista_atletas) {
        this.lista_atletas = lista_atletas;
    }

    public void cargarAtletas(){
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("./src/practicar3/maraton.dat"));
            while (true){
                Atletas at = (Atletas) leer.readObject();
                lista_atletas.put(at.getDorsal(),at);
            }

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }

    public void guardarAtletas(){
        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/practicar3/maraton.dat"));
            Collection<Atletas> aux = lista_atletas.values();
            Iterator it = aux.iterator();
            while (it.hasNext()){
                Atletas at = (Atletas) it.next();
                escribir.writeObject(at);
            }
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void inscribirAtletas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del atleta");
        String nombre = sc.nextLine();
        System.out.println("Introduce el pais del atleta");
        String pais = sc.nextLine();
        System.out.println("Introduce la categoria del atleta");
        String categoria = sc.nextLine();

        Atletas at = new Atletas(nombre,pais,categoria);

        lista_atletas.put(at.getDorsal(),at);

        System.out.println("Ha acabado la carrera? ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("si")){
            System.out.println("Introduce la marca ");
            double marca = sc.nextDouble();
            lista_atletas.get(at.getDorsal()).setMarca(marca);
            lista_atletas.get(at.getDorsal()).setFinisher(true);
        }
    }

    public void guardarTiempo(int dorsal,double tiempo){
        if (lista_atletas.containsKey(dorsal)){
            if (tiempo>0){
                lista_atletas.get(dorsal).setMarca(tiempo);
                lista_atletas.get(dorsal).setFinisher(true);
            }
        } else {
            System.out.println("No existe el atleta");
        }
    }

    public void borrarAtletas(int dorsal){
        if (lista_atletas.containsKey(dorsal)){
            lista_atletas.remove(dorsal);
        } else {
            System.out.println("No se encuentra el atleta");
        }
    }

    public void mostrarListaFinishers(){
        Collection<Atletas> aux = lista_atletas.values();
        ArrayList<Atletas> atletas = new ArrayList<>();

        Iterator it = aux.iterator();
        while (it.hasNext()){
            Atletas at = (Atletas) it.next();
            if (at.isFinisher()){
                atletas.add(at);
            }
        }
        atletas.sort(new Comparator<Atletas>() {
            @Override
            public int compare(Atletas o1, Atletas o2) {
                return (int)(o1.getMarca()-o2.getMarca());
            }
        });
        System.out.println(atletas);
    }

    public void mostrarListaCategoria(String categoria){
        Collection<Atletas> aux = lista_atletas.values();
        ArrayList<Atletas> atletas = new ArrayList<>();

        Iterator it = aux.iterator();
        while (it.hasNext()){
            Atletas at = (Atletas) it.next();
            if (at.getCategoria().equalsIgnoreCase(categoria)){
                atletas.add(at);
            }
        }
        atletas.sort(new Comparator<Atletas>() {
            @Override
            public int compare(Atletas o1, Atletas o2) {
                return (int)(o1.getMarca()-o2.getMarca());
            }
        });
        System.out.println(atletas);
    }

    public int participantesPorPais(String nombre){
        Collection<Atletas> aux = lista_atletas.values();
        int cont = 0;

        Iterator it = aux.iterator();
        while (it.hasNext()){
            Atletas at = (Atletas) it.next();
            if (at.getPais().equalsIgnoreCase(nombre)){
                cont++;
            }
        }
        return cont;
    }

    @Override
    public String toString() {
        return "Maraton{" +
                "lista_atletas=" + lista_atletas +
                '}';
    }
}
