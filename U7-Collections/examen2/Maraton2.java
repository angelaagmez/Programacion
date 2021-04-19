package examen2;

import java.io.*;
import java.util.*;

public class Maraton2 {
    private Map<Integer,Atleta2> lista_atletas;

    public Maraton2() {
        this.lista_atletas = new HashMap<>();
    }

    public void setLista_atletas(Map<Integer, Atleta2> lista_atletas) {
        this.lista_atletas = lista_atletas;
    }

    public Map<Integer, Atleta2> getLista_atletas() {
        return lista_atletas;
    }

    public void cargarAtletas(){
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("./src/examen2/maraton.data"));
            while (true){
                Atleta2 at = (Atleta2) leer.readObject();
                lista_atletas.put(at.getDorsal(),at);
            }
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Atletas cargados");
        }
    }

    public void guardarAtletas(){
        Collection<Atleta2> atletas = lista_atletas.values();
        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/examen2/maraton.data"));
            Iterator it = atletas.iterator();
            while (it.hasNext()){
                Atleta2 at = (Atleta2) it.next();
                escribir.writeObject(at);
            }
            escribir.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Atletas guardados");

    }

    public void inscribirAtleta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del atleta");
        String nombre = sc.nextLine();
        System.out.println("Introduce el pais del atleta");
        String pais = sc.nextLine();
        System.out.println("Introduce la categoria del atleta");
        String categoria = sc.nextLine();

        Atleta2 at = new Atleta2(nombre,pais,categoria);
        lista_atletas.put(at.getDorsal(),at);

        System.out.println("¿Ha acabado la carrera?");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("si")){
            lista_atletas.get(at.getDorsal()).setFinisher(true);
            System.out.println("Introduce la marca");
            int marca = sc.nextInt();
            lista_atletas.get(at.getDorsal()).setMarca(marca);
        }
    }

    public void guardarTiempo(int dorsal, int marca){
        if (lista_atletas.containsKey(dorsal)){
            if (marca>=0){
                lista_atletas.get(dorsal).setMarca(marca);
                lista_atletas.get(dorsal).setFinisher(true);
            } else {
                System.out.println("El tiempo debe ser mayor de 0");
            }
        } else {
            System.out.println("El atleta no se encuentra");
        }
    }

    public void borrarAtleta(int dorsal){
        if (lista_atletas.containsKey(dorsal)){
            lista_atletas.remove(dorsal);
        } else {
            System.out.println("El atleta no esta inscrito");
        }
    }

    public void mostrarListaFinishers(){
        Collection<Atleta2> atle = lista_atletas.values();
        LinkedList<Atleta2> atletas = new LinkedList<Atleta2>();

        Iterator it = atle.iterator();
        while (it.hasNext()){
            Atleta2 at = (Atleta2) it.next();
            if (at.isFinisher()){
                atletas.add(at);
            }
        }
        Collections.sort(atletas);
        System.out.println(atletas);
        }


    public void mostrarListaCategoria(String categoria){
        Collection<Atleta2> atle = lista_atletas.values();
        LinkedList<Atleta2> atletas = new LinkedList<>();

        Iterator it = atle.iterator();
        while (it.hasNext()){
            Atleta2 at = (Atleta2) it.next();
            if (at.getCategoria().equalsIgnoreCase(categoria)){
                atletas.add(at);
            }
        }
        Collections.sort(atletas);
        System.out.println(atletas);
    }

    public int participantesPorPais(String pais){
        Collection<Atleta2> atletas = lista_atletas.values();
        int cantidad=0;
        Iterator it = atletas.iterator();
        while (it.hasNext()){
            Atleta2 at = (Atleta2) it.next();
            if (at.getPais().equalsIgnoreCase(pais)){
                cantidad++;
            }
        }
        return cantidad;
    }

    @Override
    public String toString() {
        return "Maraton2{" +
                "lista_atletas=" + lista_atletas +
                '}';
    }
}


