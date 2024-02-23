package day3;
import java.util.Scanner;
public class program4 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int i,j,max=0;
		int n=in.nextInt();
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
				max=a[0];
				if(a[j]>max)
				{
					max=a[j];
				}
				
			}
			
		}
		System.out.println("maximum number = "+max);
	}

}
