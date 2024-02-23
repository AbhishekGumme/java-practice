package aaa;
import java.util.Scanner;
public class SimpleInterst {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter simple interst");
		
		int p,r,n;
		p=in.nextInt();
		r=in.nextInt();
		n=in.nextInt();
		double si;
		si=(p*r*n)/100;
		System.out.println("simple interst = "+si);
		
	}
	

}
