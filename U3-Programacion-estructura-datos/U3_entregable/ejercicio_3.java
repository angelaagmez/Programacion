// Implementa una función con nombre corteza que sea capaz de extraer la capa
// exterior de un array bidimensional. Esta capa se extrae en forma de array de
// una dimensión. La extracción de números comienza en la esquina superior
// izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
// tanto el código de la función como el código de prueba que la usa. La cabecera
// de la función es la siguiente:
//
// public static int[] corteza(int[][] n)
//
// Por ejemplo, si el array bidimensional a es el que se muestra a continuación:
//
// 45 92 14 20 25 78
// 35 72 24 45 42 60
// 32 42 64 23 41 39
// 98 45 94 11 18 48
//
// El array unidimensional generado por corteza(a) sería el siguiente:
//
// 45 92 14 20 25 78 60 39 48 18 11 94 45 98 32 35


import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[4][6];
        int tam;


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int)(Math.random()*101);
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }

        //System.out.println(Arrays.toString(corteza(num,0)));
        System.out.println(Arrays.toString(corteza(num,5)));
       // System.out.println(Arrays.toString(corteza(num,0)));
        System.out.println(Arrays.toString(corteza(num,0)));

    }

    public static int[][] corteza(int[][] n, int pos){

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i][pos]);
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[pos][i]);
        }

        return n;
    }

}

