package libro;

// Una empresa de venta por internet de productos electrónicos nos ha encargado
//implementar un carrito de la compra. Crea la clase Carrito. Al carrito se le
//pueden ir agregando elementos que se guardarán en una lista, por tanto,
//deberás crear la clase Elemento. Cada elemento del carrito deberá contener el
//nombre del producto, su precio y la cantidad (número de unidades de dicho
//producto). A continuación se muestra tanto el contenido del programa principal
//como la salida que debe mostrar el programa. Los métodos a implementar se
//pueden deducir del main

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        Ej3_carrito carrito = new Ej3_carrito();

        do{
            mostrarMenu();
            opcion = sc.nextLine();

            if (opcion.equals("1")){
                System.out.println("Introduce el nombre edl producto");
                String nombre = sc.nextLine();
                System.out.println("Introduce el precio del producto");
                double precio = sc.nextDouble();
                System.out.println("Introduce la cantidad de producto");
                int cantidad = sc.nextInt();
                sc.nextLine();
                Ej3_elementos producto = new Ej3_elementos(nombre,precio,cantidad);
                carrito.getListaElementos().add(producto);
            }else if (opcion.equals("2")){
                System.out.println(carrito);
            }
        } while (!opcion.equals("3"));

    }

    public static void mostrarMenu(){
        System.out.println("1 - Añadir producto");
        System.out.println("2 - Mostrar carrito");
        System.out.println("3 - Fin");
    }


}
