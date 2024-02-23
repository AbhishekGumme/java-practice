class number11
{
	int no1;
	int no2;
	int ans;
	public escape(int x,int y)
	{
		no1=x;
		no2=y;
	}
	public void division()throws ArithmeticException   //throws
	{
			ans=no1/no2;
	
	}
}
public class Exception8 {

	public static void main(String[] args) {
		
			try
			{
				escape a1=new escape(12,0);
				a1.division();
				System.out.println("last statement");
			}
			catch(Exception e)
			{
				System.out.println("error = "+e.getMessage());
			}
			finally
			{
				System.out.println("inside finally ......");
			}

		}
		
		

	

}
