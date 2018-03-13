import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class Time 
{
   private static TimeZone timezone = TimeZone.getTimeZone("UTC");
public static void main(String[] args)
{    
     
     String strn=new String();
                long millis=System.currentTimeMillis();
                Date date=new Date(millis + 28800000 );
                System.out.println(date);
                strn = getDateStr(convertToUTC(date));
                System.out.println(strn);
                
}


                protected static Date convertToUTC(Date date) {
                                // Necessary because the Date Object passed in may be NSTimestamp of which the Listener will know nothing about
                                Date utcDate = null;
                                if(date != null) {
                                               /* // Set a Calendar Object with timezone of UTC
                                                Calendar cal = new GregorianCalendar(timezone);
                                                cal.setTimeInMillis(date.getTime());
                                                // Get the Date changed to UTC
                                                utcDate = cal.getTime();
                                                if(cal.get(Calendar.YEAR) == 9999) {
                                                                utcDate = null;
                                                }*/
                                	String lv_dateFormateInUTC=""; //Will hold the final converted date      
                                	SimpleDateFormat lv_formatter = new SimpleDateFormat(); 
                                	lv_formatter.setTimeZone(TimeZone.getTimeZone("UTC"));  
                                	lv_dateFormateInUTC = lv_formatter.format(date); 
                                	System.out.println(lv_dateFormateInUTC);
                                }
                                System.out.println("UTC DATE   :  "+ utcDate);
                                return utcDate;
                }
                
protected static String getDateStr(Date date) {
                        String todayStr = "";
                                                
            if(date != null) {
                  String dayStr = null;
                  String monthStr = null;
                  Calendar cal = new GregorianCalendar(timezone);
                  cal.setTime(date);
                  int year = cal.get(Calendar.YEAR);
                  int month = cal.get(Calendar.MONTH) + 1;
                  if(month < 10) {
                        monthStr = "0" + month;
                  }
                  else {
                        monthStr = String.valueOf(month);
                  }
                  int day = cal.get(Calendar.DAY_OF_MONTH);
                  if(day < 10) {
                        dayStr = "0" + day;
                  }
                  else {
                        dayStr = String.valueOf(day);
                  }
                  StringBuilder sb = new StringBuilder();
                  sb.append(year).append(monthStr).append(dayStr);
                  return sb.toString();
            }
            return todayStr;
      }
                  }
                  
