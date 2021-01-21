import java.util.Arrays;

public class borrarElemento {
    public static void main(String[] args) {
        int[] array = {3,4,5,6,7};
        System.out.println(Arrays.toString(borrar(array,2)));
        System.out.println(Arrays.toString(borrar(array,4)));
        System.out.println(Arrays.toString(borrar(array,0)));
    }

    public static int[] borrar(int[] v, int pos){
        int[] aux = new int[v.length];

        for (int i = 0; i < aux.length; i++) {
            if (i<pos){
                aux[i] = v[i];
            } else if (i>pos){
                aux[i-1] = v[i];
            }
        }


        return aux;
    }
}
