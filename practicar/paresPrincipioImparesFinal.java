import java.util.Arrays;

public class paresPrincipioImparesFinal {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(num));
        paresimpares(num);

    }

    public static void paresimpares(int[] v){
        int[] pares = new int[0];
        int[] impares = new int[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i]%2==0){
                pares = Arrays.copyOf(pares,pares.length+1);
                pares[pares.length-1] = v[i];
            } else {
                impares = Arrays.copyOf(impares,impares.length+1);
                impares[impares.length-1] = v[i];
            }
        }

        for (int i = 0; i < v.length; i++) {
            if (i<pares.length){
                v[i] = pares[i];
            } else {
                v[i] = impares[i-pares.length];
            }
        }

        int[] union = new int[pares.length+impares.length];

        for (int i = 0; i < pares.length; i++) {
            union[i] = pares[i];
        }

        for (int i = 0; i < impares.length; i++) {
            union[i+pares.length] = impares[i];
        }

        System.out.println(Arrays.toString(union));
    }
}
