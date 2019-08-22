import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import com.runtimepolymorphism.Base;
import com.runtimepolymorphism.Derived;

class Time 
{
	public static void main(String[] args) {
		// instanceof supports inheritance
		Derived derived = new Derived();
		System.out.println(derived instanceof Base);
		
		System.out.println(new Date(1557140201363L));
	}
}
                  
