package modificarDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDia {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/modificarDOM/dia.xml"));

            Node root = doc.getDocumentElement();

            Element nuevoDia = doc.createElement("dia");
            nuevoDia.setAttribute("nombre","Martes");

            Element tramo = doc.createElement("tramo");
            tramo.setTextContent("PROG");

            Element tramo2 = doc.createElement("tramo");
            tramo2.setTextContent("PROG");

            Element tramo3 = doc.createElement("tramo");
            tramo3.setTextContent("BD");

            Element tramo4 = doc.createElement("tramo");
            tramo4.setTextContent("BD");

            Element tramo5 = doc.createElement("tramo");
            tramo5.setTextContent("SI");

            Element tramo6 = doc.createElement("tramo");
            tramo6.setTextContent("FOL");

            nuevoDia.appendChild(tramo);
            nuevoDia.appendChild(tramo2);
            nuevoDia.appendChild(tramo3);
            nuevoDia.appendChild(tramo4);
            nuevoDia.appendChild(tramo5);
            nuevoDia.appendChild(tramo6);

            root.appendChild(nuevoDia);

            Element primerDia = (Element) doc.getElementsByTagName("dia").item(0);
            root.removeChild(primerDia);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");


            DOMSource origenDOM = new DOMSource(root);

            File nuevoFicheroDia = new File("./src/modificarDOM/nuevoDia.xml");
            StreamResult destino = new StreamResult(nuevoFicheroDia);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }


    }
}
