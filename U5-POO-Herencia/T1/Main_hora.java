package U5.T1;

public class Main_hora {
    public static void main(String[] args) {
        Hora h = new Hora(23,59);
        Hora12 h2 = new Hora12(12,59);


        h.inc();
        h.inc();
        h.inc();
        System.out.println(h);

        h.setMin(50);
        h.setHora(12);
        System.out.println(h);

        h2.inc();
        System.out.println(h2);

        h2.setHora(11);
        h2.setMin(59);
        h2.setFranja("pm");
        System.out.println(h2);
        h2.inc();
        System.out.println(h2);

        h2.setHora(11);
        h2.setMin(59);
        h2.setFranja("am");
        h2.inc();
        System.out.println(h2);
    }
}
