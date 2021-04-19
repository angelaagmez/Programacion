package modificarDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarAlumnos {
    public static void main(String[] args) {
        String[] nombres = {"Angela","Gonzalo","Alicia","Pedro","Oscar",
                        "Alumno6","Alumno7","Alumno8","Alumno9","Alumno10"};
        String[] apellidos = {"Bonilla","Waack","Acosta","Larrubia","Sanchez",
                        "Alumno6","Alumno7","Alumno8","Alumno9","Alumno10"};

        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/modificarDOM/alumnos.xml"));

            Node root = doc.getDocumentElement();

            for (int i = 0; i < nombres.length; i++) {
                Element alumno = doc.createElement("alumno");

                Element nombre = doc.createElement("nombre");
                nombre.setTextContent(nombres[i]);

                Element apellido = doc.createElement("apellidos");
                apellido.setTextContent(apellidos[i]);

                alumno.appendChild(nombre);
                alumno.appendChild(apellido);

                root.appendChild(alumno);
            }


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");


            DOMSource origenDOM = new DOMSource(root);

            File nuevoFicheroDia = new File("./src/modificarDOM/nuevosAlumnos.xml");
            StreamResult destino = new StreamResult(nuevoFicheroDia);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
