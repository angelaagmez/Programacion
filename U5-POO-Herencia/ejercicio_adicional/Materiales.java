package U5.ejercicio_adicional;

public abstract class Materiales implements Comparable<Materiales> {
    protected String nombre;
    protected int masa;
    protected int quemar;
    protected int diluir;
    protected boolean movible;

    public Materiales(String nombre, int masa, int quemar, int diluir, boolean movible) {
        this.nombre = nombre;
        this.masa = masa;
        this.quemar = quemar;
        this.diluir = diluir;
        this.movible = movible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        if (masa>0 && masa<=1000){
            this.masa = masa;
        }
    }

    public int getQuemar() {
        return quemar;
    }

    public void setQuemar(int quemar) {
        if (quemar>0 && quemar<=100){
            this.quemar = quemar;
        }
    }

    public int getDiluir() {
        return diluir;
    }

    public void setDiluir(int diluir) {
        if (diluir>0 && diluir<=100){
            this.diluir = diluir;
        }
    }

    public boolean isMovible() {
        return movible;
    }

    public void setMovible(boolean movible) {
        this.movible = movible;
    }

    @Override
    public String toString() {
        return "Materiales{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", quemar=" + quemar +
                ", diluir=" + diluir +
                ", movible=" + movible +
                '}';
    }

    @Override
    public int compareTo(Materiales o) {
        return o.masa-this.masa;
    }
}
