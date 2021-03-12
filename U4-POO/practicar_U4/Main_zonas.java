package practicar_U4;

public class Main_zonas {
    public static void main(String[] args) {
        Zonas z1 = new Zonas(1000,"sala principal",250);
        Zonas z2 = new Zonas(200,"compra-venta",47);
        Zonas z3 = new Zonas(25,"zona vip",7);

        z1.mostrarEntradasLibres();
        z2.mostrarEntradasLibres();
        z3.mostrarEntradasLibres();

        z1.venderEntradas(450);
        z2.venderEntradas(50);
        z3.venderEntradas(100);
        z1.venderEntradas(17);
        z2.venderEntradas(24);
        z3.venderEntradas(8);

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
    }
}
