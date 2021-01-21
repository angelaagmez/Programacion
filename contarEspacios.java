import java.util.Scanner;

public class contarEspacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int cont=0;

        System.out.println("Introduce la frase");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' '){
                cont++;
            }
        }

        System.out.println("Hay "+cont+" espacios");
    }
}
