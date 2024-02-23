package day13;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class linkedhashmapmain {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(100, "abhi");
		lhm.put(100, "ram");
		lhm.put(600, "shtam");
		lhm.put(200, "mark");
		lhm.put(400, "jak");
		lhm.put(300, "abhi");
		for (HashMap.Entry abc : lhm.entrySet()) 
            System.out.println(abc.getKey() +"--"+ abc.getValue());

	}

}
