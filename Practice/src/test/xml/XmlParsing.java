package test.xml;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.*;
import org.xml.sax.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class XmlParsing {
    public static final String xmlFilePath = "C:\\Users\\Dell\\Downloads\\Java-Algo\\Practice\\src\\test\\target.xml";

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        List<EmailList> list1 = XmlParsing.xmlAttributeFile();
        List<EmailList> list2 = XmlParsing.xmlElementFile();
        /**
         * Next step is to merge both the list values into mergeList
         * Finally, remove duplicates on the basis of emailID
         * */

        List<EmailList> mergeList = Stream.of(list1, list2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        List<EmailList> finalList = mergeList.stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<EmailList>(Comparator.comparing(EmailList::getEmail))),
                        ArrayList::new));

        System.out.println("Final : " + finalList);
        XmlParsing.transformToXML(finalList);


    }

    /**
     * Transforming the DOM Object to an XML by iterating the values of the final List(Collection)
     */

    public static void transformToXML(List<EmailList> emailList) throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        Element root = document.createElement("list");
        document.appendChild(root);


        for (EmailList emailList1 : emailList) {
            Element entry = document.createElement("entry");
            root.appendChild(entry);

            Element firstName = document.createElement("firstname");
            firstName.appendChild(document.createTextNode(emailList1.getForename()));
            entry.appendChild(firstName);

            Element lastName = document.createElement("lastname");
            lastName.appendChild(document.createTextNode(emailList1.getSurname()));
            entry.appendChild(lastName);

            Element email = document.createElement("email");
            email.appendChild(document.createTextNode(emailList1.getEmail()));
            entry.appendChild(email);
        }
        //transform the DOM Object to an XML File
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File(xmlFilePath));
        transformer.transform(domSource, streamResult);

        // Output to console for testing
        StreamResult consoleResult = new StreamResult(System.out);
        transformer.transform(domSource, consoleResult);
    }

    /**
     * This method is build to parse attribute based xml document into a List
     **/
    public static List<EmailList> xmlAttributeFile() throws ParserConfigurationException, IOException, SAXException {
        File file = new File("C:\\Users\\Dell\\Downloads\\Java-Algo\\Practice\\src\\test\\mailing-list.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);
        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName("subscriber");
        List<EmailList> emailLists = new ArrayList<>();
        Attr attr;
        Attr attr1;
        Attr attr2;
        String GivenName = "";
        String FamilyName = "";
        String Email = "";
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.hasAttributes()) {
                attr = (Attr) node.getAttributes().getNamedItem("familyname");
                if (attr != null) {
                    FamilyName = attr.getValue();
                }
                attr1 = (Attr) node.getAttributes().getNamedItem("givenname");
                if (attr1 != null) {
                    GivenName = attr1.getValue();
                }
                attr2 = (Attr) node.getAttributes().getNamedItem("email");
                if (attr2 != null) {
                    Email = attr2.getValue();
                }
                //       System.out.println(GivenName + " " + FamilyName + " " + Email);
                EmailList emailList = new EmailList(GivenName, FamilyName, Email);
                emailLists.add(emailList);
                GivenName = "";
                FamilyName = "";
                Email = "";

            }

        }
        return emailLists;
    }

    /**
     * This method is build to parse element based xml document into a List
     */
    public static List<EmailList> xmlElementFile() throws ParserConfigurationException, IOException, SAXException {
        File file = new File("C:\\Users\\Dell\\Downloads\\Java-Algo\\Practice\\src\\test\\user-list.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("user");
        List<EmailList> emailLists = new ArrayList<>();
        String forename = null;
        String surname = null;
        String email = null;
        EmailList emailList;
        //System.out.println("size : " + nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nNode = nodeList.item(i);
            Element eElement = (Element) nNode;
            NodeList test = eElement.getChildNodes();


            int size = eElement.getChildNodes().getLength();

            if (size > 3) {
                forename = eElement.getElementsByTagName("forename").item(0).getTextContent();
                //        System.out.println("First Name : " + forename);
                surname = eElement.getElementsByTagName("surname").item(0).getTextContent();
                //          System.out.println("Last Name : " + surname);
            }

            if (eElement.getElementsByTagName("email") != null) {
                email = eElement.getElementsByTagName("email").item(0).getTextContent();
                //            System.out.println("Email : " + email);
            }

            emailList = new EmailList(forename, surname, email);
            emailLists.add(emailList);
            forename = "";
            surname = "";
            email = "";
        }
        return emailLists;
    }
}



