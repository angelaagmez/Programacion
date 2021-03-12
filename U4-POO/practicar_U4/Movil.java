package practicar_U4;

public class Movil {
    Terminal t;
    String tarifa;
    double coste;

    public Movil(Terminal t, String tarifa) {
        this.t = t;
        this.tarifa = tarifa;
    }

    public Terminal getT() {
        return t;
    }

    public void setT(Terminal t) {
        this.t = t;
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

    public void llama(Movil m, int segundos){
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
                "t=" + t +
                ", tarifa='" + tarifa + '\'' +
                ", coste=" + coste +
                '}';
    }
}
