package assigment1s;
import java.util.Scanner;
public class AssiQ7 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number = ");
		char ch=in.next().charAt(0);
		int value=ch;
		System.out.println("ASCII value of that number = "+value);
	}
	

}

/*out put:-
 enter a number = 
4
ASCII value of that number = 52

enter a number = 
a
ASCII value of that number = 97*/
