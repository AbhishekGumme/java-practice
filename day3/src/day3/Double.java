package day3;
import java.util.Scanner;
class Abhi
 	{
		int id;
		String name;
		int salary;
		public void setinformation(int  i,String na,int  sa)
		{
			id=i;
			name=na;
			salary=sa;
		}
		public void getinformation()
		{
			System.out.println(id+" "+name+" "+salary);
		}
		
 	}

public class Double {

	public static void main(String [] args)
	{
		Abhi e1=new Abhi();

		int i;
		String na;
		int sa;
		Scanner in=new Scanner(System.in);
		System.out.println("employ number");
		i=in.nextInt();
		System.out.println("employ name");
		na=in.next();
		System.out.println("employ salary");
		sa=in.nextInt();
		e1.setinformation(i,na,sa);
		e1.getinformation();
		
		
	}

}
