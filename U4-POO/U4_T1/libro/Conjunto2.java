package U4_T1.libro;

import U4_T2.Lista;

import java.util.Arrays;

public class Conjunto2 {
    int capacidad;
    int[] elementos;

    public Conjunto2() {
        this(10);
    }

    public Conjunto2(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new int[0];
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int[] getElementos() {
        return elementos;
    }

    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public int numElementos(){
        return elementos.length;
    }

    private boolean esta(int elemento){
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i]==elemento){
                return true;
            }
        }
        return false;
    }

    public boolean addElement(int nuevo){
        if (!esta(nuevo) && elementos.length<capacidad){
            elementos = Arrays.copyOf(elementos,elementos.length+1);
            elementos[elementos.length-1] = nuevo;
            return true;
        }
        return false;
    }

    public boolean addConjunto(Conjunto2 c){
        if (c.getElementos().length+this.getElementos().length<=10) {
            for (int i = 0; i < c.getElementos().length; i++) {
                if (!esta(c.getElementos()[i])) {
                    addElement(c.getElementos()[i]);
                }
            }
            return true;
        }
        return false;
    }

    public boolean removeElement(int elemento) {
        if (esta(elemento)){
            int[] resultado = new int[0];
            for (int i = 0; i < this.getElementos().length; i++) {
                if (this.getElementos()[i]!=elemento){
                    resultado = Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1] = this.getElementos()[i];
                }
            }
            elementos = resultado;
            return true;
        }
        return false;
    }

    public void removeConjunto(Conjunto2 conjunto){
        for (int i = 0; i < conjunto.getElementos().length; i++) {
            removeElement(conjunto.getElementos()[i]);
        }
    }

    @Override
    public String toString() {
        return "Conjunto{" +
                "capacidad=" + capacidad +
                ", elementos=" + Arrays.toString(elementos) +
                '}';
    }

    static boolean incluido(Conjunto2 c1, Conjunto2 c2){
        for (int i = 0; i < c1.getElementos().length; i++) {
            for (int j = 0; j < c2.getElementos().length; j++) {
                if (!c2.esta(c1.getElementos()[i])){
                    return false;
                }
            }
        }
        return true;
    }

    static Conjunto2 union(Conjunto2 c1,Conjunto2 c2) {
        Conjunto2 resultado = new Conjunto2(c1.getElementos().length+c2.getElementos().length);

        resultado.addConjunto(c1);
        resultado.addConjunto(c2);

        return resultado;
    }

    static Conjunto2 interseccion(Conjunto2 c1, Conjunto2 c2){
        Conjunto2 resultado = new Conjunto2(c1.getElementos().length+c2.getElementos().length);
        for (int i = 0; i < c1.getElementos().length; i++) {
            if (c2.esta(c1.getElementos()[i])){
                resultado.addElement(c1.getElementos()[i]);
            }
        }
        return resultado;
    }

    static Conjunto2 diferencia(Conjunto2 c1, Conjunto2 c2){
        Conjunto2 resultado = new Conjunto2(c1.getElementos().length+c2.getElementos().length);

        resultado.addConjunto(c1);
        resultado.removeConjunto(c2);

        return resultado;
    }

}
