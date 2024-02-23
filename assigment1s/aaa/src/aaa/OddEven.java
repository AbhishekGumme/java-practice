package aaa;
import java.util.Scanner;

public class OddEven {
	public static void main(String [] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter number of hours");
	int num;
	num=in.nextInt();
	if(num%2==0)
	{
		System.out.println("number is even");
	}
	else
	{
		System.out.println("number is odd");
	}
	
	}

}
