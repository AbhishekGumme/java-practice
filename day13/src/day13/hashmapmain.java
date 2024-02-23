package day13;

import java.util.HashMap;

public class hashmapmain {

	public static void main(String[] args) {
		HashMap<Integer, String> hmep=new HashMap<>();
		hmep.put(100, "ram");
		hmep.put(600, "shtam");
		hmep.put(200, "mark");
		hmep.put(400, "jak");
		hmep.put(300, "abhi");
		System.out.println("size is = "+hmep.size());
		if(hmep.containsKey(200))
		{
			System.out.println("key is found");
		}
		else
		{
			System.out.println("key is not found");
		}
		for (HashMap.Entry abc : hmep.entrySet()) 
            System.out.println(abc.getKey() +"--"+ abc.getValue());
		
	//<Integer,String>
	}

}
