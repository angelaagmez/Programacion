import java.util.Arrays;

public class numSinRepetir {
    public static void main(String[] args) {
        int[][] cubo = new int[5][5];
        int num;

        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                do {
                    num = (int) (Math.random()*40);
                    if (!siEsta(cubo, i, j, num)) {
                        cubo[i][j] = num;
                    }
                } while (cubo[i][j]==0);
            }
        }

        for (int i = 0; i < cubo.length; i++) {
            System.out.println(Arrays.toString(cubo[i]));
        }
    }

    public static boolean siEsta(int[][] array, int altura, int anchura, int num) {
        // bucle filas completas
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (num == array[i][j]) {
                    return true;
                }
            }
        }

        // bucle filas incompletas
        for (int i = 0; i < anchura; i++) {
            if (num==array[altura][i]){
                return true;
            }
        }

        return false;
    }
}


