package dateClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) {
		// Instantiate calendar
		Calendar cal = Calendar.getInstance();

		SimpleDateFormat simp2 = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		System.out.println(simp2.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.MINUTE));
	}

}
