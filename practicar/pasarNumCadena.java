import java.util.Arrays;

public class pasarNumCadena {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
        String cadena = "";

        for (int i = 0; i < num.length; i++) {
            cadena += num[i];
        }

        System.out.println("En vector: "+Arrays.toString(num));
        System.out.println("En cadena: "+cadena);

    }
}
