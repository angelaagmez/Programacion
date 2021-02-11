package U5.T2;

public class Circulo implements Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.pow(radio,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                "area=" + getArea() +
                '}';
    }


}
