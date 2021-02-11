package U5.examen21920;

public interface Magia {
    default Personajes encantar(Personajes p){
       p.encantado = true;
       return p;
    }

    default Personajes desencantar(Personajes p){
        p.encantado = false;
        return p;
    }
}
