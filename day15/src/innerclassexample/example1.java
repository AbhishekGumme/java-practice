package innerclassexample;
class outerclass
{
	int no=10;
	class innerclass
	{
		int no2=20;
		void show()
		{
			System.out.println("number one is ="+no);
			System.out.println("number two is ="+no2);
		}
	}
}

public class example1 {

	public static void main(String[] args) {
		outerclass otc=new outerclass();
		outerclass.innerclass incobj=otc.new innerclass();
		incobj.show();

	}

}
