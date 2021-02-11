package U5.T2;

public abstract class PoligonoRegular implements Figura {
    protected double lado;
    public Color color;
    private static int contadorPoligonos = 0;

    public PoligonoRegular(double lado, Color color) {
        this.lado = lado;
        this.color = color;
        contadorPoligonos++;
    }

    public PoligonoRegular() {
        this.lado = 10;
        this.color = Color.azul;
        contadorPoligonos++;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static int getContadorPoligonos() {
        return contadorPoligonos;
    }

    public static void setContadorPoligonos(int contadorPoligonos) {
        PoligonoRegular.contadorPoligonos = contadorPoligonos;
    }

}
