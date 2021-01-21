package U4_T1;

public class libro_72 {
    public static void main(String[] args) {
        Calendario c = new Calendario(1,4,1993);
        Calendario otraFecha = new Calendario(1,4,1993);

        System.out.println(c.iguales(otraFecha));

        c.incrementarDia(20);
        c.incrementarMes(10);
        c.incrementarAnyo(3);

        c.mostrar();

        System.out.println(c.iguales(otraFecha));
    }
}
