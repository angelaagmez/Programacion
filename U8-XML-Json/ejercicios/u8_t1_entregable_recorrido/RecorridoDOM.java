package ejercicios.u8_t1_entregable_recorrido;

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

public class RecorridoDOM {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/ejercicios/u8_t1_entregable_recorrido/paises.xml"));

            numNodosHijos(doc);
            mostrarXMLDom(doc);

            Node root = doc.getDocumentElement();

            mostrarContenidoEtiqueta((Element) root);


        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void numNodosHijos(Document documento){
        // Numero de nodos hijos y tipo de cada uno
        Node root = documento.getDocumentElement();
        NodeList nl = root.getChildNodes();
        System.out.println("Numero de nodos hijos: "+nl.getLength());

        for (int i = 0; i < nl.getLength(); i++) {
            Node nodo = nl.item(i);

            String tipo="";
            if (nodo.getNodeType() == Node.ELEMENT_NODE){
                tipo = "etiqueta";
            } else if(nodo.getNodeType() == Node.TEXT_NODE){
                tipo = "texto";
            } else if(nodo.getNodeType() == Node.COMMENT_NODE){
                tipo = "comentario";
            }
            System.out.println("Tipo de nodo: "+tipo);
        }

    }

    public static void mostrarXMLDom(Document documento){
        // Contenido del fichero
        NodeList nl = documento.getElementsByTagName("pais");

        for (int i = 0; i < nl.getLength(); i++) {
            Node nodo = nl.item(i);

            System.out.println("Nodo hijo: "+nodo.getNodeName());

            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("Contenido: ");
                System.out.println(nodo.getTextContent());
            }
        }
    }

    public static void mostrarContenidoEtiqueta(Element e){
        // Recorre la etiqueta que queramos mostrando el contenido, si no hay debe mostrar un mensaje de aviso
        NodeList nl = e.getChildNodes();
        if (nl.getLength()>0){
            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Element.ELEMENT_NODE){
                    System.out.println(nl.item(i).getNodeName());
                    System.out.println(nl.item(i).getTextContent());
                }
            }
        } else {
            System.out.println("No tiene nodos hijos");
        }

    }
}
