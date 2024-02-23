 package aabhi;
 import java.util.Scanner;

 public class Series1 {
	public static void main(String [] args)
	{
		int i,fact=1,n;
		Scanner in =new Scanner(System.in);
		n=in.nextInt();
		for(i=0;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

}
