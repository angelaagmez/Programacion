package com.abg;

// le paso un numero y un vector, y borra del array el numero que se ha pasado

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class borrar_elemento {
    public static void main(String[] args) {
        int vector[] = {1,2,4,2,5,6};

        System.out.println(Arrays.toString(vector));

        vector = borrar(2,vector);

        System.out.println(Arrays.toString(vector));
    }

    public static int[] borrar(int num, int[] v) {
        Integer[] aux = new Integer[v.length];    // nuevo vector aux para guardar los num que queremos

        int contador = 0;                         // para saber longitud real de aux

        for (int i = 0; i < v.length; i++) {
            if (num != v[i]) {
                aux[contador] = v[i];            // para empezar de cero y asignarles valores del vector v
                contador++;
            }
        }

        v = new int[contador];                   // para formatear el vector y asignar longitud real de aux {0,0,0,0}

        for (int i = 0; i < v.length; i++) {
            v[i] = aux[i];                       //  igualar vectores y asignar a v los valores de aux
        }

        return v;
    }

}
