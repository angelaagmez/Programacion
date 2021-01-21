package U4_T1;

public class U4_T1_7 {
    public static void main(String[] args) {

        emisorasFM e = new emisorasFM();
        emisorasFM e2 = new emisorasFM(108);
        emisorasFM e3 = new emisorasFM(100);

        e.bajarDial();
        e2.subirDial();

        for (int i = 0; i < 10; i++) {
            e3.subirDial();
        }

        e.display();
        e2.display();
        e3.display();

    }
}
