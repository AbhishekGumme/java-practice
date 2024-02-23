package day11;
import java.util.Scanner;
public class ProgramBasic1 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("first program ");
		int n=in.nextInt();
		int []a=new int[n];
		//int b[]= {3,5,7};
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}
	}

}
