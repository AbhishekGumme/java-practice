package lab1l;
import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter two value");
		a=in.nextInt();
		b=in.nextInt();
		try
		{
			System.out.println("met cdac 2023 march");
			c=a+b;
			System.out.println("addition i ="+c);
			c=a/b;
			System.out.println("division is ="+c);
			c=a*b;
			System.out.println("multiplicatin is ="+c);
			System.out.println("best luck");
		}
		catch(Exception e)
		{
			System.out.println("not divisible by o ");
			System.out.println("error");
		}
		System.out.println("end of program");
		

	}

}
