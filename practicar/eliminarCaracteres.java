import java.util.Scanner;

public class eliminarCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, resultado="";

        System.out.println("Introduce la frase");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)!='a'){
                resultado += frase.charAt(i);
            }
        }

        System.out.println(resultado);
    }
}
