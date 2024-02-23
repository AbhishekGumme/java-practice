package innerclassexample;

import java.util.ArrayList;
import java.util.Iterator;

public class wapperexample {

	public static void main(String[] args) {
		int i=10;
		ArrayList<Integer> obj=new ArrayList<>();
		
		obj.add(i);
		String str="123";
		Integer sum=Integer.parseInt(str);
		obj.add(sum);
		Iterator<Integer> itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
				
		}

	}

}
