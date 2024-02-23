package day2;
import java.util.Scanner;

public class program1 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int per=in.nextInt();
		boolean flag=true;
		while(flag)
		{
			System.out.println("pass with extention"+per);
			if(per>40)
			{
				flag=false;
				System.out.println("pass with extention"+per);
				
			}
				
		}
		
//		while(per>=60&&per<70)
//		{
//			System.out.println("pass");
//		}
		
				
	}
	

}
