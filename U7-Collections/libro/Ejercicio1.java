package libro;

// La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
//un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
//anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
//céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
//cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
//siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
//la clase Moneda y la secuencia se debe ir almacenando en una lista.
//Ejemplo:
//2 céntimos – cara
//2 céntimos – cruz
//50 céntimos – cruz
//1 euro – cruz
//1 euro – cara
//10 céntimos – cara



public class Ejercicio1 {
    private String moneda;
    private String posicion;

    public Ejercicio1(String moneda, String posicion) {
        this.moneda = moneda;
        this.posicion = posicion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Ejercicio1{" +
                "moneda='" + moneda + '\'' +
                ", posicion='" + posicion + '\n' +
                '}';
    }
}
