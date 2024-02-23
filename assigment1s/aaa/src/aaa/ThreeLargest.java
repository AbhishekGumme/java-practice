package aaa;

import java.util.Scanner;

public class ThreeLargest {
	public static void main(String [] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter number");
	int a,b,c;
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	if(a>b&&a>c)
	{
		System.out.println("number a is grater = "+a);
	}
	else if(b>a&&b>c)
	{
		System.out.println("number b is grater = "+b);
	}
	else
	{
		System.out.println(" number c is grater = "+c);
	}
	}

}


/*out put=
enter number
12
545
2
number b is grater = 545
*/
