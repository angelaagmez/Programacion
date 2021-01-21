public class mostrarInverso {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};

        for (int i = num.length-1; i >= 0 ; i--) {
            System.out.print(num[i]);
        }
    }
}
