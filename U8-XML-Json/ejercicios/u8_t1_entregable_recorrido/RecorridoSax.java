package ejercicios.u8_t1_entregable_recorrido;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class RecorridoSax extends DefaultHandler {
    public static void main(String[] args) {
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            DefaultHandler handler = new RecorridoSax();

            parser.parse(new File("./src/ejercicios/u8_t1_entregable_recorrido/paises.xml"),handler);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public RecorridoSax() {
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Empieza el parseado del documento");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("\nFinaliza el parseado del documento");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        System.out.print("<"+qName);
        if (attributes!=null){
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print(""+attributes.getQName(i)+"=\""+attributes.getValue(i)+"\"");
            }
        }
        System.out.print(">");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        System.out.print("</"+qName+">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        String content = new String(ch,start,length);
        System.out.print(content);
    }
}
