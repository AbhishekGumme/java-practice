package innerclassexample;

import java.util.Calendar;
import java.util.Date;

public class wapperclasss2 {

	public static void main(String[] args) {
		Calendar c1=Calendar.getInstance();
		System.out.println(c1.getTime());
		System.out.println(c1.getWeekYear());
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH)+1);
		System.out.println(c1.get(Calendar.DATE));
		System.out.println("printing date ago 15");
		c1.add(Calendar.DATE, -15);
		System.out.println(c1.getTime());
		System.out.println("printing date after 15");
		c1.add(Calendar.DATE, 30);
		System.out.println(c1.getTime());
		c1.add(Calendar.YEAR, 2);
		System.out.println(c1.getTime());
		c1.add(Calendar.MONTH, 4);
		System.out.println(c1.getTime());	
	}
}
