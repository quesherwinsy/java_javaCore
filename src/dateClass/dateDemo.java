package dateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// instantiate date class object
		Date dt = new Date();
		System.out.println(dt.toString());

		// print as mm dd yy hh:mm:ss
		SimpleDateFormat simp = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println(simp.format(dt).toString());
		
		SimpleDateFormat simp2 = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		System.out.println(simp2.format(dt).toString());
	}

}
