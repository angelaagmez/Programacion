package U5.T2;

import java.util.Objects;

public class Triangulo extends PoligonoRegular {
    private double altura;

    public Triangulo(double lado, Color color, double altura) {
        super(lado, color);
        this.altura = altura;
    }

    public Triangulo() {
        super();
        this.altura = 10;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (lado*altura)/2;
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", lado=" + lado +
                ", color=" + color +
                "area=" + getArea() +
                '}';
    }
}
