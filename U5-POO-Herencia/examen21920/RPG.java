package U5.examen21920;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class RPG {
    Personajes [] personajes;
    private int cantMax;

    public RPG() {
        this.personajes = new Personajes[0];
        this.cantMax = 10;
    }

    public Personajes[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personajes[] personajes) {
        this.personajes = personajes;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public void addPersonajes(Personajes p){
        if (personajes.length>=cantMax){
            System.out.println("Cantidad maxima de personajes alcanzada");
        } else {
            personajes = Arrays.copyOf(personajes,personajes.length+1);
            personajes[personajes.length-1] = p;
        }
    }

    public void borrarMuertos(){
        Personajes[] vivos = new Personajes[0];
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i].energia>0){
                vivos = Arrays.copyOf(vivos,vivos.length+1);
                vivos[vivos.length-1] = personajes[i];
            }

        }
        personajes = vivos;
    }

    public void mostrarEstado(){
        Arrays.sort(personajes);
        System.out.println(Arrays.toString(personajes));
    }

    public void mostrarxAtaque(){
        Arrays.sort(personajes, new ComparadorAtaque());
        System.out.println(Arrays.toString(personajes));
    }

    public void mostrarxDefensa(){
        Arrays.sort(personajes, new ComparadorDefensa());
        System.out.println(Arrays.toString(personajes));
    }

    public boolean hayGanador() {
        if (personajes.length == 1) {
            System.out.println("TENEMOS UN GANADOR");
            System.out.println(personajes[0]);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "RPG{" +
                "personajes=" + Arrays.toString(personajes) +
                ", cantMax=" + cantMax +
                '}';
    }
}

