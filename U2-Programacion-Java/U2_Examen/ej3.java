import java.util.Scanner;

// Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El programa debe pedir la altura.
// Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.println("Introduce la altura del reloj");
        altura = sc.nextInt();

        while (altura%2==0 || altura<3) {
            System.out.println("Error, debe ser un numero impar mayor o igual que 3.");
            System.out.println("Introduce de nuevo la altura del reloj");
            altura = sc.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if ( i==j || i==altura-1 || i==0 || i==(altura-2)+j || i==(altura-2)-j )  {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
