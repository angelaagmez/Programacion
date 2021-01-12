import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        do {
            System.out.println("Introduzca la altura de la piramide maya");
            altura = sc.nextInt();
        } while (altura<3);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura-1; j++) {
                if (i==altura-1 || i%2==0 || j==altura-2 || j%3==0){
                    System.out.print("***");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }

    }
}
