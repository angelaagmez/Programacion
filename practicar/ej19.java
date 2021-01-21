import java.util.Arrays;

public class ej19 {
    public static void main(String[] args) {
        int[][] num = new int[4][6];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(num[i]));
        }

        System.out.println(nEsimo(num, 4));
        System.out.println(nEsimo(num, 100));
        System.out.println(nEsimo(num, 7));

    }
    public static int nEsimo(int[][] n, int posicion) {
        int numero = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (numero == posicion) {
                    return n[i][j];
                }
                numero++;
            }
        }
        return -1;
    }

}
