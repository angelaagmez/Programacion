import javax.crypto.spec.PSource;
import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo;

        System.out.println("Introduce el numero");
        num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num%i==0){
                primo = false;
            }
        }
        primo = true;
    }
}
