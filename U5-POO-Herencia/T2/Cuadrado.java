package U5.T2;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado(double lado, Color color) {
        super(lado, color);
    }

    public Cuadrado() {
        super();
    }

    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", color=" + color +
                "area=" + getArea() +
                '}';
    }
}
