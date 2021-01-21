import java.util.Arrays;

public class insertarPrincipio {
    public static void main(String[] args) {
        int[] array = {3,4,5,6,7};
        System.out.println(Arrays.toString(insertarPrimero(array,15)));
    }

    public static int[] insertarPrimero(int[] v, int num){
        int[] aux = new int[v.length+1];

        aux[0] = num;

        for (int i = 0; i < v.length; i++) {
            aux[i+1] = v[i];
        }
        return aux;
    }
}
