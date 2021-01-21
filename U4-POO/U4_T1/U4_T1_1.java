package U4_T1;

public class U4_T1_1 {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("Pepe Perez", "11111111X");
        CuentaCorriente c2 = new CuentaCorriente("Rosa Lopez", "22222222Y");

        c1.ingresarDinero(100);
        c2.ingresarDinero(200);

        c1.sacarDinero(50);
        c2.sacarDinero(300);

        c1.mostrarInfo();
        System.out.println(" ");
        c2.mostrarInfo();

       /*
        CuentaCorriente.banco = "Bankia";

        c1.mostrarInfo();
        System.out.println(" ");
        c2.mostrarInfo();
        System.out.println("");

       CuentaCorriente.cambiarBanco("Santander");

        c1.mostrarInfo();
        System.out.println(" ");
        c2.mostrarInfo();
        System.out.println("");
        */

        System.out.println("");

        Banco b = new Banco("Santander","Santander");

        System.out.println(b);

        CuentaCorriente cb = new CuentaCorriente("Pepe Perez","12345678P");
        System.out.println(cb);

        cb.setB(b);
        System.out.println("");
        System.out.println(cb);

        Banco b2 = new Banco("BBVA",1000000,"BBVA");
        cb.setB(b2);
        System.out.println(cb);

    }
}
