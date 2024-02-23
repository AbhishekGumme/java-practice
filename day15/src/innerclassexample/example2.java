package innerclassexample;
abstract class numbrs
{
	abstract void number();
	
}

public class example2 {

	public static void main(String[] args) {
		int no=10;
		numbrs n1=new numbrs()
				{
					void number()
					{
						System.out.println("number is ="+no);
					}
				};
				n1.number();

	}

}
