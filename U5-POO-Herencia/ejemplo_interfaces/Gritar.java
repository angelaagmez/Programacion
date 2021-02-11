package U5.ejemplo_interfaces;

public interface Gritar {
    String coletilla = "!!!";   // los atributos son estaticos(se llama con el nombre de la clase) y finales(no se pueden cambiar)

    void lanzarJuramento();
    void gritoSordo();

    // default void lanzarJuramento();{
    //     codigo           - si quiero poner una frase por defecto
    //  }
    //
    // Para cambiar en cada clase , hacemos un override

}
