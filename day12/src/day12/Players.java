package day12;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


class crick
{
	String name;
	int runs;
	int date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public crick(String name, int runs, int date) {
		this.name = name;
		this.runs = runs;
		this.date = date;
	}
	public void getInformation()
	{
		System.out.println("player information = "+name+"  --  "+runs+"  --  "+date);
	}
}
class namecompatator implements Comparator<crick>
{

	@Override
	public int compare(crick obj1, crick obj2) {
		if(obj1.name==obj2.name)
		{
			return 0;
		}
//		else if(obj1.name.length()>obj2.name.length())
//			return 1;
		else if((obj1.name).compareTo(obj2.name)>0)
			return 1;
		else
			return -1;
		
	}
	
}
class run implements Comparator<crick>
{

	@Override
	public int compare(crick o1, crick o2) {
		if(o1.runs==o2.runs)
		{
			return 0;
		}
		else if(o1.runs>o2.runs)
			return 1;
		else
			return -1;
		
	}
	
}
class date implements Comparator<crick>
{

	@Override
	public int compare(crick o1, crick o2) {
		if(o1.date==o2.date)
		{
			return 0;
		}
		else if(o1.date > o2.date)
			return 1;
		else
			return -1;
		
	}
	
}
public class Players {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		LinkedList<crick> team=new LinkedList<crick>();
	
		int choice=0;
		crick p1;
		while(choice!=7)
		{
			System.out.println("1.add player ");
			System.out.println("2.remove player ");
			System.out.println("3.show player ");
			System.out.println("4.sort player by name ");
			System.out.println("5.sort player by runs ");
			System.out.println("6.sort player by date ");
			System.out.println("7.exit ");
			System.out.println("enter choice");
			choice=in.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter name");
				String name=in.next();
				System.out.println("entre runs");
				int runs=in.nextInt();
				System.out.println("entre date");
				int date=in.nextInt();
				
				p1=new crick(name, runs, date);
				team.add(p1);
				break;
			case 2:
				System.out.println("removev playere position");
				int removePosition = in.nextInt();
				p1=team.remove(removePosition);
				p1.getInformation();
						
				break;
			case 3:
				ListIterator<crick> it=team.listIterator();
				while(it.hasNext())
				{
					p1=it.next();
					p1.getInformation();
				}
				
				break;
			case 4:
				System.out.println("before sorting-------------------------------");
				 it=team.listIterator();
				while(it.hasNext())
				{
					it.next().getInformation();
				}
				Collections.sort(team,new namecompatator() );
				System.out.println("after sorting-----------------------------");
				it=team.listIterator();
				while(it.hasNext())
				{
					it.next().getInformation();
				}
				break;
			case 5:
				System.out.println("before sorting-------------------------------");
				 it=team.listIterator();
				while(it.hasNext())
				{
					it.next().getInformation();
				}
				Collections.sort(team,new run() );
				System.out.println("after sorting-----------------------------");
				it=team.listIterator();
				while(it.hasNext())
				{
					it.next().getInformation();
				}
			
				break;
			case 6:
				System.out.println("before sorting-------------------------------");
				 it=team.listIterator();
				while(it.hasNext())
				{
					it.next().getInformation();
				}
				Collections.sort(team,new date() );
				System.out.println("after sorting-----------------------------");
				it=team.listIterator();
				while(it.hasNext())
				{
					it.next().getInformation();
				}
				break;
			case 7:
				break;
			}
		}
		
	}

}

/*1.add player 
2.remove player 
3.show player 
4.sort player by name 
5.sort player by runs 
6.sort player by date 
7.exit 
enter choice
1
enter name
sachin
entre runs
18000
entre date
1987
1.add player 
2.remove player 
3.show player 
4.sort player by name 
5.sort player by runs 
6.sort player by date 
7.exit 
enter choice
1
enter name
rohit
entre runs
13000
entre date
2007
1.add player 
2.remove player 
3.show player 
4.sort player by name 
5.sort player by runs 
6.sort player by date 
7.exit 
enter choice
1
enter name
dhoni
entre runs
15000
entre date
2001
1.add player 
2.remove player 
3.show player 
4.sort player by name 
5.sort player by runs 
6.sort player by date 
7.exit 
enter choice
1
enter name
virat
entre runs
14000
entre date
2005
1.add player 
2.remove player 
3.show player 
4.sort player by name 
5.sort player by runs 
6.sort player by date 
7.exit 
enter choice
3
player information = sachin  --  18000  --  1987
player information = rohit  --  13000  --  2007
player information = dhoni  --  15000  --  2001
player information = virat  --  14000  --  2005
1.add player 
2.remove player 
3.show player 
4.sort player by name 
5.sort player by runs 
6.sort player by date 
7.exit 
enter choice
4
before sorting-------------------------------
player information = sachin  --  18000  --  1987
player information = rohit  --  13000  --  2007
player information = dhoni  --  15000  --  2001
player information = virat  --  14000  --  2005
after sorting-----------------------------
player information = dhoni  --  15000  --  2001
player information = rohit  --  13000  --  2007
player information = sachin  --  18000  --  1987
player information = virat  --  14000  --  2005
1.add player 
2.remove player 
3.show player 
4.sort player by name 
5.sort player by runs 
6.sort player by date 
7.exit 
enter choice
5
before sorting-------------------------------
player information = dhoni  --  15000  --  2001
player information = rohit  --  13000  --  2007
player information = sachin  --  18000  --  1987
player information = virat  --  14000  --  2005
after sorting-----------------------------
player information = rohit  --  13000  --  2007
player information = virat  --  14000  --  2005
player information = dhoni  --  15000  --  2001
player information = sachin  --  18000  --  1987
1.add player 
2.remove player 
3.show player 
4.sort player by name 
5.sort player by runs 
6.sort player by date 
7.exit 
enter choice
6
before sorting-------------------------------
player information = rohit  --  13000  --  2007
player information = virat  --  14000  --  2005
player information = dhoni  --  15000  --  2001
player information = sachin  --  18000  --  1987
after sorting-----------------------------
player information = sachin  --  18000  --  1987
player information = dhoni  --  15000  --  2001
player information = virat  --  14000  --  2005
player information = rohit  --  13000  --  2007 */
