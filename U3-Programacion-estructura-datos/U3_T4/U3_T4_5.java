package com.abg;

// Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios
// entre 200 y 300. A continuación, el programa debe mostrar los números de la diagonal que va desde la esquinas
// superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo y la media de los números que hay
// en esa diagonal.

public class U3_T4_5 {
    public static void main(String[] args) {
        int[][] num = new int[10][10];
        long suma = 0;
        int cont = 0, max = 0, min = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random()*100)+200;

                if (i==j) {
                    suma += num[i][j];
                    cont++;

                    if (i == 0 && j == 0) {
                        max = num[i][j];
                        min = num[i][j];
                    } else {
                        if (max < num[i][j]) {
                            max = num[i][j];
                        }
                        if (min > num[i][j]) {
                            min = num[i][j];
                        }
                    }
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }

        System.out.println();

        System.out.println("La suma es "+suma);
        System.out.println("La media es "+(double)suma/cont);
        System.out.println("El maximo es "+max);
        System.out.println("El minimo es "+min);

    }
}
