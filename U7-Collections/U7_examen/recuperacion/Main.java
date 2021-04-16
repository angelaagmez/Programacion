package com.abg;

public class Main {

    public static void main(String[] args) {
        Empresa e = new Empresa();
        EmpresaOnline empOn = new EmpresaOnline("Asdfkjd");


        PedidosOnline ped = new PedidosOnline("132-ABC","17/02/2021","03/03/2021","123.342.213","Paypal");
        PedidosOnline ped1 = new PedidosOnline("243-DET","23/01/2021","06/02/2021","168.2.193","Tarjeta de credito");
        PedidosOnline ped2 = new PedidosOnline("384-ERT","17/02/2021","03/03/2021","123.342.213","Stripe");

        PedidosEnTienda ped3 = new PedidosEnTienda("492-PRX","10/12/2020","13/01/2021","calle Pepito Perez,4");
        PedidosEnTienda ped4 = new PedidosEnTienda("574-HTR","09/10/2020","13/10/2020","calle Rosa Marquez,10");
        PedidosOnline ped5 = new PedidosOnline("693-UYT","06/01/2020","12/01/2020","","Paypal");
        PedidosEnTienda ped6 = new PedidosEnTienda("729-LAR","08/07/2020","20/07/2020","calle Pepito Perez,4");


        Productos prod = new Productos("PS4",200,300.0,1);
        Productos prod1 = new Productos("TV",400,450.5,2);
        Productos prod2 = new Productos("HP",600,1020.7,3);
        Productos prod3 = new Productos("SWITCH",300,320.9,4);
        Productos prod4 = new Productos("WII",100,99.9,5);
        Productos prod5 = new Productos("XBOX ONE",800,120.0,6);
        Productos prod6 = new Productos("PS3",700,140.0,7);


        ped.addProducto(prod,4);
        ped.addProducto(prod4,2);
        ped.addProducto(prod5,6);

        ped1.addProducto(prod4,5);
        ped1.addProducto(prod4,1);

        ped2.addProducto(prod1,7);
        ped2.addProducto(prod2,3);
        ped2.addProducto(prod3,8);
        ped2.addProducto(prod6,5);
        ped2.addProducto(prod4,1);
        ped2.addProducto(prod5,1);

        ped3.addProducto(prod,7);
        ped3.addProducto(prod2,1);

        ped4.addProducto(prod6,5);
        ped4.addProducto(prod1,2);
        ped4.addProducto(prod2,1);
        ped4.addProducto(prod5,1);

        ped5.addProducto(prod6,2);

        ped6.addProducto(prod,1);
        ped6.addProducto(prod1,2);

        System.out.println("Añadir los productos: ");
        System.out.println(ped);
        System.out.println(ped1);
        System.out.println(ped2);
        System.out.println(ped3);
        System.out.println(ped4);
        System.out.println(ped5);
        System.out.println(ped6);

        System.out.println("Borrar un producto: ");
        ped2.borrarProducto(prod5);
        System.out.println(ped2);

        System.out.println("Contador de productos: ");
        System.out.println(ped2.numeroProductos());

        System.out.println("Calculo de total de un pedido: ");
        System.out.println(ped6.calcularTotal());

        System.out.println();

        e.addPedidosOnline(ped);
        e.addPedidosOnline(ped1);
        e.addPedidosOnline(ped2);
        e.addPedidosOnline(ped5);

        e.addPedidosTienda(ped3);
        e.addPedidosTienda(ped4);
        e.addPedidosTienda(ped6);

        System.out.println("Todos los pedidos: ");
        System.out.println(e);

        System.out.println("Contador de pedidos:");
        System.out.println(e.contadorPedidos());

        System.out.println("Interfaz log: ");
        ped1.printLog();

        System.out.println("Metodos de empresa online: ");
        empOn.addPedidoOnline(ped);
        empOn.addPedidoOnline(ped1);
        empOn.addPedidoOnline(ped2);
        empOn.addPedidoOnline(ped5);
        System.out.println(empOn);
        empOn.cargarPedidos();
        empOn.escribirPedidos();
        empOn.mostrarPedidosOrdenados();
        empOn.vendidoProducto(5);
    }
}
