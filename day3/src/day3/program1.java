package day3;
import java.util.Scanner;

public class program1 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int n;
		boolean flag=true;
		
		while(true)
		{
			n=in.nextInt();
			
		switch(n)
		{
			case 1:
				System.out.println("coffe");
				System.out.println("you have another any item");
				break;
			case 2:
				System.out.println("tea");
				System.out.println("you have another any item");
				break;
			case 3:
				System.out.println("vadapav");
				System.out.println("you have another any item");
				break;
			case 4:
				System.out.println("misal pav");
				System.out.println("you have another any item");
				break;
			default:
				System.out.println("goto home");
				
			
		}
		if(n>4)
		{
			flag=false;
			System.out.println("food is over");		
		}
			
		}
	}
	

}
