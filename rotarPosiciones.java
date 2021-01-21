import java.util.Arrays;

public class rotarPosiciones {
    public static void main(String[] args) {
        int[][] num = new int [5][5];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int)(Math.random()*40);
            }
            System.out.println(Arrays.toString(num[i]));
        }

        rotar(num);
    }

    public static void rotar(int[][] v){
        int[] resultado = new int[0];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                resultado = Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1] = v[i][j];
            }
        }

        int cont1=0, cont2=0;

        for (int i = 0; i < resultado.length; i++) {
            if (i==0){
                cont1 = resultado[i];
                resultado[i] = resultado[resultado.length-1];
            } else {
                cont2 = resultado[i];
                resultado[i] = cont1;
                cont1 = cont2;
            }
        }

        int cont3=0;

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] = resultado[cont3];
                cont3++;
            }
        }

        System.out.println(Arrays.toString(resultado));
    }
}
