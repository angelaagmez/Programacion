package com.abg;

// Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos almacenar en la variable
// booleana "jasp" el valor:
//verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los ingresos superan los 28000 (euros).
//falso. En caso contrario.
//escribe el código necesario para inicializar "jasp" en una línea.

import java.util.Scanner;

public class Ejercicio7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad,nivel_de_estudios,ingresos;
        boolean jasp;

        System.out.println("Introduce la edad");
        edad = sc.nextInt();

        System.out.println("Introduce el nivel de estudios");
        nivel_de_estudios = sc.nextInt();

        System.out.println("Introduce los ingresos");
        ingresos = sc.nextInt();

        if (edad<=28 && nivel_de_estudios>3 && ingresos>28000){
            jasp = true;
        } else{
            jasp = false;
        }

        // jasp (edad<=28 && nivel_de_estudios>3 && ingresos>28000) ? true : false;

        System.out.println(jasp);

    }
}

