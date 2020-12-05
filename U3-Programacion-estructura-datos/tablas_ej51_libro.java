package com.abg;

// El ayuntamiento de nuestra localidad nos ha encargado una aplicación que ayude a realizar encuestas estadísticas para
// conocer el nivel adquisitivo de los habitantes del municipio. Para ello, tendremos que preguntar el sueldo a cada
// persona encuestada. A priori no conocemos el numero de encuestados. Para finalizar la entrada de datos,
// introduciremos un sueldo con valor -1. Una vez terminada la entrada de datos, hemos de mostrar la siguiente
// información: Todos los sueldos introducidos ordenados de forma decreciente. El sueldo maximo y minimo. La media de
// los sueldos. Nota. Como a priori se desconoce el numero de sueldos, la tabla donde se almacenan los datos tendra que
// incrementar su tamaño conforme necesitemos mas espacio.

import java.util.Arrays;
import java.util.Scanner;

public class tablas_ej51_libro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = {};   // Tiene que ser Integer si usamos el collection para que sea decreciente
        int num;

        do{
            System.out.println("Introduce el numero");
            num=sc.nextInt();

            if (num!=-1){
                v = Arrays.copyOf(v,v.length+1);   // PARA QUE AÑADA UNO MAS
                v[v.length-1] = num;                        // CADA VEZ QUE INTRODUCIMOS DATOS
            }

        } while (num!=-1);

        System.out.println(Arrays.toString(v));

        int max = v[0];
        int min = v[0];
        int suma = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i]>max) {
                max = v[i];
            }
            if (v[i]<min) {
                min = v[i];
            }

            suma+=v[i];
        }

        System.out.println("El maximo es "+max);
        System.out.println("El minimo es "+min);
        System.out.println("La media es "+(float)(suma)/v.length);


        // USANDO LA FUNCION DE ORDENAR

        /*
        Arrays.sort(v, collections.reverseOrder());

        int max = v[0];
        int min = v[v.length-1];
        int suma = 0;

        suma += num;

        System.out.println("La media es "+(float)(suma)/v.length);
         */


    }
}
