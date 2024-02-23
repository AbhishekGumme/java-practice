package lab1l;
import java.util.Scanner;

public class lab1 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int i,j=0,count=0;
		int n;
		n=in.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
//			if(a[i]%2==0)
//			{
//				System.out.println("[a"+i+"]= "+a[i]);
//			}
//			else
//			{
//				System.out.println("a["+i+"] = "+a[i]);
//			}
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				//System.out.println("[a"+i+"]= "+a[i]);
				//System.out.println("[b"+j+"]= "+b[j]);
				b[j]=a[i];
				System.out.println("[b"+j+"]= "+b[j]);
				j++;
				count++;
			}
			//System.out.println("[b"+j+"]= "+b[j]);
//			else
//			{
//				
//				System.out.println("a["+i+"] = "+a[i]);
//				count++;
//			}
		}
		System.out.println("toptal count");
		System.out.println(count);
	}
}
