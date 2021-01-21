package U4_T1.libro;

public class libro718_conjunto2 {
    public static void main(String[] args) {
        Conjunto2 c1 = new Conjunto2(3);
        Conjunto2 c2 = new Conjunto2();


        c1.addElement(10);
        c1.addElement(20);
        c1.addElement(30);

        System.out.println(c1.addElement(40));

        System.out.println(c1);

        c1.removeElement(20);
        System.out.println(c1);

        c2.addElement(50);
        c2.addElement(60);
        c2.addElement(70);
        c2.addElement(80);
        c2.addElement(10);

        c1.addElement(20);
        c1.addElement(70);


        System.out.println(Conjunto2.union(c1,c2));

        System.out.println(Conjunto2.interseccion(c1,c2));

        System.out.println(Conjunto2.diferencia(c1,c2));
        System.out.println(Conjunto2.diferencia(c2,c1));


    }
}
