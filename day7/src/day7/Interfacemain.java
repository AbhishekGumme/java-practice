package day7;
interface number2
{
	int max=100;
	void calculatemax();
	void showmax();
	
}
class number1 implements number2
{
	int n1,n2;
	number1(int n,int c)
	{
		n1=n;
		n2=c;
	}
	public void calculatemax()
	{
		if((n1>max)&&(n2>max))
		{
			System.out.println("number is grater than max");
		}
		else 
		{
			System.out.println("max numder is grater");
		}
	}
	public void showmax()
	{
		System.out.println("maximum number is = "+max);
	}
}

public class Interfacemain {

	public static void main(String[] args) {
		number1 n1=new number1(221,125);
		n1.showmax();
		n1.calculatemax();
		
	}

}
