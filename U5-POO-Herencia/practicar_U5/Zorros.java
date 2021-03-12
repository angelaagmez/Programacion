package practicar_U5;

public class Zorros extends Salvajes implements Atacar{
    public Zorros(String nombre, int peso) {
        super(nombre, peso, 0);
    }

    @Override
    public void sonido() {
        System.out.println("DJSKN ("+nombre+")");
        System.out.println("ALERTA ANIMAL SALVAJE");
    }

    @Override
    public String toString() {
        return "Zorros{" +
                "cantMatado=" + cantMatado +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }


    @Override
    public boolean ataque(Animales a) {
        if (a instanceof Ganado){
            return true;
        }
        return false;
    }
}
