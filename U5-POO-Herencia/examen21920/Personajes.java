package U5.examen21920;

public abstract class Personajes implements Comparable<Personajes> {
    protected String nombre;
    protected int energia;
    protected int ataque;
    protected int defensa;
    protected boolean encantado;

    public Personajes(String nombre, int energia, int ataque, int defensa, boolean encantado) {
        this.nombre = nombre;
        this.energia = energia;
        this.ataque = ataque;
        this.defensa = defensa;
        this.encantado = encantado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia>0 && energia<=1000){
            this.energia = energia;
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if (ataque>0 && ataque<=100){
            this.ataque = ataque;
        }
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        if (defensa>0 && defensa<=100) {
            this.defensa = defensa;
        }
    }

    public boolean getEncantado() {
        return encantado;
    }

    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }

    @Override
    public int compareTo(Personajes o) {
        return o.energia-this.energia;
    }
}
