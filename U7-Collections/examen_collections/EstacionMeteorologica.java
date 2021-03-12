package examen_collections;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EstacionMeteorologica {
     private List<Medicion> med;
     private Coordenadas coord;

    public EstacionMeteorologica(String nombreFichero, Coordenadas coord) {
        this.med = new LinkedList<>();
        ObjectInputStream leer = null;
        try {
            leer = new ObjectInputStream(new FileInputStream(nombreFichero));
            while (true){
               med.add((Medicion) leer.readObject());
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if (leer != null) {
                    leer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        this.coord = coord;
    }

    public List<Medicion> getMed() {
        return med;
    }

    public void setMed(List<Medicion> med) {
        this.med = med;
    }

    public Coordenadas getCoord() {
        return coord;
    }

    public void setCoord(Coordenadas coord) {
        this.coord = coord;
    }

    public void addMedicion(Medicion m){
        med.add(m);
    }

    public void ordenaTemperaturasAsc(){
        med.sort((o1, o2) -> o1.getTemperatura()-o2.getTemperatura());
    }

    public void ordenaHumedadesDesc(){
        med.sort((o1, o2) -> o2.getHumedad()-o1.getHumedad());
    }

    public Medicion presionMaxima(){
        Iterator it = med.iterator();
        Medicion max = (Medicion) it.next();

        while (it.hasNext()){
            Medicion m = (Medicion) it.next();
            if (max.getPresion()<m.getPresion()){
             max = m;
            }
        }
        return max;
    }

    public boolean buscaMedicion(Medicion me){
        if (med.contains(me)){
            return true;
        }
        return false;
    }

    public void guardarFichero(String nombreFichero){
        try{
            BufferedWriter escribir = new BufferedWriter(new FileWriter("./src/examen_collections/"+nombreFichero));
            for (int i = 0; i <med.size() ; i++) {
                escribir.write(String.valueOf(med.get(i)));
                escribir.newLine();
            }
            escribir.flush();
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "EstacionMeteorologica{" +
                "med=" + med +
                ", coord=" + coord +
                '}';
    }
}
