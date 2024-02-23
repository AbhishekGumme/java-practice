package day8;

public class exception4 {

	public static void main(String[] args) {
		try
		{
			try
			{
				String str=null;   
				System.out.println(str.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("error = "+e.getMessage());
			}
			try
			{
				int a[]=new int[4];
				for(int i=0;i<5;i++)   //Index 4 out of bounds for length 4
					a[i]=10;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("error = "+e.getMessage());
			}
			try
			{
				int ans=10/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("error = "+e.getMessage());
			}
			
			System.out.println("below ststements -----");
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e.getMessage());
//		}
		catch(Exception e)
		{
			System.out.println("errror will occure");
		}
		System.out.println("below ststements -----");


	}

}


/*out put:_
error = Cannot invoke "String.length()" because "str" is null
error = Index 4 out of bounds for length 4
error = / by zero
below ststements -----
below ststements -----
*/