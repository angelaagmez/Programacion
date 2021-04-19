package concursoPerros;

import java.io.*;
import java.util.*;

public class Concurso {
    private Map<String, ArrayList<Perro>> lista_perros;
    private String nombreConcurso;
    private String localidad;

    public Concurso(String nombreConcurso, String localidad) {
        this.lista_perros = new HashMap<>();
        this.nombreConcurso = nombreConcurso;
        this.localidad = localidad;
    }

    public Map<String, ArrayList<Perro>> getLista_perros() {
        return lista_perros;
    }

    public void setLista_perros(Map<String, ArrayList<Perro>> lista_perros) {
        this.lista_perros = lista_perros;
    }

    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void addDog(String raza, Perro perro){
        if (perro.getRaza().equalsIgnoreCase(raza)){
            if (!lista_perros.containsKey(raza)){
                lista_perros.put(perro.getRaza(),new ArrayList<>());
            }
            lista_perros.get(raza).add(perro);
        } else {
            System.out.println("No se encuentra el perro");
        }
    }

    public void disqualifyDog(Perro perro){
        if (lista_perros.containsKey(perro.getRaza())){
            if (lista_perros.get(perro.getRaza()).contains(perro)){
                lista_perros.get(perro.getRaza()).remove(perro);
            } else {
                System.out.println("No se encuentra el perro");
            }
        }
    }

    public int ownerDogs(int numSocio){
        Propietario p = new Propietario("","",numSocio,"");
        Collection<ArrayList<Perro>> aux = lista_perros.values();
        int cantPerros=0;

        Iterator it = aux.iterator();
        while (it.hasNext()){
            ArrayList<Perro> aux2 = (ArrayList<Perro>) it.next();
            for (Perro pe : aux2) {
                if (pe.getPropietario().equals(p)) {
                    cantPerros++;
                    System.out.println(pe);
                }
            }
        }

        if (cantPerros==0){
            System.out.println("Este propietario no tiene perros");
        }

        return cantPerros;
    }

   public void perrosPorPeso(String raza){
        if (lista_perros.containsKey(raza)){
            ArrayList<Perro> aux = new ArrayList<>();
            aux.sort(new Comparator<Perro>() {
                @Override
                public int compare(Perro o1, Perro o2) {
                    return (int) (o2.getPeso()-o1.getPeso());
                }
            });
            System.out.println(aux);
        } else {
            System.out.println("No se encuentra el perro");
        }
   }

   public void perrosPorEdad(String raza){
        if (lista_perros.containsKey(raza)){
            ArrayList<Perro> aux = new ArrayList<>();
            aux.sort(new Comparator<Perro>() {
                @Override
                public int compare(Perro o1, Perro o2) {
                    return o2.getEdad()-o1.getEdad();
                }
            });
            System.out.println(aux);
        } else {
            System.out.println("No se encuentra el perro");
        }
   }

   public void cargarPerros(){
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("./src/concursoPerros/perros.dat"));
            while (true){
                Perro p = (Perro) leer.readObject();
                addDog(p.getRaza(),p);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Datos cargados");
        }
   }

   public void guardarPerros(){
        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/concursoPerros/perros.dat"));
            Collection<ArrayList<Perro>> aux = lista_perros.values();

            Iterator it = aux.iterator();
            while (it.hasNext()){
                ArrayList<Perro> aux2 = (ArrayList<Perro>) it.next();
                for (Perro p:
                     aux2) {
                    escribir.writeObject(p);
                }
            }
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
   }

    @Override
    public String toString() {
        return "Concurso{" +
                "lista_perros=" + lista_perros +
                ", nombreConcurso='" + nombreConcurso + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
