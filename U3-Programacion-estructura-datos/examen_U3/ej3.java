
// Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países.
// El array que contiene los nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}.
// Los datos sobre las estaturas se deben simular mediante un array de 4 filas por 10 columnas con números aleatorios
// generados al azar entre 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de los países se
// deben mostrar utilizando el array de países (no se pueden escribir directamente).

import java.lang.reflect.Array;
import java.util.Arrays;

public class ej3 {
    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] estaturas = new int[4][10];

        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = (int) (Math.random() * 141 + 70);
            }
        }

        System.out.println(Arrays.toString(pais));
        System.out.println(" ");

        for (int i = 0; i < estaturas.length; i++) {
            System.out.println(Arrays.toString(estaturas[i]));
        }

        int max0 = 0, max1 = 0, max2 = 0, max3 = 0;
        int min0 = 0, min1 = 0, min2 = 0, min3 = 0;
        int suma0 = 0, suma1 = 0, suma2 = 0, suma3 = 0;;

        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[i].length; j++) {
                if (i == 0) {                       // max = estaturas[i][j]  - min = estaturas[i][j]
                    if (max0 < estaturas[i][j]) {
                        max0 = estaturas[i][j];
                    } else{                         // else if (min>estaturas[i][j]
                        min0 = estaturas[i][j];
                    }
                    suma0 += estaturas[i][j];
                }


                if (i == i) {
                    if (max1 < estaturas[i][j]) {
                        max1 = estaturas[i][j];
                    } else {
                        min1 = estaturas[i][j];
                    }
                    suma1 += estaturas[i][j];
                }

                if (i == 2) {
                    if (max2 < estaturas[i][j]) {
                        max2 = estaturas[i][j];
                    } else {
                        min2 = estaturas[i][j];
                    }
                    suma2 += estaturas[i][j];
                }

                if (i == 3) {
                    if (max3 < estaturas[i][j]) {
                        max3 = estaturas[i][j];
                    } else {
                        min3 = estaturas[i][j];
                    }
                    suma3 += estaturas[i][j];
                }


            }
        }


        System.out.println(" ");
        System.out.println("Maximo "+pais[0]+" : "+max0);
        System.out.println("Minimo "+pais[0]+" : "+min0);
        System.out.println("Suma alturas "+pais[0]+" : "+suma0);
        System.out.println("Media alturas "+pais[0]+" : "+(suma0/10));

        System.out.println(" ");
        System.out.println("Maximo "+pais[1]+" : "+max1);
        System.out.println("Minimo "+pais[1]+" : "+min1);
        System.out.println("Suma alturas "+pais[1]+" : "+suma1);
        System.out.println("Media alturas "+pais[1]+" : "+(suma1/10));

        System.out.println(" ");
        System.out.println("Maximo "+pais[2]+" : "+max2);
        System.out.println("Minimo "+pais[2]+" : "+min2);
        System.out.println("Suma alturas "+pais[2]+" : "+suma2);
        System.out.println("Media alturas "+pais[2]+" : "+(suma2/10));

        System.out.println(" ");
        System.out.println("Maximo "+pais[3]+" : "+max3);
        System.out.println("Minimo "+pais[3]+" : "+min3);
        System.out.println("Suma alturas "+pais[3]+" : "+suma3);
        System.out.println("Media alturas "+pais[3]+" : "+(suma3/10));



    }
}
