package innerclassexample;
class staticclass1
{
	static int no=200;
	static class staticinnerclass
	{
		static int no2=100;
		void addnumber()
		{
			int ans=no+no2;
			System.out.println("answer is = "+ans);
		}
	}
}

public class example4 {

	public static void main(String[] args) 
	{
		staticclass1.staticinnerclass instobj=new staticclass1.staticinnerclass();
		instobj.addnumber();
		}

}
