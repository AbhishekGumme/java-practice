package aaa;
import java.util.Scanner;

public class PositiveNot {
	public static void main(String [] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter number of hours");
	int num;
	num=in.nextInt();
	if(num>0)
	{
		System.out.println("number is positive");
	}
	else if (num==0)
	{
		System.out.println("number is zero");
	}
	else
	{
		System.out.println("number is negative");
	}
	}
	

}
