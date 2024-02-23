package day5;
import java.util.Scanner;

public class staticmethod {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		employnew e1=new employnew();
		employnew.setCount();
		System.out.println("eneter name");
		String ename=in.nextLine();
		e1.setEname(ename);
		int eid=employnew.getCount();
		e1.setEid(eid);
		System.out.println("print information");
		e1.get();
		employnew e2=new employnew();
		employnew.setCount();
		System.out.println("eneter name");
		ename=in.nextLine();
		e2.setEname(ename);
		eid=employnew.getCount();
		e2.setEid(eid);
		System.out.println("print information");
		e2.get();

		

	}

}
