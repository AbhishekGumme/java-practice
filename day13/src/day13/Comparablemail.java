package day13;

import java.util.ArrayList;

import java.util.Collections;
import java.util.ListIterator;

class player implements Comparable<player>
{
	String name;
	int debut;
	int runs;
	int age;
	public player(String name, int debut, int runs, int age) {
		super();
		this.name = name;
		this.debut = debut;
		this.runs = runs;
		this.age = age;
	}
	public void getinfo()
	{
		System.out.println("player name = "+name);
		System.out.println("player debut = "+debut);
		System.out.println("player name = "+runs);
		System.out.println("player name = "+age);
		
	}
	@Override
	public int compareTo(player xyz) {
//		if(this.runs==xyz.runs)
//		{
//			return 0;
//		}
//		else if(this.runs>xyz.runs)
//			return 1;
//		else
//			return -1;
		if(this.runs==xyz.runs)
			{
				return 0;
			}
			else if(this.runs<xyz.runs)
				return 1;
			else
				return -1;
	}
}
public class Comparablemail {

	public static void main(String[] args) {
		ArrayList<player> list=new ArrayList<>();
		list.add(new player("sachin", 1987, 18000, 45));
		list.add(new player("dhoni", 1995, 15000, 42));
		list.add(new player("rohit", 2007, 11000, 33));
		list.add(new player("virat", 2006, 14000, 34));
		list.add(new player("hardik", 2015, 8000, 25));
		list.add(new player("shubhman", 2020, 1000, 25));
		list.add(new player("umesh", 2007, 1800, 35));
		list.add(new player("shami", 1997, 9000, 35));
		list.add(new player("akshar", 2017, 4000, 25));
		list.add(new player("kumar", 2018, 1850, 29));
		list.add(new player("jadeja", 2015, 5500, 28));
		list.add(new player("sehawag", 2015, 1000, 27));
		list.add(new player("gambher", 2015, 1000, 25));
		System.out.println("before sorting");
		ListIterator<player> team=list.listIterator();
		while(team.hasNext())
		{
			team.next().getinfo();
		}
		Collections.sort(list);
		System.out.println("after sorting");
		team=list.listIterator();
		while(team.hasNext())
		{
			team.next().getinfo();
		}
		
	}

}
