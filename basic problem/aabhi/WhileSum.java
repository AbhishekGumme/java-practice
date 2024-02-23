package aabhi;

import java.util.Scanner;

public class WhileSum {
	public static void main(String [] args)
	{
		int n, sum=0;
		
		Scanner in =new Scanner(System.in);
		System.out.println("enter a number");
		n=in.nextInt();
		while(n>0)
		{
			int d=n%10;
			n=n/10;
			
			sum=sum+d;
			//System.out.println("digit removed"+d+"number is"+n);
			
			
			
		}
		System.out.println(sum);
	}
}