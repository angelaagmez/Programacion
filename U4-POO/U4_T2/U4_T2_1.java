package U4_T2;

import java.util.Arrays;

public class U4_T2_1 {
    public static void main(String[] args) {
        Lista l = new Lista();

        l.numElementos();

        System.out.print("Rellenamos tabla: ");
        l.rellenarTabla(0,2);
        l.rellenarTabla(1,6);
        l.rellenarTabla(2,3);
        l.rellenarTabla(3,8);
        l.rellenarTabla(12,100);
        l.rellenarTabla(4,7);
        l.rellenarTabla(5,9);
        l.rellenarTabla(6,21);
        l.rellenarTabla(7,15);
        l.rellenarTabla(8,72);
        l.rellenarTabla(9,84);

        System.out.println("Mi tabla: "+l);

        System.out.print("Insertar numero al final: ");
        System.out.println(Arrays.toString(l.insertarNumFinal(5)));

        System.out.print("Insertar numero al principio: ");
        System.out.println(Arrays.toString(l.insertarNumPrinc(3)));

        System.out.print("Insertar numero en cualquier lugar: ");
        System.out.println(Arrays.toString(l.insertarNumCualquierLugar(1, 4)));

        System.out.print("Borrar elemento: ");
        l.borrarElemento(6);
        System.out.println(l);

        System.out.print("Obtener elemento: ");
        System.out.println(l.obtenerElemento(7));

        System.out.print("Buscar posicion de un numero: ");
        System.out.println(l.buscarNum(8));

        System.out.print("Cambiar array a cadena: ");
        System.out.println(l.cambiarCadena());
    }
}
