import java.io.File;

public class StaticStringCompare {
	
	public final static String DOCUMENTS      = "DOCUMENTS_ANSWERSOURCE";
    public final static String GLOSSARY       = "GLOSSARY_ANSWERSOURCE";
    public final static String CUSTOM_TEXT    = "CUSTOM_TEXT_ANSWERSOURCE";
    public final static String PLUGIN         = "PLUGIN_ANSWERSOURCE";
	
    public static String getDocuments() {
		return DOCUMENTS;
	}
    
    public static String getGlossary() {
		return GLOSSARY;
	}
    private static final String name = "";
	public static void main(String[] args) {
		System.out.println(getDocuments() == DOCUMENTS);
		System.out.println(getGlossary() == DOCUMENTS);
		
		System.out.println(getDocuments().equals(DOCUMENTS));
		System.out.println(getGlossary().equals(DOCUMENTS));
		
		System.out.println(Boolean.TRUE == Boolean.TRUE);
		System.out.println(Boolean.TRUE.equals(Boolean.TRUE));
		
		/*String n = "";
		System.out.println(n == name);
		System.out.println(n.equals(name));
		System.out.println("---------");
		File f1 = null;
		File f2 = new File("Startswith.java");
		System.out.println(f2.equals(f1));
		
		System.out.println();*/
	}

}
