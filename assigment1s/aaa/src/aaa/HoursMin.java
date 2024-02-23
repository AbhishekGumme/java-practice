package aaa;
import java.util.Scanner;

public class HoursMin {
	public static void main(String [] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter number of hours");
	int hours,min;
	hours=in.nextInt();
	min=hours/24;
	System.out.println(" total min = "+min);
	}

}

/*out put = 
enter number of hours
121465
 total min = 5061*/
