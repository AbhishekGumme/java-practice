package day5;
import java.util.Scanner;

public class Staticvariable {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		
		Static s1=new Static();
		String name=in.nextLine();
		s1.setStuname(name);
		int rollno=in.nextInt();
		s1.setRollno(rollno);
		char div=in.next().charAt(0);
		s1.setDiv(div);
		Static s2=new Static();
		s2.setStuname("prasad");
		s2.setRollno(02);
		s2.setDiv('b');
		System.out.println("first student information");	
		s1.get();
		System.out.println("secound student information");
		s2.get();
		
		
		

	}

}
