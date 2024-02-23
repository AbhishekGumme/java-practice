package innerclassexample;
class outerclasslocal
{
	int no=10;
	public void shownumber()
	{
		
		class innerclass1
		{
			int no2=20;
			
			void shownumber()
			{
				System.out.println("i am in innerclass");
				System.out.println("number is = "+no);
				System.out.println("number is = "+no2);
			}
		}
		innerclass1 abc=new innerclass1();
		abc.shownumber();
		
	}
}
public class example3 {

	public static void main(String[] args) {
		outerclasslocal xyz=new outerclasslocal();
		xyz.shownumber();

	}

}
