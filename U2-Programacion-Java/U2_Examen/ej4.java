import java.util.Scanner;

// Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:
//
//
//• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), los días que ha
// estado de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
//• El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog. junior, un prog. senior o un jefe de proyecto
//respectivamente.
//• Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
//un 25% en caso de estar soltero y un 20% en caso de estar casado.

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cargo,dias,estado;
        double IRPF;

        IRPF = 0;


        System.out.println("Introduce el cargo del empleado: 1-Prog.junior, 2-Prog.senior, 3-Jefe de proyecto");
        cargo = sc.nextInt();

        System.out.println("Introduce los días que ha estado de viaje");
        dias = sc.nextInt();

        System.out.println("Introduce el estado civil del empleado: 1-Soltero, 2-Casado");
        estado = sc.nextInt();


        while (cargo>3 || estado>2){
        System.out.println("ERROR.Introduce el cargo del empleado: 1-Prog.junior, 2-Prog.senior, 3-Jefe de proyecto");
        cargo = sc.nextInt();

        System.out.println("Introduce los días que ha estado de viaje");
        dias = sc.nextInt();

        System.out.println("ERROR. Introduce el estado civil del empleado: 1-Soltero, 2-Casado");
        estado = sc.nextInt();
        }


            switch (cargo) {
                case 1:
                    System.out.println("Sueldo base: 950");
                    System.out.println("Dietas: "+dias*30);
                    System.out.println("Sueldo bruto: "+(950+(dias*30)));
                    if (estado==1) {
                        IRPF = (950+(dias*30))*0.25;
                        System.out.println("Retencion IRPF: "+IRPF);
                    } else {
                        IRPF = (950+(dias*30))*0.20;
                        System.out.println("Retencion IRPF: "+IRPF);
                    }
                    System.out.println("Sueldo neto: "+((950+(dias*30))-IRPF));
                    break;

                case 2:
                    System.out.println("Sueldo base: 1200");
                    System.out.println("Dietas: "+dias*30);
                    System.out.println("Sueldo bruto: "+(1200+(dias*30)));
                    if (estado==1) {
                        IRPF = (1200+(dias*30))*0.25;
                        System.out.println("Retencion IRPF: "+IRPF);
                    } else {
                        IRPF = (1200+(dias*30))*0.20;
                        System.out.println("Retencion IRPF: "+IRPF);
                    }
                    System.out.println("Sueldo neto: "+((1200+(dias*30))-IRPF));
                    break;

                case 3:
                    System.out.println("Sueldo base: 1600");
                    System.out.println("Dietas: "+dias*30);
                    System.out.println("Sueldo bruto: "+(1600+(dias*30)));
                    if (estado==1) {
                        IRPF = (1600+(dias*30))*0.25;
                        System.out.println("Retencion IRPF: "+IRPF);
                    } else {
                        IRPF = (1600+(dias*30))*0.20;
                        System.out.println("Retencion IRPF: "+IRPF);
                    }
                    System.out.println("Sueldo neto: "+((1600+(dias*30))-IRPF));
                    break;
            }



    }
}
