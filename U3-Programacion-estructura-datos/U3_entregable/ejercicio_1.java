
// Define la función mezcla con la siguiente cabecera:
//
//public static int[] mezcla(int[] a, int[] b)
//
//Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de mezclar los números de
// ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a, etc. Los vectores y b pueden tener
// longitudes diferentes; por tanto, si se terminan los números de un array se terminan de coger todos los que quedan del otro.
//
//Ejemplos:
//
//Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
//
//Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
//
//Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
//
//Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {};
        int[] b = {};
        int tam1,tam2;

        System.out.println("Introduce el tamaño de a");
        tam1 = sc.nextInt();
        System.out.println("Introduce el tamaño de b");
        tam2 = sc.nextInt();

        a = new int[tam1];
        b = new int[tam2];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce los numeros para a");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("Introduce los numeros para b");
            b[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(mezcla(a, b)));

    }

    public static int[] mezcla(int[] a, int[] b){
        int[] resultado;
        int cont1=0,cont2=0;

        resultado = Arrays.copyOf(a,a.length+b.length);

        for (int i = 0; i < resultado.length; i++) {
                if (cont1<a.length && cont2<b.length){
                    resultado[i] = a[cont1];
                    cont1++;
                    i++;
                    resultado[i] = b[cont2];
                    cont2++;
                } else if(cont1<a.length){
                    resultado[i] = a[cont1];
                    cont1++;
                } else if (cont2<b.length) {
                    resultado[i] = b[cont2];
                    cont2++;
                }
        }

        return resultado;
    }
}