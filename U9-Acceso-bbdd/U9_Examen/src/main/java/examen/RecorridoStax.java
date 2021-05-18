package examen;

// Muestre por pantalla los datos del libro con menos páginas.
//Que muestre por pantalla el número de libros de un autor determinado que sesolicitará al usuario.

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecorridoStax {
    public static void main(String[] args) {
        libroMenosPag();
        numLibros();
    }

    public static void libroMenosPag() {
        int min = 0;
        String datos = "";
        String aux = "";
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("./src/main/java/examen/biblioteca.xml"));

            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    if (xmlEvent.asStartElement().getName().equals("paginas")) {
                        if (xmlEvent.isCharacters()) {
                            if (min > Integer.parseInt(xmlEvent.asCharacters().getData())) {
                                min = Integer.parseInt(xmlEvent.asCharacters().getData());
                                aux = datos;
                            }
                        }
                    }

                    // datos = xmlReader.getElementText();
                    datos = xmlEvent.asCharacters().getData();
                    // System.out.println(xmlEvent.asStartElement().getName().getLocalPart());
                    // String etiquetas = xmlEvent.asStartElement().getName().getLocalPart();
                    // String texto = xmlEvent.asCharacters().getData();
                    // System.out.println(etiquetas +" "+texto);
                    System.out.println(xmlEvent.asStartElement().getName().getLocalPart());
                }
            }
            System.out.println(aux);

        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void numLibros() {
        ArrayList<Libros> lista_libros = new ArrayList<>();
        Libros libro = new Libros();
        int cont = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el autor del libro ");
        String autor = sc.nextLine();

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("./src/main/java/examen/biblioteca.xml"));

            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()){
                    if (xmlEvent.asStartElement().getName().getLocalPart().equals("autor")){
                        if (xmlEvent.isCharacters()){
                            if (xmlEvent.asCharacters().getData().equalsIgnoreCase(autor)){
                                libro = new Libros("",autor,"",0);
                                lista_libros.add(libro);
                                cont++;
                            }
                        }
                    }
                }
            }

            System.out.println("Numero de libros del autor: "+lista_libros.size());
            System.out.println("Numero de libros del autor: "+cont);
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}