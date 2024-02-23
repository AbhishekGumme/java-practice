package day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
class stu
{
	String name;
	int rno;
	stu(String name,int rno)
	{
		this.name=name;
		this.rno=rno;
	}
	public void getinformatin()
	{
		System.out.println("name of student = "+name);
		System.out.println("rni of student = "+rno);
	}
}


public class Arryl {

	public static void main(String[] args) {
//		ArrayList<String>d=new ArrayList<String>();
//		d.add("avhgsd");
//		d.add("jgfjg");
//		d.add("fugf");
//		ArrayList<String>e=new ArrayList<String>();
//		e.add("rfy");
//		e.add("jhhgj");
//		Iterator<String> itr=e.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		ArrayList<stu> s=new ArrayList<stu>();
		//s.add(new stu (12,"abhi"));
		stu s1=new stu("abhi",12);
		stu s2=new stu("gfd",15);
		stu s5=new stu("pra",10);
		stu s6=new stu("swa",18);
		s.add(s1);
		s.add(s2);
		s.add(s5);
		s.add(s6);
		stu s3=s.remove(1);
		System.out.println("removed student by  using remove");
		s3.getinformatin();
		stu s7=s.get(2);
		System.out.println("removed student by using get");
		s7.getinformatin();
		stu s8=s.set(1, s3);
		//Replaces the element at the specified position in this list with the specified element.
		System.out.println("removed student by using set");
		s8.getinformatin();
		ListIterator<stu> index=s.listIterator();
		System.out.println(" student");
		while(index.hasNext())
		{
			stu s4= index.next();
			s4.getinformatin(); 	
		}
		System.out.println("prevoius method");
		while(index.hasPrevious())
		{
			stu s4= index.previous();
			s4.getinformatin(); 	
		}
		
		

	}

}
