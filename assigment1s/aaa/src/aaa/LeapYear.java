package aaa;

import java.util.Scanner;

public class LeapYear {
	public static void main(String [] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter number of year");
	int year;
	year=in.nextInt();
	if(year%4==0)
	{
		System.out.println("year is leap year = "+year);
	}
	else
	{
		System.out.println("not aleap year = "+year);
	}
	}

}

/*out put=
enter number of year
2016
year is leap year = 2016
*/
