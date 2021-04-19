package recorrerSAX.ejercicios;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class recorrerAlumnos {
    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        try{
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            DefaultHandler alumnoSax = new AlumnoSax();

            saxParser.parse(new File("./src/modificarDOM/nuevosAlumnos.xml"),alumnoSax);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
