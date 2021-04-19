package com.abg;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Banco {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try{
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("./src/com/abg/banco.xml"));


            Element banco = doc.getDocumentElement();
            NodeList cuentas = banco.getChildNodes();

            // NodeList cuentas = doc.getElementsByTagName("cuenta");

            for (int i = 0; i < cuentas.getLength(); i++) {
                Node n = cuentas.item(i);
                if (n.getNodeType()==Node.ELEMENT_NODE){
                    Element e = (Element) cuentas.item(i);
                    // e.getAttribute("cc");
                    Attr a = e.getAttributeNode("cc");
                    System.out.println("CC: "+a.getValue());
                    // System.out.println("CC: "+e.getAttribute("cc"));

                    NodeList nodoInterior = e.getChildNodes();
                    for (int j = 0; j < nodoInterior.getLength(); j++) {
                        Node nodo = nodoInterior.item(j);

                        if (nodo.getNodeType()==Node.ELEMENT_NODE){
                            Element element = (Element) nodo;
                            if (element.getTagName().equalsIgnoreCase("cliente")){
                                String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                                String apellidos = element.getElementsByTagName("nombre").item(0).getTextContent();
                                System.out.println("CLIENTE: "+nombre+", "+apellidos);
                            }

                            if (element.getTagName().equalsIgnoreCase("saldo")){
                                System.out.println("Saldo: "+element.getTextContent());
                            }
                        }
                    }
                }

            }


        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
