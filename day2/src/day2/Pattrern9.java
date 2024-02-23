package day2;

import java.util.Scanner;

public class Pattrern9 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int i,j,k=0;
		for(i=0;i<a;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		
	}


}
