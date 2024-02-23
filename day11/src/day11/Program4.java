package day11;
import java.util.Scanner;
public class Program4 {
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter marks");
		int a,b,c,d;
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=in.nextInt();
		double per=((a+b+c+d)*100)/400;
		//double per=in.nextDouble();
		//per =60.54;
		System.out.println(per);
		if(per>70)
		{
			System.out.println("its extention");
			
		}
		else if((per<70)&&(per>60))
		{
			System.out.println("its first destion");
		}
		else if((per<60)&&(per>50))
		{
			System.out.println("its secound class ");
		}
		else
		{
			System.out.println("its moderate");
		}
	}

}
