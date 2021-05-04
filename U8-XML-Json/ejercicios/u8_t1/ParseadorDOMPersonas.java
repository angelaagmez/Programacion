package ejercicios.u8_t1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseadorDOMPersonas {
    public static void parse(String nombreArchivo){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/ejercicios/"+nombreArchivo));

            NodeList nl = doc.getElementsByTagName("persona");

            System.out.println("Existen "+nl.getLength()+" etiquetas en el fichero");

            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);

                Element e = (Element) nl.item(i);
                System.out.println("Etiqueta: "+e.getTagName());

                if (nodo.getNodeType() == Node.ELEMENT_NODE){
                    if (nodo.hasChildNodes()){
                        System.out.println("Contiene "+nodo.getChildNodes().getLength()+" nodos hijos");

                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {
                            if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE){
                                Element eHijo = (Element) listaInterior.item(j);
                                System.out.println("Nodo hijo: "+eHijo.getTagName());
                                System.out.println("Contenido: "+eHijo.getTextContent());
                            }
                        }
                    }
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
