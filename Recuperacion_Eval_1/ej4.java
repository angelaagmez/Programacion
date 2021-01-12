import java.util.Arrays;

public class ej4 {
    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*82+18);
        }

        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            if (esPrimo(num)){
                System.out.println("**");
            }
        }
    }

    public static boolean esPrimo(int[] v){
        for (int i = 2; i < v.length; i++) {
            if(i%v[i]==0){
                return false;
            }
        }
        return true;
    }


}
