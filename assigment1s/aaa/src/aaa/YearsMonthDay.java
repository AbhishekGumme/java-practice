package aaa;
import java.util.Scanner;

public class YearsMonthDay {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter a year");
		int year,month,days;
		year=in.nextInt();
		month=year*12;
		days=year*12*30;
		System.out.println("mumber of month = "+month);
		System.out.println("mumber of days = "+days);
		
	}

}
