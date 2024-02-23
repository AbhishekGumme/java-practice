package day3;

import java.util.Scanner;

public class program8 {public static void main(String [] args)
{
	Scanner in=new Scanner(System.in);
	int i,j,temp=0;
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
			
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		
	}
	System.out.println("manimum number = "+a[i]);
}

}
