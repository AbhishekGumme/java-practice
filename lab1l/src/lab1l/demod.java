package lab1l;
import java.util.Scanner;



public class demod {
	int id;
	String name;
	int salary;
	//String div;
	
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
	public static void main(String [] args)
	{
		demod e1=new demod();		
		int id;
		String name;
		int salary;
		Scanner in=new Scanner(System.in);
		System.out.println("employ number");
		id=in.nextInt();
		System.out.println("employ name");
		name=in.next();
		System.out.println("employ salary");
		salary=in.nextInt();
		e1.setinformation(id,name,salary);
		e1.getinformation();
		
		
	}

}
