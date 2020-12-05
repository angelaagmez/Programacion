package com.abg;

// Los diseñadores de una aplicación necesitan obtener ordenados los datos de una tabla, pero por restricciones de la
// aplicacion, la tabla debe permanecer inmutable. Una posible solucion es hacer una copia de la tabla y ordenarla,
// manteniendo intacta la tabla original, pero esta alternatia se ha desechado. En su lugar, se ha pensado en crear una
// segunda tabla donde se almacenan ordenados los indices de la tabla original. Se pide diseñar un algoritmo en el que,
// dada una tabla, cree otra donde se ordenen mediante los indices de la tabla original. Veamos un ejemplo:
// tablaOriginal: [3,5,1,4] tablaConIndices[2,0,3,1] Donde tablaConIndices especifica el lugar que ocupan de forma
// ordenada los datos de tablaOriginal. Por ejemplo, el primer elemento de tablaOriginal, que vale 3, en caso de
// ordenar los datos, ocupará la posición 2 (que le corresponde en tablaCon Indice). En este caso el i-ésimo elemento
// de tablaConIndices.

import java.util.Arrays;

public class tablas_ej52_libro {
    public static void main(String[] args) {
        int[] original = {3,5,1,4};

        System.out.println(Arrays.toString(ordenarConIndices(original)));

    }

    public static int[] ordenarConIndices(int[] orig){
        int[] aux = Arrays.copyOf(orig,orig.length);
        int[] index = new int[orig.length];

        Arrays.sort(aux);

        // Usamos un vector aux porque no podemos cambiar el tamaño del original y ordenamos los numeros

        for (int i = 0; i < orig.length; i++) {
            int valor = aux[i];

            for (int j = 0; j < orig.length; j++) {
                if (orig[j]==aux[i]){
                    index[i] = j;
                }
            }
        }

        return index;
    }

    // index[i] = Arrays.binarySearch(orig,aux[i]);  Me devuelve la posicion en la que esta un parametro en el vector que indiquemos
    // No nos sirve porque el array debe estar ordenado y nos devuelve otros valores

}
