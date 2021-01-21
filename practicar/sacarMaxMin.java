import java.util.Arrays;

public class sacarMaxMin {
    public static void main(String[] args) {
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*20);
        }

        System.out.println(Arrays.toString(num));

        int max=0, min=0;

        for (int i = 0; i < num.length; i++) {
            if (i==0){
                max = num[i];
                min = num[i];
            } else {
                if (max<num[i]){
                    max = num[i];
                }
                if (min>num[i]){
                    min = num[i];
                }
            }
        }

        System.out.println("Maximo: "+max);
        System.out.println("Minimo: "+min);

    }
}
