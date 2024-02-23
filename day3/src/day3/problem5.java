package day3;

import java.util.Scanner;

public class problem5 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int i,j,min=0;
		int n=in.nextInt();
		System.out.println();
		int []a=new int[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			 //max=a[0];
			for(j=i+1;j<n;j++)
			{
				min=a[0];
				if(a[j]<min)
				{
					min=a[j];
				}
				
			}
			
		}
		System.out.println("manimum number = "+min);
	}

}
