package lab1l;
import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i,j,b,temp=0;
		int []a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			temp=0;
			for(b=2;b<a[i];b++) 
			{
				if(a[i]%b==0)
				{
					temp=1;
				}
			
				if(temp==0) 
					{
						System.out.println(a[i]);
					}
			}
			
		}
		

	}

}
