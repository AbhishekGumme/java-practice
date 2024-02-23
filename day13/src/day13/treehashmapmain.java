package day13;

import java.util.HashMap;
import java.util.TreeMap;

public class treehashmapmain {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<>();
		tm.put(100, "abhi");
		tm.put(100, "ram");
		tm.put(600, "shtam");
		tm.put(200, "mark");
		tm.put(400, "jak");
		tm.put(300, "abhi");
		for (HashMap.Entry<Integer,String> abc : tm.entrySet()) 
            System.out.println(abc.getKey() +"--"+ abc.getValue());
		tm.replace(300, "uyg");
		 System.out.println("---------------------------------------");
		for (HashMap.Entry<Integer,String> abc : tm.entrySet()) 
            System.out.println(abc.getKey() +"--"+ abc.getValue());
	}

}
