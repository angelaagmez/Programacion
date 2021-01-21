package U4_T2;

import java.util.Arrays;

public class PilaTabla {
    private int[] pila;

    public PilaTabla() {
        this.pila = new int[0];
    }

    public int[] getPila() {
        return pila;
    }

    public void setPila(int[] pila) {
        this.pila = pila;
    }

    public void apilar(int num) {
        this.pila = Arrays.copyOf(this.pila,this.pila.length+1);
        this.pila[this.pila.length-1] = num;
    }

    public boolean desapilar() {
        if (pila.length==0){
            return false;
        } else {
            this.pila = Arrays.copyOf(this.pila,this.pila.length-1);
            return true;
        }
    }

    @Override
    public String toString() {
        String resultado ="";
        for (int i = pila.length-1; i >= 0 ; i--) {
            resultado += "| "+pila[i]+" |"+"\n";
            resultado += "_____\n";
        }
        return resultado;
    }
}
