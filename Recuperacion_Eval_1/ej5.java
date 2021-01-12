import javax.swing.text.MutableAttributeSet;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class ej5 {
     public static void main(String[] args) {
         int[][] num = new int[4][4];

         for (int i = 0; i < num.length; i++) {
             for (int j = 0; j < num[i].length; j++) {
                 num[i][j] = (int)(Math.random()*40);
             }
             System.out.println(Arrays.toString(num[i]));
         }

         System.out.println("");
         System.out.println(Arrays.deepToString(eliminarFilasPares(num)));
         System.out.println(Arrays.deepToString(eliminarFilasImpares(num)));


    }

    public static int[][] eliminarFilasPares(int[][] matriz){
        int[][] aux = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i%2!=0){
                    aux[i][j] = matriz[i][j];
                }
            }
        }
        return aux;
    }

    public static int[][] eliminarFilasImpares(int[][] matriz){
        int[][] aux = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i%2==0){
                    aux[i][j] = matriz[i][j];
                }
            }
        }
        return aux;
    }
}
