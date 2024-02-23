package day12;

import java.util.ListIterator;
import java.util.Vector;

public class vect {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		v1.add("asd");
		v1.add("vchg");
		v1.add("gfg");
		v1.add("gwer");
		v1.add("gswd");
		v1.add("gswd");
		v1.add("gswd");
		v1.add("gswd");
		v1.add("gswd");
		v1.add("gswd");
		v1.add("gswd");
		v1.add("gswd");
		
		System.out.println("elements atre v1 ="+v1);
		Vector<String> v2=new Vector<>(v1);
		System.out.println("elements are v2 = "+v2);
		Object v3=v1.clone(); 
		System.out.println("elements are v3 = "+v3);
		Object v4=v1.capacity();
		System.out.println("capicity is v4 = "+v4);
		ListIterator<String> it=v1.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		int arr[]=new int[15];
		v1.insertElementAt("75", 1);
		System.out.println(v1);
		
		

	}

}
