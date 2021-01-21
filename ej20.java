import java.util.Arrays;

public class ej20 {
    public static void main(String[] args) {
        int[] num1 = {1223, 657, 912};
        int[] num2 = {907, 347, 56};
        int[] num3 = {473, 666, 842};

        System.out.println(ocurrencias(1,num1));
        System.out.println(ocurrencias(9,num2));
        System.out.println(ocurrencias(4,num3));
    }

    //public static int ocurrencias(int digito, int n){

    //}

    public static int ocurrencias(int digito, int[] a){
        int cont=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==digito){
                cont++;
            }
        }
        return cont;
    }

}
