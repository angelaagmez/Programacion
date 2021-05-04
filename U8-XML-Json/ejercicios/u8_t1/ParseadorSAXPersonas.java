package ejercicios.u8_t1;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class ParseadorSAXPersonas {
    public static void parse(String nombreFichero){
        try{
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            DefaultHandler personaSax = new SAXPersonas();

            saxParser.parse(new File("./src/ejercicios/"+nombreFichero),personaSax);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }


    }
}
