package U5.ejercicio_adicional;

public interface Minar {
    default Materiales hacer(Materiales m){
        m.masa += 100;
        return m;
    }

    default Materiales deshacer(Materiales m){
        m.masa -= 100;
        return m;
    }
}
