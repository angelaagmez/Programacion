
// En la clase CuentaCorriente, sobrecargar los constructores para que permitan crear objetos:
//
//-solo con el saldo inicial, no serán necesarios los datos del titular. Por defecto el límite de descubierto será 0 euros.
//
//-con un saldo inicial, con un límite de descubierto y con el DNI del titular de la cuenta.

public class CuentaCorriente2 {
        double saldo;
        double limite;
        String nombre;
        String dni;

        public CuentaCorriente2(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
            this.saldo = 0;
            this.limite = -50;
        }

        public CuentaCorriente2 (double saldo) {
            this.nombre = "";
            this.dni = "";
            this.saldo = saldo;
            this.limite = 0;
        }

        public CuentaCorriente2 (double saldo, double limite, String dni) {
            this.nombre = "";
            this.dni = dni;
            this.saldo = saldo;
            this.limite = limite;
        }


        public boolean sacarDinero(double cantidad) {
            if (this.saldo-cantidad > this.limite){
                this.saldo -= cantidad;
                return true;
            } else {
                System.out.println("Limite superado. No se puede sacar esa cantidad de dinero.");
                return false;
            }
        }

        public void ingresarDinero (double cantidad) {
            this.saldo += cantidad;
        }

        public void mostrarInfo() {
            System.out.println(this.nombre);
            System.out.println(this.dni);
            System.out.println("Saldo: "+this.saldo);
            System.out.println("Limite: "+this.limite);

        }
}
