package day3;

import java.util.Scanner;

public class program6 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int i,j,temp=0;
		int n=in.nextInt();
		int []a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			
			for(j=i+1;j<n;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			
		}
		System.out.println("arry in reverse order");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}