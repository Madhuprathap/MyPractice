import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class SimpleDateFormatExample {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
	    long ts = System.currentTimeMillis();
	    Thread.sleep(10000);
	    long now = System.currentTimeMillis();
	    now = now - ts;
	    System.out.println(Calendar.getInstance().getTimeInMillis());
	    long timezone = TimeZone.getDefault().getOffset(System.currentTimeMillis());
	    System.out.println(timezone/3600000.0);
	    Date localTime = new Date(now);
	    String format = "HH:mm:ss";
	    SimpleDateFormat sdf = new SimpleDateFormat(format);

	    System.out.println("sss "+sdf.format(localTime));
	    


	}

}
