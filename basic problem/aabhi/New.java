package aabhi;
import java.util.Scanner;

public class New {
	public static void main(String [] args) 
	{
		int i=1,n,sum=0,product=1;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		while(true)
		{
			
			System.out.println("enter number=");
			n=in.nextInt();
			
			if(n==-1)
			{
				break;
			}
			else if(n%2!=0)
			{
				sum+=n;
			}
			else
				product*=n;
		}
		System.out.println("sum is"+sum+"produdt is="+product);
		
		
	}

}
