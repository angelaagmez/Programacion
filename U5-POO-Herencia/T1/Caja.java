package U5.T1;

public class Caja {
    final double ancho;
    final double alto;
    final double fondo;
    Etiqueta etiqueta;
    Unidades unidad;

    public Caja(double ancho, double alto, double fondo, Unidades unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public Caja(double ancho, double alto, double fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = Unidades.CM;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getFondo() {
        return fondo;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    public double getVolumen(){
        if (this.unidad == Unidades.M){
            return ancho*alto*fondo;
        } else {
            return (ancho*alto*fondo)/1000000;
        }
        // return (this.unidad == Unidades.M ? ancho*alto*fondo : (ancho*alto*fondo)/1000000);
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", etiqueta=" + etiqueta +
                ", unidad=" + unidad +
                ", volumen=" + getVolumen() +
                '}';
    }
}
