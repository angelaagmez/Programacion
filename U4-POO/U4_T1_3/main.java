package U4_T1_3;

// Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas, y la visibilidad de sus atributos para que:
//
//-saldo y limite no sean visibles para otras clases
//
//-nombre sea oúblico para cualquier clase
//
//-dni solo sea visible por clases vecinas
//
//(Comprueba la visibilidad desde el programa principal comentando cada acceso o intento de acceso)

import U4_T1.CuentaCorriente;

public class main {
    public static void main(String[] args) {

        CuentaCorriente micuenta = new CuentaCorriente("Pepe Perez","44444444U");
    }
}
