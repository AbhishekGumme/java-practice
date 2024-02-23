package innerclassexample;

import java.util.ArrayList;

public class listlimbda {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		list1.add("abhi");
		list1.add("prasad");
		list1.add("samrath");
		list1.add("swaraj");
		list1.forEach((n)->System.out.println(n));
	}
 
}
