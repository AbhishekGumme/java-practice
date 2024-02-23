package day2;

import java.util.Scanner;

public class program10 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int i,j;
		for(i=0;i<a;i++)
		{
			for(j=1;j<a;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print("#");
				}
				
			}
			
			System.out.println();
		}
		
		
	}

}
