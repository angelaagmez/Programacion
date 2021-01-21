package U4_T2;

import java.util.Arrays;

public class Lista {
    private int[] tabla;

    public Lista() {
        this.tabla = new int[10];
    }

    public Lista(int num) {
        this.tabla = new int[num];
    }

    public int[] getTabla() {
        return tabla;
    }

    public void setTabla(int[] tabla) {
        this.tabla = tabla;
    }

    public void rellenarTabla(int indice, int num){
        if (indice>=0 && indice<tabla.length){
            tabla[indice] = num;
        } else {
            System.out.println("Indice fuera de rango");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }

    public int numElementos() {
        System.out.println("La lista tiene "+tabla.length+" elementos");
        return tabla.length;
    }

    public int[] insertarNumFinal(int num) {
        int[] aux = new int[tabla.length+1];

        for (int i = 0; i < tabla.length; i++) {
            aux[i] = tabla[i];
        }

        aux[tabla.length] = num;

        return aux;
    }

    public int[] insertarNumPrinc(int num) {
        int[] aux = new int[tabla.length+1];
        aux[0] = num;

        for (int i = 0; i < tabla.length; i++) {
            aux[i+1] = tabla[i];
        }
        return aux;
    }

    public int[] insertarNumCualquierLugar(int num, int pos) {
        int[] aux = new int[tabla.length+1];

        for (int i = 0; i < aux.length; i++) {
            if (i<pos) {
                aux[i] = tabla[i];
            } else if (i == pos){
                aux[i] = num;
            } else {
                aux[i] = tabla[i-1];
            }
        }

        return aux;
    }

    public int[] insertarOtraLista(int[] lista) {
        int[] union = new int[tabla.length+lista.length];

        for (int i = 0; i < union.length; i++) {
            union[i] = tabla[i];
            union[i+tabla.length] = lista[i];
        }

        return union;
    }

    public void borrarElemento(int pos) {
        int[] aux = new int[0];

        for (int i = 0; i < tabla.length; i++) {
            if (i<pos) {
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = tabla[i];
            } else if (i>pos){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = tabla[i];
            }
        }
        tabla = aux;
    }

    public int obtenerElemento(int pos) {
        if (pos>=0 && pos<tabla.length){
            return tabla[pos];
        } else {
            return -1;
        }
    }

    public int buscarNum(int num) {
        for (int i = 0; i < tabla.length; i++) {
            if (num == tabla[i]) {
                return i;
            }
        }
        return -1;
    }

    public String cambiarCadena() {
        String cadena = "";
        for (int i = 0; i < tabla.length; i++) {
            cadena += tabla[i];
        }
        return cadena;
    }
}
