
// Crear una función unirMatrices que reciba dos matrices bidimensionales de cadenas y devuelva la unión de las dos matrices.
//
//Si la matrices no tiene la misma dimensión deberá devolver un vector bidimensional vacio.

import java.util.Arrays;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] matriz1;
        String [][] matriz2;
        int fila1, colum1, fila2, colum2;

        System.out.println("Introduce cuantas filas tendrá la matriz 1");
        fila1 = sc.nextInt();
        System.out.println("Introduce cuantas columnas tendrá la matriz 1");
        colum1 = sc.nextInt();

        matriz1 = new String[fila1][colum1];

        System.out.println("Introduce cuantas filas tendrá la matriz 2");
        fila2 = sc.nextInt();
        System.out.println("Introduce cuantas columnas tendrá la matriz 2");
        colum2 = sc.nextInt();

        matriz2 = new String[fila1][colum1];

        System.out.println(" ");
        sc.nextLine();

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.println("Introduce las palabras para la matriz 1");
                matriz1[i][j] = sc.nextLine();
            }
        }


        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("Introduce las palabras para la matriz 2");
                matriz2[i][j] = sc.nextLine();
            }
        }

        System.out.println("Matriz 1");
        for (int i = 0; i < matriz1.length; i++) {
            System.out.println(Arrays.toString(matriz1[i]));
        }

        System.out.println("Matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println(Arrays.toString(matriz2[i]));
        }

        System.out.println("Matriz resultante");
        System.out.println(Arrays.deepToString(unirMatrices(matriz1,matriz2)));
        unirMatrices(matriz1,matriz2);


    }

    public static String[][] unirMatrices(String[][] b1,String[][] b2){
        String[][] union = new String[b1.length+b2.length][b1.length+b2.length];

        for (int i = 0; i < union.length; i++) {
            for (int j = 0; j < union[i].length; j++) {
                if (b1.length==b2.length){
                    union[i][j] = b1[i][j];
                    union[i-b1.length][j-b1.length] = b2[i][j];
                } else {
                    union[i][j] = "{}";
                }
            }
        }

        return union;
    }
}
