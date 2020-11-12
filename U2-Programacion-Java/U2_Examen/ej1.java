import java.util.Scanner;

// Escribe un programa que pida dos números por teclado y que luego mezcle en dos números diferentes los dígitos pares
// y los impares. Se van comprobando los dígitos de la siguiente manera: primer dígito del primer número, primer dígito
// del segundo número, segundo dígito del primer número, segundo dígito del segundo número, tercer dígito del primer
// número... Para facilitar el ejercicio, podemos suponer que el usuario introducirá dos números de la misma longitud
// y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para admitir números largos.

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1,num2,cifra;
        int cantidad_num,par,impar;

        cantidad_num = 0;
        cifra = 0;
        par = 0;
        impar = 0;

        System.out.println("Introduce el primer numero");
        num1 = sc.nextLong();

        System.out.println("Introduce el segundo numero");
        num2 = sc.nextLong();

        while(num1>0){
            cantidad_num = (int)Math.floor(Math.log10(num1));
            cifra =  (long)(num1/ Math.pow(10,cantidad_num));
            num1 = (long)(num1 - cifra*Math.pow(10,cantidad_num));



        }

        System.out.println("El numero formado por los digitos pares es: ");
        System.out.println("El numero formado por los digitos impares es: ");


    }
}
