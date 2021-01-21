import java.util.Scanner;

public class cogerCaractMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase1, frase2 = "";
        char caracter;
        double dividir;

        System.out.println("Introduce la frase");
        frase1 = sc.nextLine();

        dividir = (int) Math.floor((frase1.length()-1)/2);
        caracter = frase1.charAt((int)dividir);
        frase2 = frase2 + caracter;

        System.out.println("El caracter del medio es: "+caracter);

        if (frase2.equals(" ")){
            System.out.println("Es un espacio");
        }
    }
}
