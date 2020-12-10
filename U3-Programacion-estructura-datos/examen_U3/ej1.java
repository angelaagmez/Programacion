
// Define la función esta  con la siguiente cabecera: public static boolean esta(int[] vector, int num)
//
//Que nos devuelva si un elemento está en un vector(array) unidimensional. Usar dicho elemente para construir la siguiente función:
//
//public static int[] unirSinRepetidos(int v1[],int[] v2)
//
//Que una los dos vectores pero sin elementos repetidos. Usar dicha función en el método main mostrando el vector
// resultado por pantalla.


import java.util.Arrays;

public class ej1 {
    public static void main(String[] args) {
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random()*11);
            vector2[i] = (int) (Math.random()*11);
        }

        System.out.println(Arrays.toString(vector1));
        System.out.println(Arrays.toString(vector2));
        System.out.println(Arrays.toString(unirSinRepetidos(vector1,vector2)));
        System.out.println(esta(vector1,6));

    }

    public static boolean esta(int[] vector, int num){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==num){
                return true;
            }
        }
        return false;
    }

    public static int[] unirSinRepetidos(int v1[],int[] v2){
        int[] union = new int[v1.length+v2.length];

        for (int i = 0; i < union.length; i++) {
             if (v1[i]!=v2[i]){
                 union[i] = v1[i];
                 union[i-v1.length] = v2[i];
             }
        }

        return union;

   }
}
