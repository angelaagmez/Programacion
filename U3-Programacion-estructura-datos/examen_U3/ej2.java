
// Define la función convierteArrayEnString con la siguiente cabecera:
//public static String convierteArrayEnString(int[] a)
//Esta función toma como parámetro un array que contiene números y devuelve
//una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
//vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
//devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
//“62 //


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num;
        int tam;

        System.out.println("Introduce el tamaño del array");
        tam = sc.nextInt();

        num = new int[tam];


        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*20);
        }

        System.out.println(Arrays.toString(num));

        convierteArrayEnString(num);
    }


    public static String[] convierteArrayEnString(int[] a){

        String[] cadena = new String[0];

        for (int i = 0; i < a.length; i++) {
            if (cadena[i].equals(a[i])) {
                a[i] = cadena[i];
                System.out.println(cadena[i]);
            }
        }

        return cadena;
    }
}
