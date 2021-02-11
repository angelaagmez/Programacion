package U5.T2;

import java.util.Comparator;
import java.util.Objects;

public class Cliente implements Comparable<Cliente> {
    private String dni;
    private String nombre;
    private int edad;
    private double saldo;

    public Cliente(String dni, String nombre, int edad, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\n' +
                ", nombre='" + nombre + '\n' +
                ", edad=" + edad + '\n' +
                ", saldo=" + saldo + '\n' +
                '}';
    }


    @Override
    public int compareTo(Cliente o) {
        return dni.compareToIgnoreCase(o.dni);
    }

    /*
    Para ordenar por nombre:

    @Override
    public int compareTo(Cliente o) {
        return nombre.compareToIgnoreCase(o.nombre);
    }
     */

    /*
    Para ordenar por edad:

    @Override
    public int compareTo(Cliente o) {
        return edad - o.edad;
    }
     */
}
