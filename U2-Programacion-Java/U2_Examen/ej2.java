import java.util.Scanner;

// Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los dígitos pares por un lado, y los impares por otro. Los dígitos
//se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int  donde sea necesario para admitir números largos.

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num,cifra;
        int cantidad_num,par,impar;

        cantidad_num = 0;
        cifra = 0;
        par = 0;
        impar = 0;

        System.out.println("Introduzca un numero entero positivo");
        num = sc.nextLong();

        while(num>0){
            cantidad_num = (int)Math.floor(Math.log10(num));
            cifra =  (long)(num/ Math.pow(10,cantidad_num));
            num = (long)(num - cifra*Math.pow(10,cantidad_num));

            if (cifra%2!=0){
                impar++;
            } else {
                par++;
            }

        }


        System.out.println("Digitos pares: "+par);
        System.out.println("Digitos impares: "+impar);

        System.out.println("Suma de digitos pares: ");
        System.out.println("Suma de digitos impares: ");

    }
}

