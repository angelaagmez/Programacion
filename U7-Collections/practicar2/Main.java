package practicar2;

public class Main {
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora();

        Producto prod1 = new Producto("123AB","Manzana","Hola soy una manzana roja",20,0.8);
        Producto prod2 = new Producto("847GH","Platano","Hola soy un platano de canarias",30,1.2);
        Producto prod3 = new Producto("098JK","Aguacate","Hola soy un aguacate",10,2.4);
        Producto prod4 = new Producto("236OU","Pizza","Hola soy una pizza de jamon",20,2.9);
        Producto prod5 = new Producto("P1T0","Pepino","Hola soy un pepino verde",25,1.75);


        caja.addProductos("123AB",prod1);
        caja.addProductos("847GH",prod2);
        caja.addProductos("098JK",prod3);
        caja.addProductos("236OU",prod4);
        caja.addProductos("P1T0",prod5);

        caja.comprar("847GH",4);
        caja.comprar("236OU",2);
        caja.comprar("P1T0",3);

        System.out.println(caja);

        caja.cargarProductos();
        caja.guardarProductos();

        caja.cobrar();

    }
}
