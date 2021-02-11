package U5.T2;

public class Main_Poligonos {
    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado();
        Triangulo t1 = new Triangulo();
        Circulo ci1 = new Circulo(8);
        Cuadrado c2 = new Cuadrado(20,Color.amarillo);
        Triangulo t2 = new Triangulo(15,Color.rojo,20);
        Cuadrado c3 = new Cuadrado(9,Color.verde);

        PoligonoRegular[] poligonos = {c1, t1, c3, c2, t2};

        for (int i = 0; i < poligonos.length; i++) {
            System.out.println(poligonos[i]);
        }

        System.out.println("");
        System.out.println("Contador de poligonos: ");
        System.out.println(PoligonoRegular.getContadorPoligonos());

    }
}
