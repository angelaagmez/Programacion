package ejercicios.u8_t1;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ParseadorSTAXPersonas {
    public static void parse(String nombreFichero){
        ArrayList<Persona> personas = new ArrayList<>();
        Persona personaActual = null;
        String etiquetaActual = "";

        try{
            XMLInputFactory xif = XMLInputFactory.newInstance();
            XMLEventReader lector = xif.createXMLEventReader(new FileInputStream("./src/ejercicios/"+nombreFichero));

            while(lector.hasNext()){
                XMLEvent evento = lector.nextEvent();

                if (evento.isStartElement()){
                    StartElement etiquetaStart = evento.asStartElement();
                    System.out.print("<"+etiquetaStart.getName().getLocalPart());

                    String nombreEtiqueta = etiquetaStart.getName().getLocalPart();

                    switch (nombreEtiqueta){
                        case "persona":
                            personaActual = new Persona();
                            etiquetaActual = "persona";
                            break;

                        case "nombre":
                            etiquetaActual = "nombre";
                            break;

                        case "edad":
                            etiquetaActual = "edad";
                            break;
                    }
                    System.out.print(">");
                } else if (evento.isEndElement()){
                    EndElement etiquetaEnd = evento.asEndElement();
                    System.out.println("<\\"+etiquetaEnd.getName().getLocalPart()+">");
                    if (etiquetaEnd.getName().getLocalPart().equalsIgnoreCase("persona")){
                        personas.add(personaActual);
                    }
                    etiquetaActual = "";
                } else if (evento.isStartDocument()){
                    System.out.println("Comienzo del parseado del documento");
                } else if (evento.isEndDocument()){
                    System.out.println("Fin del parseado del documento");
                } else if (evento.isCharacters()){
                    Characters texto = evento.asCharacters();
                    if (!texto.getData().contains("\n")){
                        System.out.print(texto.getData());
                    }
                    if (!etiquetaActual.equalsIgnoreCase("")){
                        switch (etiquetaActual){
                            case "nombre":
                                personaActual.setNombre(texto.getData());
                                break;
                            case "edad":
                                personaActual.setEdad(Integer.valueOf(texto.getData()));
                                break;
                        }
                    }
                }
            }


        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(personas);
    }

}
