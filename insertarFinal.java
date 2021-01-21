import java.util.Arrays;

public class insertarFinal {
    public static void main(String[] args) {
        int[] array = {3,4,5,6,7};
        System.out.println(Arrays.toString(insertarPrimero(array,29)));
    }

    public static int[] insertarPrimero(int[] v, int num){
        int[] aux = new int[v.length+1];

        for (int i = 0; i < v.length; i++) {
            aux[i] = v[i];
        }

        aux[v.length] = num;

        return aux;
    }
}
