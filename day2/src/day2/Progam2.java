package day2;
import java.util.Scanner;
public class Progam2 {
	public static void main(String [] args) {
		//Scanner in=new Scanner(System.in);
		System.out.println("enter marks");
		int a,b,c,d;
//		double per;
//		a=in.nextInt();
//		b=in.nextInt();
//		c=in.nextInt();
//		d=in.nextInt();
//		per=((a+b+c+d)*100)/400;
		//double per=in.nextDouble();
		//per =60.54;
		//System.out.println(per);
		int count=0;
		while(true)
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("enter per");
			double per=scn.nextDouble();
			if(per>70)
			{
				System.out.println("its extention");
				break;
			}
			else if((per<70)&&(per>60))
			{
				System.out.println("its first destion");
				break;
			}
			else if((per<60)&&(per>50))
			{
				System.out.println("its secound class ");
				break;
			}
			else if(per<50 && per>40)
			{
				System.out.println("its moderate");
				break;
			}
			else
			{
				System.out.println("ask for reexam");
				count++;
				
			}
			//System.out.println(count);
		}
		System.out.println("total count");
		System.out.println(count);
		
	}

}
