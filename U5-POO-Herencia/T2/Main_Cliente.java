package U5.T2;

import java.util.Arrays;
import java.util.Comparator;

public class Main_Cliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("1234567S", "Pepe",30,1002.9);
        Cliente c2 = new Cliente("5678987B", "Rosa",34,1789.75);
        Cliente c3 = new Cliente("9837474Z", "Manuel",25,100);
        Cliente c4 = new Cliente("1233438J", "Maria",19,1200.86);
        Cliente c5 = new Cliente("5678998A", "Luis",28,197.5);

        Cliente[] clientes = {c1,c2,c3,c4,c5};

        System.out.println(Arrays.toString(clientes));

        // Comparacion por defecto, con metodo en la clase creada
        Arrays.sort(clientes);
        System.out.println("");

        System.out.println(Arrays.toString(clientes));

        // Comparacion aparte en una nueva clase
        System.out.println("");
        Arrays.sort(clientes,new ComparadorEdades());
        System.out.println(Arrays.toString(clientes));


        // Comparacion directamente llamando al metodo
        Arrays.sort(clientes, new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getNombre().compareToIgnoreCase(o2.getNombre());
            }
        });

    }
}
