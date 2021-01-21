package U5.T1;

import java.util.Arrays;

public abstract class Instrumento {
    final int capacidad = 100;
    Notas[] notas;

    public Instrumento() {
        this.notas = new Notas[0];
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Notas[] getNotas() {
        return notas;
    }

    public void setNotas(Notas[] notas) {
        this.notas = notas;
    }

    public boolean add(Notas n){
        if (notas.length==capacidad){
            return false;
        } else {
            notas = Arrays.copyOf(notas,notas.length+1);
            notas[notas.length-1] = n;
            return true;
        }
    }

    public abstract void interpretar();
}
