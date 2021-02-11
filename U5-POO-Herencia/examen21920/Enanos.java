package U5.examen21920;

public class Enanos extends Personajes implements Atacar{
    public Enanos(String nombre, int energia, int ataque, int defensa) {
        super(nombre, energia, ataque, defensa, false);
    }

    @Override
    public Personajes atacarPersonaje(Personajes p) {
        System.out.println(nombre + " - ATACANDO ");
        if (!this.getClass().getSimpleName().equalsIgnoreCase(p.getClass().getSimpleName())){
            if (p.encantado){
                p.energia -= (this.ataque - p.defensa)*2;
            } else {
                p.energia -= this.ataque - p.defensa;
            }
        }
        return p;
    }

    @Override
    public String toString() {
        return "Enanos{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }
}
