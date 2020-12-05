package com.abg;

// Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un alfil
// que se encuentra en esa posición. Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero
// cuenta con64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.

public class U3_T4_4 {
    public static void main(String[] args) {
        int[] filas = {8,7,6,5,4,3,2,1};
        String[] columnas = {"a","b","c","d","e","f","g","h"};

        int filaInicial = 3;
        int columnaInicial =3;


        System.out.println("Posición inicial:"+columnas[columnaInicial]+filas[filaInicial]);

        //DIAGONAL SUP-DCHA
        int fila = filaInicial-1;
        int columna = columnaInicial+1;
        while (fila>=0 && fila<8 && columna>=0 && columna<8) {
            System.out.print(columnas[columna]+filas[fila]+" ");
            fila--;
            columna++;

        }

        fila = filaInicial-1;
        columna = columnaInicial-1;

        //DIAGONAL SUP-IZQDA
        while (fila>=0 && fila<8 && columna>=0 && columna<8) {
            System.out.print(columnas[columna]+filas[fila]+" ");
            fila--;
            columna--;
        }

        fila = filaInicial+1;
        columna = columnaInicial+1;

        //DIAGONAL INF-DCHA
        while (fila>=0 && fila<8 && columna>=0 && columna<8) {
            System.out.print(columnas[columna]+filas[fila]+" ");
            fila++;
            columna++;
        }

        fila = filaInicial+1;
        columna = columnaInicial-1;

        //DIAGONLA INF-IZQDA

        while (fila>=0 && fila<8 && columna>=0 && columna<8) {
            System.out.print(columnas[columna]+filas[fila]+" ");
            fila++;
            columna--;
        }


    }
}
