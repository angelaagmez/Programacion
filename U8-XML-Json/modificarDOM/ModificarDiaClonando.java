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

public class ModificarDiaClonando {
    public static void main(String[] args) {
        String[] asignaturas = {"PROG", "PROG", "BD", "BD", "SI", "FOL"};
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/modificarDOM/dia.xml"));

            Node root = doc.getDocumentElement();

            Element martes = (Element) doc.getElementsByTagName("dia").item(0).cloneNode(true);

            martes.setAttribute("nombre","Martes");

            NodeList nl = martes.getElementsByTagName("tramo");

            for (int i = 0; i < nl.getLength(); i++) {
                nl.item(i).setTextContent(asignaturas[i]);
            }

            Element lunes = (Element) doc.getElementsByTagName("dia").item(0);

            root.replaceChild(martes,lunes);



            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");


            DOMSource origenDOM = new DOMSource(root);

            File nuevoFicheroDia = new File("./src/modificarDOM/nuevoDiaClonado.xml");
            StreamResult destino = new StreamResult(nuevoFicheroDia);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }

    }
}
