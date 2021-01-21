package U4_T1;

// Diseñar la clase Banco de la que interesa guardar su nombre, capital y la dirección central. Los bancos tienen
// las siguientes restricciones:
//
//a) Siempre tienen que tener un nombre, que no puede ser modificado
//
//b) Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de euros al crearse.
//
//c) El capital y la dirección de un banco son modificables.
//
//Modificar la clase CuentaCorriente para que cada una esté vinculada a un objeto de tipo Banco. Escribir los métodos
// necesarios en la clase CuentaCorriente para gestionar el banco al que pertenece (cambiar de banco, mostrar la info de
// la cuenta, incluídos los datos del banco si lo tiene vinculado). Existe la posibilidad de que una cuenta corriente
// no esté vinculada a ningún banco.

public class Banco {
    private final String nombre;                // final = no se puede modificar
    private double capital;
    private String direccion;

    public Banco (String nombre, double capital, String direccion) {
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }

    public Banco(String nombre, String direccion) {
        this(nombre,5200000,direccion);
    }

    public void establecerCapital(double cap) {     // set - darle un valor a un atributo priv
        this.capital = cap;
    }

    public double obtenerCapital() {                // get - obtener valor
        return this.capital;
    }

    public void establecerDireccion(String dir){    // set
        this.direccion = dir;
    }

    public String obtenerDireccion() {              // get
        return this.direccion;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", capital=" + capital +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
