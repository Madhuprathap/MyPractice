import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;


public class DocTest {
	
	@Test
    public void testElementNameExists() throws Exception {
        InputStream stream = getClass().getResourceAsStream("DataListItemResources_en.xml");
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(stream);
        NodeList resourceList = doc.getElementsByTagName("RESOURCE");

        for (int i = 0; i < resourceList.getLength(); i++) {
            Element resource = (Element)resourceList.item(i);
            //System.out.println("resource=" + resource);
            NodeList list = resource.getChildNodes();

            for (int j = 0; j < list.getLength(); j++) {
                Node node = list.item(j);
                System.out.println("i=" + i + ", j=" + j + ", name=" + node.getNodeName() + ", type=" + node.getNodeType() + ", value=" + node.getChildNodes().item(0).getNodeValue() + ", TEXT=" + node.getTextContent());
            }
        }
    }


}
