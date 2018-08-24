import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import org.apache.commons.lang3.StringUtils;


public class StringCont {
public static void main(String[] args) {
	String str = "Invalid documentID supplied 'SU11' 'SU12'";
	if (str.indexOf("'")>=0 && str.lastIndexOf("'")<str.length()) {
		//System.out.println(str.substring(str.indexOf("'")+1, str.lastIndexOf("'")));
	}
	
	String regex= "'[^']*'";
	
	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(str);
	ArrayList<String> list = new ArrayList<String>();
	while(m.find()) {
		list.add(m.group().replace("'", "").trim());
	}
	
	Locale locale = new Locale("en","US");
	ResourceBundle bundle = ResourceBundle.getBundle("errormessages",locale);
	String result = bundle.getString("content.service.invalid.documentid");
	//String result = "Invalid documentID supplied '{0}' and '{1}'";
	Object[] arg = list.toArray();
	String value = Arrays.toString(arg).replace("[", "").replace("]", "");

	Object[] afterSplit = value.split(", ");
	arg = afterSplit;
	System.out.println("adkfjlaksdjfkljslkj  ");
	if (arg != null && arg.length > 0) {
		for (int i = 0; i < arg.length ; i++) {
			String replaceKey = "{" + i + "}";
			//result = result.replaceAll(replaceKey, args[i].toString());
			result = StringUtils.replace(result, replaceKey, arg[i].toString());
		}
	}
	System.out.println(result);
	
	Object[] test1 = null;
	
	
	String replacement = Arrays.toString(test1);
	Object[] replacementValues = null;
	if (!replacement.equals("null") && !replacement.equals("")) {
		if (replacement.startsWith("[") && replacement.endsWith("]")) {
			replacement = replacement.substring(1, replacement.length()-1);
		}
		replacementValues = replacement.split(", ");
	}
	System.out.println(replacementValues);
	System.out.println("".length());
	
	Color color = Color.GREEN;
	System.out.println(color.getValueBase());
}
}
