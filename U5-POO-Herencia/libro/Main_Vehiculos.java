package U5.libro;

import java.util.Scanner;

public class Main_Vehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;



        Bicicleta b1 = new Bicicleta(500);
        Coche c1 = new Coche(10000);

        while (true){
            System.out.println("Elige una opcion:\n " +
                    "1. Anda con la bicicleta\n" +
                    "2. Haz el caballito con la bicicleta\n" +
                    "3. Anda con el coche\n" +
                    "4. Quema rueda con el coche\n" +
                    "5. Ver kilometraje de la bicicleta\n" +
                    "6. Ver kilometraje del coche\n" +
                    "7. Ver kilometraje total\n" +
                    "8. Salir\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    b1.andarBici(50);
                    break;
                case 2:
                    b1.hacerCaballito();
                    break;
                case 3:
                    c1.andarCoche(300);
                    break;
                case 4:
                    c1.quemarRueda();
                    break;
                case 5:
                    System.out.println(b1);
                    break;
                case 6:
                    System.out.println(c1);
                    break;
                case 7:
                    System.out.println(Vehiculo.getKilometrosTotales());
                    break;
                case 8:
                    break;
            }
            if (opcion==8){
                break;
            }
        }


    }
}
