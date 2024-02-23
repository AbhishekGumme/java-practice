package aaa;
import java.util.Scanner;

public class HoursMonth {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of hours");
		int hours,month;
		hours=in.nextInt();
		month=hours/30;
		System.out.println("number of month is = "+month);
	}
	

}
