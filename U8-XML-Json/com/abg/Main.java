package com.abg;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try{
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/com/abg/prueba.xml"));

            NodeList nodo = doc.getElementsByTagName("dia");

            Node dia = nodo.item(0);

            NamedNodeMap atributos = dia.getAttributes();

            Attr nombre = (Attr) atributos.getNamedItem("nombre");
            System.out.println(nombre.getValue());

            if (dia.hasChildNodes()){
                NodeList nodoInterior = dia.getChildNodes();

                for (int i = 0; i < nodoInterior.getLength(); i++) {
                    Node tramo = nodoInterior.item(i);

                    if (tramo.getNodeType()==Node.ELEMENT_NODE){
                        Element e = (Element) tramo;
                        System.out.println(e.getTagName() + ": "+e.getTextContent());
                    }
                }
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
