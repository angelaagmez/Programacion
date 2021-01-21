import java.util.Scanner;

public class darVueltaNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, invertido=0,resto;

        System.out.println("Introduce el numero");
        num = sc.nextInt();

        while (num>0){
            resto = num%10;
            invertido = invertido*10+resto;
            num /= 10;
        }

        System.out.println(invertido);
    }
}
