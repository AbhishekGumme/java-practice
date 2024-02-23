package aaa;

import java.util.Scanner;

public class NumberRange {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int num;
		num=in.nextInt();
		if(num>1&&num<250)
		{
			for(int i=0;i<250;i++)
			{
				System.out.print(i+"'");
			}
		}
		if(num>251&&num<500)
		{
			for(int i=251;i<500;i++)
			{
				System.out.print(i+"'");
			}
		}
		if(num>501&&num<750)
		{
			for(int i=501         MN    M;i<750;i++)
			{
				System.out.print(i+"'");
			}
		}
		else
		{
			System.out.println("number out of range ");
		}
	}
	

}
