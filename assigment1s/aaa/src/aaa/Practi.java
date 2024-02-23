package aaa;

import java.util.Scanner;

class emp
{
	private
	int id,salary;
	String name,dept;
	public
	Scanner in=new Scanner(System.in);
	void get()
	{
		System.out.println("empoly id");
		id=in.nextInt();
		System.out.println("empoly name");
		name=in.next();
		System.out.println("empoly department");
		dept=in.next();
		System.out.println("empoly salary");
		salary=in.nextInt();
		
	}
	void show()
	{
		System.out.println("emploay id = "+id);
		System.out.println("empoly name = "+name);
		System.out.println("empoly department = "+dept);
		System.out.println("empoly salary = "+salary);
	}
	int sal()
	{
		return(salary);
	}
}
   
public class Practi {
	public static void main(String[] args)
	{
		emp[] eobj;
		eobj =new emp[5];
		int i,sum=0;
		float avg;
		System.out.println("enter employ details");
		for(i=0;i<5;i++)
		{
			eobj[i]=new emp();
			eobj[i].get();
			sum=sum+eobj[i].sal();
		
		
		}
			avg=sum/5;
			System.out.println("employ enformatio");
			for(i=0;i<5;i++)
			{
				eobj[i].show();
			  
			}
			System.out.println("total salary = "+sum);
			System.out.println("total average = "+avg);
	}

}
