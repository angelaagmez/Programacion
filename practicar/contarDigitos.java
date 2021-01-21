import java.util.Scanner;

public class contarDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el numero");
        num = sc.nextInt();

        String cont = Integer.toString(num);
        System.out.println("El numero tiene "+cont.length()+" digitos");
    }
}
