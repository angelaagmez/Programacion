package U4_T1;

public class libro_73 {
    public static void main(String[] args) {
        Punto p1 = new Punto(1,1);
        Punto p2 = new Punto(3,3);

        p1.desplaza(5);
        p2.desplaza(5,10);


        System.out.println(p1);
        System.out.println(p2);

        System.out.println("");
        System.out.println(p1.distanciaEuclidea(p2));
    }
}
