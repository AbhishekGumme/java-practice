package day13;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsetmain {

	public static void main(String[] args) {
		LinkedHashSet<String> liset=new LinkedHashSet<>();
		liset.add("aaa");
		liset.add("sss");
		liset.add("aaa");
		liset.add("bbb");
		liset.add("ccc");
//		Iterator<String> itr=liset.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		liset.forEach((n)->System.out.println(n));
		System.out.println("size is = "+liset.size());
		

	}

}
