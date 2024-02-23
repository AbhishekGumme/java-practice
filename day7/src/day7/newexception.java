package day7;

public class newexception {

	public static void main(String[] args) {
		try
		{
		String str="aasfd";
		//String str=null;     //Cannot invoke "String.length()" because "str" is null
		System.out.println(str.length());
		int a[]=new int[4];
		for(int i=0;i<5;i++)   //Index 4 out of bounds for length 4
			a[i]=10;
		//int ans=10/0;
		
		System.out.println("below ststements -----");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("errror will occure");
		}
		System.out.println("below ststements -----");

	}

}
