package ejercicios.u8_t1_entregable_modificacion;

// Cargar el contenido del XML en la estructura DOM
// Añadir antes de cada nodo hijo de tipo etiqueta el comentario <!--COMENTARIO AÑADIDO DESDE DOM-->
// Añadir una nueva etiqueta hija como ultimo hijo
// Crear un nuevo nodo etiqueta y reemplazar la primera etiqueta hija por ese nodo
// Volcar a un fichero XML llamado dom_modificado.xml

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/ejercicios/u8_t1_entregable_recorrido/paises.xml"));

            Node root = doc.getDocumentElement();

            // Añadir comentario
            NodeList nl = root.getChildNodes();
            Comment comentario = doc.createComment("COMENTARIO AÑADIDO DESDE DOM");

            for (int i = 0; i < nl.getLength(); i++) {
                Element etiquetas = (Element) doc.getElementsByTagName("pais").item(i);
                root.insertBefore(comentario,etiquetas);
            }


            // Añadir nodo al final
            Element pais = doc.createElement("pais");
            pais.setAttribute("id","SWT");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Suiza");
            Element capital = doc.createElement("capital");
            capital.setTextContent("Berna");
            Element poblacion = doc.createElement("poblacion");
            poblacion.setTextContent("8.500.000");

            pais.appendChild(nombre);
            pais.appendChild(capital);
            pais.appendChild(poblacion);

            root.appendChild(pais);

            // Crear nuevo nodo y reemplazar el primero por ese
            Element nuevoPais = doc.createElement("pais");
            nuevoPais.setAttribute("id","RM");

            Element nuevoNombre = doc.createElement("nombre");
            nuevoNombre.setTextContent("Rumania");
            Element nuevaCapital = doc.createElement("capital");
            nuevaCapital.setTextContent("Bucarest");
            Element nuevaPoblacion = doc.createElement("poblacion");
            nuevaPoblacion.setTextContent("19.400.000");

            nuevoPais.appendChild(nuevoNombre);
            nuevoPais.appendChild(nuevaCapital);
            nuevoPais.appendChild(nuevaPoblacion);

            root.appendChild(nuevoPais);

            Element primeraEtiqueta = (Element) doc.getElementsByTagName("pais").item(0);

            root.replaceChild(nuevoPais,primeraEtiqueta);

            // Volcar a fichero XML (dom_modificado.xml)
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer trans = tf.newTransformer();

            trans.setOutputProperty( OutputKeys.INDENT, "yes" );
            trans.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            trans.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            trans.setOutputProperty( OutputKeys.METHOD, "xml" );
            trans.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource(root);

            File nuevoPaises = new File("./src/ejercicios/u8_t1_entregable_modificacion/dom_modificado.xml");

            StreamResult destino = new StreamResult(nuevoPaises);

            trans.transform(origen,destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }



}
