package day12;


import java.util.LinkedList;
import java.util.ListIterator;

class cricket
{
//	String ;
//	int 
//	cricket()
//	{
//		
//	}
}

public class Link {

	public static void main(String[] args) {
		
		
		LinkedList<String> cmglist= new LinkedList<String>();
		cmglist.add("sachin");
		cmglist.add("ms dhoni");
		cmglist.add("rohit");
		cmglist.add("virat");
		cmglist.add("hardik");
		cmglist.add("bumrah");
		cmglist.add("kunal");
		cmglist.add("gill");
		cmglist.add("ruturaj");
		cmglist.add("chahal");
		cmglist.add("kuldeep");
		cmglist.add("shami");
		cmglist.add("deepak");
//		System.out.println("get first olayer == "+cmglist.getFirst());
//		System.out.println("get last olayer == "+cmglist.getLast());
//		System.out.println("get  olayer == "+cmglist.get(2));
//		System.out.println("get  olayer == "+cmglist.removeFirst());
		cmglist.add("sehawag");
		cmglist.addLast("raina");
		System.out.println("get  olayer == "+cmglist.removeFirst());
//		cmglist.addFirst("rohit");
//		cmglist.addLast("chahal");
		cmglist.remove(6);
		cmglist.remove(8);
		cmglist.remove(9);
		System.out.println("get first olayer == "+cmglist.getFirst());
		System.out.println("get first olayer == "+cmglist.getLast());
		ListIterator<String> itr=cmglist.listIterator();
		System.out.println("player list is");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
