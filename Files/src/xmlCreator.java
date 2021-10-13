import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class xmlCreator {
    public static final String xmlFilePath = "./xmlfile.xml";
    static Document document;

    public xmlCreator(){
        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = null;
            documentBuilder = documentFactory.newDocumentBuilder();
            document = documentBuilder.newDocument();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
    public static void main (String[] args) {
        new xmlCreator();
        Element movies = addNode("movies", document);
        Element movie = addNode("movie", (Document) movies);
        addAttribute((Document) movie, "year", "1999");
        Element title = addNodeVal("title", "Matrix",(Document)movie);
        Element duration = addNodeVal("duration", "136 min", (Document)movie);
        Element cast = addNode("cast", (Document)movie);
        Element actors = addNode("actors", (Document) cast);
        Element keanu = addNodeVal("name", "Keanu Reeves", (Document)actors);
        Element Lauren = addNodeVal("name", "Lauren", (Document)actors);

    }

    public static Element addNode (String nodeName, Document parentNode){
        Element node = document.createElement(nodeName);
        parentNode.appendChild(node);
        return node;
    }

    public static void addAttribute(Document node, String attribute, String attVal){
        Attr attr = node.createAttribute(attribute);
        attr.setValue(attVal);
        document.setAttributeNode(attr);
    }

    public static Element addNodeVal(String nodeName, String nodeValue, Document parentNode){
        Element newNode = addNode(nodeName, parentNode);
        newNode.setNodeValue(nodeValue);
        return newNode;
    }

}
