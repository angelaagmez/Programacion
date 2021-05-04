package ejercicios.u8_t1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXPersonas extends DefaultHandler {
    public SAXPersonas() {
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        System.out.print("<"+qName);

        if (attributes != null){
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print(" "+attributes.getQName(i)+"=\""+attributes.getValue(i)+"\"");
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

        String contenido = new String(ch,start,length);
        System.out.print(contenido);
    }
}
