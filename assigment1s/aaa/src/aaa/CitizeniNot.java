package aaa;

import java.util.Scanner;

public class CitizeniNot {
	public static void main(String [] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter number of age");
	int age;
	age=in.nextInt();
	if(age>60)
	
	{
		System.out.println("citizen is sinor = "+age);
	}
	else if(age>20&&age<60)
		
	{
		System.out.println("citizen is major = "+age);
	}
	else
	{
		System.out.println("citizen is minor = "+age);
	}
	
	}
	
}

/*out put=
enter number of age
70
citizen is sinor = 70
*/
