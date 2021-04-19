package recorrerSAX.ejercicios;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AlumnoSax extends DefaultHandler {
    public AlumnoSax() {
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Comienzo del parseado del documento");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Fin del parseado del documento");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        System.out.println("<"+qName);

        if (attributes != null){
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.println(" "+attributes.getQName(i)+"=\""+attributes.getValue(i)+"\"");
            }
        }

        System.out.println(">");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        System.out.println("</"+qName+">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        String content = new String(ch,start,length);
        System.out.println(content);
    }
}
