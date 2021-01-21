import java.util.Arrays;

public class insertarPosicElegida {
    public static void main(String[] args) {
        int[] array = {3,4,5,6,7};
        System.out.println(Arrays.toString(insertar(array,3,10)));

    }

    public static int[] insertar(int[] v,int pos, int num){
        int[] aux = new int[v.length+1];
        for (int i = 0; i < aux.length; i++) {
            if (i<pos){
                aux[i] = v[i];
            } else if (i==pos){
                aux[i] = num;
            } else {
                aux[i] = v[i-1];
            }
        }
        return aux;
    }
}
