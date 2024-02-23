package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

class employ
{
	String name;
	int no;
	int salary;
	public employ(String name, int no, int salary) {
		super();
		this.name = name;
		this.no = no;
		this.salary = salary;
	}
	public void getinfo() 
	{
		System.out.println("employ name is = "+name);
		System.out.println("employ number is = "+no);
		System.out.println("employ salary is = "+salary);
	}
}
class salarycomparator implements Comparator<employ>
{

	@Override
	public int compare(employ obj1, employ obj2) {
		if(obj1.salary==obj2.salary)
		{
			return 0;
		}
		else if(obj1.salary>obj2.salary)
			return 1;
		else
			return -1;
		
	}
	
}
class namecomparater implements Comparator<employ>
{

	@Override
	public int compare(employ obj1, employ obj2) {
		if(obj1.no==obj2.no)
		{
			return 0;
		}
		else if(obj1.no>obj2.no)
			return 1;
		else
			return -1;
		}
	
}

public class classcomparatersmain {

	public static void main(String[] args) {
		ArrayList<employ> list=new ArrayList<>();
		list.add(new employ("sagar", 11201, 80000));
		list.add(new employ("abhi", 10121, 80000));
		list.add(new employ("prasad", 1225, 86000));
		list.add(new employ("swaraj", 101, 70000));
		list.add(new employ("gumme", 10011, 10000));
		list.add(new employ("sachin", 12501, 150000));
		System.out.println("before sorting-------------------------------");
		ListIterator<employ> team=list.listIterator();
		while(team.hasNext())
		{
			team.next().getinfo();
		}
		Collections.sort(list,new salarycomparator() );
		System.out.println("after sorting-----------------------------");
		team=list.listIterator();
		while(team.hasNext())
		{
			team.next().getinfo();
		}
		System.out.println("--------------------------------------------");
		System.out.println("********************************************");
		System.out.println("before sorting-------------------------------");
		team=list.listIterator();
		while(team.hasNext())
		{
			team.next().getinfo();
		}
		Collections.sort(list, new namecomparater() );
		System.out.println("after sorting-----------------------------");
		team=list.listIterator();
		while(team.hasNext())
		{
			team.next().getinfo();
		}
		

	}

}
