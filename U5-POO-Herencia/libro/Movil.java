package U5.libro;

public class Movil extends Terminal {
    String tarifa;
    double coste;

    public Movil(String num, String tarifa, double coste) {
        super(num);
        this.tarifa = tarifa;
        this.coste = coste;
    }

    public Movil(String num, int segs, String tarifa, double coste) {
        super(num, segs);
        this.tarifa = tarifa;
        this.coste = coste;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    @Override
    public void llama(Terminal t, int segundos) {
        super.setSegs(super.getSegs()+segundos);
        if (tarifa.equalsIgnoreCase("rata")){
            this.coste += (segundos*0.6)/60;
        } else if (tarifa.equalsIgnoreCase("mono")){
            this.coste += (segundos*0.12)/60;
        } else {
            this.coste += (segundos*0.30)/60;
        }
    }

    @Override
    public String toString() {
        return "Movil{" +
                "tarifa='" + tarifa + '\'' +
                ", coste=" + coste +
                ", num='" + num + '\'' +
                ", segs=" + segs +
                '}';
    }
}
