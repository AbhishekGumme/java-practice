
package day8;
import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		int n1,n2;
		try
		{
			Scanner in=new Scanner(System.in);
			System.out.println("enter number no1");
			n1=in.nextInt();
			//n1=Integer.parseInt(in.nextLine());
			System.out.println("enter number no2");
			n2=in.nextInt();
			int ans=n1/n2;
			System.out.println("division is = "+ans);
		}
		catch(Exception e)
		{
			System.out.println("no2 is not be zero");
		}
		

	}

}
