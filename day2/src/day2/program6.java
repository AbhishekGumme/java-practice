package day2;
import java.util.Scanner;

public class program6 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int i;
		System.out.println("enter n value");
		int n=in.nextInt();
		int a[]=new int[n];
//		int a[]=new int[5];
//		a[0]=100;
//		a[1]=200;
//		a[2]=300;
//		a[3]=400;
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
		System.out.println("enter array");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("a["+i+"] = "+a[i]);
		}
	}

}
