package day8;
import java.util.Scanner;
class NegativeException extends Exception
{
	String str;
	public NegativeException(String message)
	{
		super(message);
	}
}
class student 
{
	int no;
	String name;
	public student(int n,String s)
	{
		no=n;
		name=s;
	}
	public void show()
	{
		System.out.println("name = "+name);
		System.out.println("number = "+no);
	}
}

public class exception7 {

	public static void main(String[] args) {
		try
		{
			Scanner in=new Scanner(System.in);
			System.out.println("enter a number and name");
			int no=in.nextInt();
			String name=in.next();
			if(no<0)
			{
				throw new NegativeException("no negative number please ---"); 
			}
			student s1=new student(no,name);
			s1.show();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
