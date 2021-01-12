import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el numero");
        num = sc.nextInt();

        int cont = 0;

        for (int i = 0; i < num; i++) {
            num = num%10;
            cont++;
        }

        if (cont>5){
            System.out.println("Error. El numero tiene mas de 5 digitos");
        } else {
            System.out.println("El numero tiene "+cont+" digitos");
        }

    }
}
