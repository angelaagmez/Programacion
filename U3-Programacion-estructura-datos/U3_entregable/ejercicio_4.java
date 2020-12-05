
// Realiza un programa que rellene un array de 5 filas por 9 columnas con
//números enteros positivos comprendidos entre 100 y 1000 (ambos incluidos). A
//continuación, el programa deberá dar la posición tanto del máximo como del
//mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.

import java.util.Arrays;

public class ejercicio_4 {
    public static void main(String[] args) {
        int[][] numeros = new int[5][9];
        int max=0, min=0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int)(Math.random()*900+100);
            }
        }


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i==0){
                    max = numeros[i][j];
                    min = numeros[i][j];
                } else  {
                    if (max<numeros[i][j]){
                        max = numeros[i][j];
                    }
                    if (min>numeros[i][j]){
                        min = numeros[i][j];
                    }
                }
            }
        }


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(Arrays.toString(numeros[i]));
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                if (numeros[i][j]==max){
                    System.out.println("Max en posicion: "+j+" "+i);
                } else if (numeros[i][j]==min){
                    System.out.println("Min en posicion: "+j+" "+i);
                }
            }
        }

        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);


    }
}
