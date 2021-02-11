package U5.examen21920;

public class Magos extends Personajes implements Magia{
    public Magos(String nombre, int energia, int ataque, int defensa) {
        super(nombre, energia, ataque, defensa, false);
    }

    @Override
    public String toString() {
        return "Magos{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }
}
