public class ej3 {
    public static void main(String[] args) {
        System.out.println(palabraAhorcado("programacion","------------",'o'));
        System.out.println(palabraAhorcado("programacion","--o-------on",'a'));
        System.out.println(palabraAhorcado("hola","----",'x'));
    }

    public static String palabraAhorcado(String adivinar,String parcial, char caracter){
        String resultado = "";

        for (int i = 0; i < adivinar.length(); i++){
            if (adivinar.charAt(i)==caracter){
               resultado += parcial.charAt(i);
            } else {
                resultado = parcial;
            }
        }
        return resultado;
    }

    // indexOf
    // charAt
    // equals - equalsIgnoreCase
}
