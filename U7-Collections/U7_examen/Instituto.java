package Bonilla_Gomez_U7_entrega;

import java.io.*;
import java.util.*;

public class Instituto{
    private String nombre;
    Map<String, ArrayList<Alumnos>> lista_alumnos;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.lista_alumnos = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, ArrayList<Alumnos>> getLista_alumnos() {
        return lista_alumnos;
    }

    public void setLista_alumnos(Map<String, ArrayList<Alumnos>> lista_alumnos) {
        this.lista_alumnos = lista_alumnos;
    }

    public void addAlumnoUnidad(Alumnos alumno, String unidad){

        if (!lista_alumnos.containsKey(unidad)){
            lista_alumnos.put(unidad,new ArrayList<>());
        }

        lista_alumnos.get(unidad).add(alumno);
    }

    public void mostrarTodosAlumnosOrdenados(){
        List<String> apellidos = new ArrayList<>(lista_alumnos.keySet());
        List<Alumnos> alumnos = new ArrayList<>();

        for (int i = 0; i < apellidos.size(); i++) {
            alumnos.addAll(lista_alumnos.get(apellidos.get(i)));
        }

        alumnos.sort((o1, o2) -> o1.getApellidos().compareToIgnoreCase(o2.getApellidos()));
        System.out.println(alumnos);
    }

    public String obtenerUnidadAlumno(String id){
        List<String> alumnos = new ArrayList<>(lista_alumnos.keySet());

        Alumnos a1 = new Alumnos("","","","");
        a1.setGuardarId(id);

        for (int i = 0; i < alumnos.size(); i++) {
            if (lista_alumnos.get(alumnos.get(i)).contains(a1)){
               return lista_alumnos.get(alumnos.get(i)).get(lista_alumnos.get(alumnos.get(i)).indexOf(a1)).getUnidad();
            }
        }
            return "Alumno no disponible";
        }

    public void mostrarAlumnosUnidad(String unidad){
        if (lista_alumnos.containsKey(unidad)){
            lista_alumnos.get(unidad).sort((o1, o2) -> o1.getDni().compareToIgnoreCase(o2.getDni()));
        }
    }

    public void cargarAlumnos(){
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("./src/Bonilla_Gomez_U7_entrega/alumnos.dat"));

            while (true){
                Alumnos alum = (Alumnos) leer.readObject();
                if (alum!=null){
                    addAlumnoUnidad(alum,alum.getUnidad());
                }
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Se han cargado los datos");
        }
    }

    public void guardarAlumnos() {
        List<String> alum = new ArrayList<>(lista_alumnos.keySet());
        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/Bonilla_Gomez_U7_entrega/alumnos.dat"));

            for (int i = 0; i < alum.size(); i++) {
                for (int j = 0; j < lista_alumnos.get(alum.get(i)).size(); j++) {
                    escribir.writeObject(lista_alumnos.get(alum.get(i)).get(j));
                }
            }
            escribir.close();
        } catch (IOException e) {
            System.out.println("Se han guardado los datos");
        }
    }



    @Override
    public String toString() {
        return "Instituto{" +
                '\n' +"nombre='" + nombre + '\n' +
                ", lista_alumnos: "+'\n' + lista_alumnos +
                '}';
    }
}
