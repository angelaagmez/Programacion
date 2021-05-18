package examen;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 Añada un nuevo libro a la biblioteca solicitando los datos al usuario.
Inserte un nuevo nodo dentro cada autor que indique el país de origen del autor
Escriba en un fichero llamado ejercicio2.xml
*/
public class ModificacionDOM {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/main/java/examen/biblioteca.xml"));

            // escribirDocumento(doc);
            addLibro(doc);
            addNodo(doc);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void addLibro(Document doc){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Introduzca el autor del libro: ");
        String autor = sc.nextLine();
        System.out.println("Introduzca la editorial del libro: ");
        String editorial = sc.nextLine();
        System.out.println("Introduzca las paginas del libro: ");
        int paginas = sc.nextInt();

        Node root = doc.getDocumentElement();

        Element libro = doc.createElement("libro");

        Element tagTitulo = doc.createElement("titulo");
        tagTitulo.setTextContent(titulo);

        Element tagAutor = doc.createElement("autor");
        tagAutor.setTextContent(autor);

        Element tagEditorial = doc.createElement("editorial");
        tagEditorial.setTextContent(editorial);

        Element tagPaginas = doc.createElement("paginas");
        tagPaginas.setTextContent(String.valueOf(paginas));

        libro.appendChild(tagTitulo);
        libro.appendChild(tagAutor);
        libro.appendChild(tagEditorial);
        libro.appendChild(tagPaginas);

        root.appendChild(libro);

        escribirDocumento(doc);
    }

    public static void addNodo(Document doc){
        Node root = doc.getDocumentElement();
        NodeList list = root.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {
            if (list.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element n = doc.createElement("pais");
                n.setTextContent("ESP");
                root.appendChild(n);
            }
        }

        escribirDocumento(doc);
    }


    public static void escribirDocumento(Document doc){
        try{
            Node root = doc.getDocumentElement();

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource();

            Result destino = (Result) new File("./src/main/java/examen/ejercicio2.xml");

            // String nuevo_fichero

            transformer.transform(origen, destino);


        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }
}
