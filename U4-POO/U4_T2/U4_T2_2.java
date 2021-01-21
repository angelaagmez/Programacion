package U4_T2;

public class U4_T2_2 {
    public static void main(String[] args) {
       PilaTabla pt = new PilaTabla();

        pt.apilar(5);
        pt.apilar(8);
        pt.apilar(1);
        pt.apilar(7);

        System.out.println(pt);

        pt.desapilar();
        pt.desapilar();

        System.out.println(pt);

        pt.desapilar();
        pt.desapilar();

        System.out.println(pt);

    }
}
