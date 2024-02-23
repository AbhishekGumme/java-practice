package day13;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetmain {

	public static void main(String[] args) {
		TreeSet<String> tset=new TreeSet<>();
		//TreeSet<E>
		tset.add("mmm");
		tset.add("xxx");
		tset.add("aza");
		tset.add("ass");
		tset.add("aaa");
		tset.add("bbb");
		tset.add("ccc");
		Iterator<String> itr=tset.iterator();
		while(itr.hasNext())
		{
			System.out.println("order is ="+itr.next());
		}
		

	}

}
