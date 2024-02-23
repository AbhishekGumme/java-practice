package aabhi;

import java.util.Scanner;

public class Febonachi {
	public static void main(String [] args)
	{
		int  i=3,j=7,a;
		Scanner in =new Scanner(System.in);
		System.out.println("enter a number");
		i=in.nextInt();
		j=in.nextInt();
		if(i<j)
		{
			for( a=i;a<=j;a++)
			{
				System.out.println(a);
			}
		}
		else
			{
			for(a=i;a>=j;a--)
			
			System.out.println(a);
			}
				

	}
	

}
