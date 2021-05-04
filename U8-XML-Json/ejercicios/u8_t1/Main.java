package ejercicios.u8_t1;

public class Main {
    public static void main(String[] args) {
        System.out.println("PARSEO CON DOM: ");
        ParseadorDOMPersonas.parse("personas.xml");

        System.out.println("");

        System.out.println("PARSEO CON SAX:");
        ParseadorSAXPersonas.parse("personas.xml");

        System.out.println("");
        System.out.println("");

        System.out.println("PARSEO CON STAX: ");
        ParseadorSTAXPersonas.parse("personas.xml");
    }
}
