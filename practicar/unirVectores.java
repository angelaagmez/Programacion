import java.util.Arrays;

public class unirVectores {
    public static void main(String[] args) {
        int[] num1 = new int[5];
        int[] num2 = new int[3];

        for (int i = 0; i < num1.length; i++) {
            num1[i] = (int)(Math.random()*20);
        }

        for (int i = 0; i < num2.length; i++) {
            num2[i] = (int)(Math.random()*20);
        }

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

        int[] union = new int[num1.length+num2.length];

        for (int i = 0; i < num1.length; i++) {
            union[i] = num1[i];
        }

        for (int i = 0; i < num2.length; i++) {
            union[i+num1.length] = num2[i];
        }

        System.out.println(Arrays.toString(union));
    }
}
