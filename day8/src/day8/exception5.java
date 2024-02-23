package day8;
class number
{
	int no1;
	int no2;
	int ans;
	public number(int x,int y)
	{
		no1=x;
		no2=y;
	}
	public void division()
	{
		try
		{
			ans=no1/no2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("error = "+e.getMessage());
		}
		//System.out.println("division succ");
		
	}
}

public class exception5 {

	public static void main(String[] args) {
		try
		{
			number a1=new number(12,15);
			a1.division();
			System.out.println("last statement");
		}
		catch(Exception e)
		{
			System.out.println("error = "+e.getMessage());
		}

	}

}
