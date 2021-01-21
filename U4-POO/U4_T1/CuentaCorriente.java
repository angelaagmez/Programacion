package U4_T1;//  Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo son:
//  saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que ya está a cero),
//  nombre y DNI del titular. Las operaciones típicas con una cuenta corriente son:
//
//-Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de
// descubierto será de -50 euros.
//
//-Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe indicar, por
// pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación. Además, deberá devolver
// un valor booleano que indique lo mismo.
//
//-Ingresar dinero: se incrementa el saldo.
//
//-Mostrar información: muestra la información de la cuenta corriente.
//
// Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas, y la visibilidad
// de sus atributos para que:
//
//-saldo y limite no sean visibles para otras clases
//
//-nombre sea oúblico para cualquier clase
//
//-dni solo sea visible por clases vecinas
//
// Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo banco. Añadir un atributo que almacene
// el nombre del banco (que es único) en la clase CuentaCorriente. Diseñar un método que permita modificar el nombre del banco (al que pertenecen todas las cuentas corrientes)

public class CuentaCorriente {
    private double saldo;
    private double limite;
    public String nombre;
    public String dni;
    // static String banco;
    Banco b;

    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limite = -50;
    }

    public boolean sacarDinero(double cantidad) {
        if (this.saldo - cantidad > this.limite) {
            this.saldo -= cantidad;
            return true;
        } else {
            System.out.println("Limite superado. No se puede sacar esa cantidad de dinero.");
            return false;
        }
    }

    public void ingresarDinero(double cantidad) {

        this.saldo += cantidad;
    }

    public void mostrarInfo() {
        System.out.println(this.nombre);
        System.out.println(this.dni);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
       // System.out.println("Entidad: " + CuentaCorriente.banco);

    }

    /*
    public static void cambiarBanco(String bancoNuevo) {
        banco = bancoNuevo;
    }
     */

    public CuentaCorriente(double saldo, double limite, String nombre, String dni, Banco b) {
        this.saldo = saldo;
        this.limite = limite;
        this.nombre = nombre;
        this.dni = dni;
        this.b = b;
    }

    public CuentaCorriente(double saldo, String nombre, String dni) {
        this(saldo,-50,nombre,dni,null);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Banco getB() {
        return b;
    }

    public void setB(Banco b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "saldo=" + saldo +
                ", limite=" + limite +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", b=" + (b==null ? "SIN BANCO" : b.toString())  +
                '}';
    }
}
