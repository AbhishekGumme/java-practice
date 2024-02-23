package aaa;
import java.util.Scanner;

public class RupeesPaisa {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter rupies");
		
		int paisa,rupees;
		rupees=in.nextInt();
		paisa=rupees*100;
		System.out.println("number of paisa = "+paisa);
	}

}
