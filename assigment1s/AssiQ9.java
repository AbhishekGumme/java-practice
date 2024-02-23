package assigment1s;
import java.util.Scanner;

public class AssiQ9 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0,i,max=0,min=0;
		System.out.println("enter a number");
		for(i=0;i<5;i++)
		{
			a[i]=in.nextInt();
			//sum+=a[i];
			if(a[i]>max)
			{
				max=a[i];
				//System.out.println("maximum number is= "+max);
			}
			else if(min<a[i])
			{
				min=a[i];
				//System.out.println("minimum number is = "+min);
			}
			
			
		}
		System.out.println("maximum number is= "+max);
		System.out.println("minimum number is = "+min);
	}

}

/*
out put:-
maximum number is = 88
minimum number is = 45
*/
