import java.util.Arrays;

public class sumaFilaColumDiagonal {
    public static void main(String[] args) {
        int[][] num = new int[5][5];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int)(Math.random()*40);
            }
            System.out.println(Arrays.toString(num[i]));
        }

        int sumaf = 0;

        // Suma fila

        int fila = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sumaf += num[fila][j];
            }
        }

        System.out.println("Suma fila: "+sumaf);

        // Suma columna

        int sumac = 0;
        int columna = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sumac += num[i][columna];

            }
        }

        System.out.println("Suma columna: "+sumac);

        // suma diagonal
        int sumad = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (i==j){
                    sumad += num[i][j];
                }
            }
        }

        System.out.println("Suma diagonal: "+sumad);

    }
}
