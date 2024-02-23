package aabhi;
import java.util.Scanner;

public class SwitchChoice {
	public static void main(String [] args)
	{
		int n;
		System.out.println("1.tea\n2.coffe\n3.drink\n0.exit");
		Scanner in =new Scanner(System.in);
		System.out.println("enter a number");
		n=in.nextInt();
		do
		{
			switch(n)
			{
			case 1:
				System.out.println("tea selected");
				break;
			case 2:
				System.out.println("coffe selected");
				break;
			case 3:
				System.out.println("drink selected");
				break;
			case 0:
				System.out.println("exit selected");
				break;
			default:
				System.out.println("wrong selected");
			}
			System.out.println("enter a number");
			n=in.nextInt();
		}while(n!=0);
		
	}

}
