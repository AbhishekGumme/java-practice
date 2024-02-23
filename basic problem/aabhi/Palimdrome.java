package aabhi;

import java.util.Scanner;

public class Palimdrome {
	public static void main(String [] args)
	{
		int n, rno=0;
		
		Scanner in =new Scanner(System.in);
		System.out.println("enter a number");
		n=in.nextInt();
		int x=n;
		
		while(n>0)
		{
			int d=n%10;
			n=n/10;
			
			rno=rno*10+d;
			//System.out.println("digit removed"+d+"number is"+n);
		}
		System.out.println(rno);
		if(rno==x)
			System.out.println("palimdrone");
		else
			System.out.println(" not palimdrome");
		//System.out.println(sum);
	}

}
