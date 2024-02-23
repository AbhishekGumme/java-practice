package aabhi;

import java.util.Scanner;

public class Amstrong {
	public static void main(String [] args)
	{
		int n, sum=0;
		
		Scanner in =new Scanner(System.in);
		System.out.println("enter a number");
		n=in.nextInt();
		int x=n;
		
		while(n>0)
		{
			int d=n%10;
			n=n/10;
			
			sum=sum+d*d*d;
			//System.out.println("digit removed"+d+"number is"+n);
			}
		if(sum==x)
			System.out.println("amstrong");
		else
			System.out.println("not amstrong");
		//System.out.println(sum);
	}

}
