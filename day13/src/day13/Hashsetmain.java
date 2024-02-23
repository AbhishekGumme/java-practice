package day13;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetmain {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<>();
		hset.add("aaa");
		hset.add("bbbb");
		hset.add("cccb");
		hset.add("12b");
		hset.add("145bb");
		HashSet<String> bset=new HashSet<>();
		bset.add("zdfs");
		bset.add("dff");
		bset.add("dygdf");
		bset.add("fhfg");
		bset.add("fhygfd");
		Object v3=bset.clone(); 
		System.out.println("elements are v3 = "+v3);
		if(hset.isEmpty())
		{
			System.out.println("hash set is emp[ty");
		}
		else
		{
			System.out.println("hash set i snot emptyt size is ="+hset.size());
		}
		Iterator<String> it=hset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
