package com.abg;

// Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
// Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen). Además, hemos de pasarle
// a la función el radio de la base y la altura.

public class U3_T1_3 {
    public static void main(String[] args) {
        cilindro(1,5,6);
    }

    public static double cilindro(int tipo, double radio, double altura) {
        if(tipo==1) {
            System.out.println("El área es "+2*Math.PI*radio*(altura+radio));
            return 2*Math.PI*radio*(altura+radio);
        } else if (tipo==2) {
            System.out.println("El volumen es "+Math.PI*radio*radio*altura);
            return Math.PI*radio*radio*altura;
        } else {
            System.out.println("Error");
            return 0;
        }
    }

}
