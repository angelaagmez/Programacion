package U4_T1;

public class U4_T1_8 {
    public static void main(String[] args) {
        Casa c = new Casa(10);

        c.infoCasa();

        c.anadirBombilla();

        System.out.println("");

        c.setinterruptorBombilla(3);
        c.setinterruptorBombilla(4);
        c.setinterruptorBombilla(7);
        c.setinterruptorBombilla(1);

        c.infoCasa();

        System.out.println("");

        c.interruptorGeneral();
        c.infoCasa();

    }

}
