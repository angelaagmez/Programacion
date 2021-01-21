// En la clase CuentaCorriente, sobrecargar los constructores para que permitan crear objetos:
//
//-solo con el saldo inicial, no serán necesarios los datos del titular. Por defecto el límite de descubierto será 0 euros.
//
//-con un saldo inicial, con un límite de descubierto y con el DNI del titular de la cuenta.

public class U4_T1_2 {
    public static void main(String[] args) {
        CuentaCorriente2 c1 = new CuentaCorriente2("Pepe Perez", "11111111X");
        CuentaCorriente2 c2 = new CuentaCorriente2("Rosa Lopez", "22222222Y");
        CuentaCorriente2 c3 = new CuentaCorriente2(100);
        CuentaCorriente2 c4 = new CuentaCorriente2(200,60,"33333333W");

        c1.mostrarInfo();
        System.out.println("");
        c2.mostrarInfo();
        System.out.println("");
        c3.mostrarInfo();
        System.out.println("");
        c4.mostrarInfo();
        System.out.println("");

    }
}


