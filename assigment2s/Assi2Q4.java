package assigment2s;

import java.util.Scanner;

public class Assi2Q4 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int i,j,t;
		int n=in.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		int max=a[a.length-1];
		System.out.println("maximum = "+max);
		int min=a[a.length-2];
		System.out.println(" 2 nd maximum ="+ min);
		
	}

}
