package aaa;

import java.util.Scanner;

public class Larger4Num {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int a,b,c,d;
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=in.nextInt();
		if(a>b&&a>c&&a>d)
		{
			System.out.println("number a is grater = "+a);
		}
		else if(b>a&&b>c&&b>d)
		{
			System.out.println("number b is grater = "+b);
		}
		else if(c>a&&c>b&&c>d)
		{
			System.out.println("number c is grater = "+c);
		}
		else
		{
			System.out.println("number d is grater = "+d);
		}
		
	}
	
	

}

/*out put:=
enter number
1
85
4
96
number d is grater = 96
*/
