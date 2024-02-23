package day8;

public class Exceptionexample2 {

	public static void main(String[] args) {
		try
		{
		int a[]=new int[4];
		for(int i=0;i<5;i++)
			a[i]=10;
		
		System.out.println("below ststements -----");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
