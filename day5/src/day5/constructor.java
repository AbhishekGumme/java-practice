package day5;
class simple
{
	private int a;
	private int b;
	simple()
	{
		System.out.println("simple parapeterless constructor");
	}
	simple(int a)
	{
		this.a=a;
		this.b=a;
		System.out.println("vhjagd");
	}
	simple(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("fjh");
	}
	public void show()
	{
		//System.out.println("1st constructor ="+a);
		System.out.println("constructoor a="+a+"  b == "+b);
	}
}

public class constructor {
	public static void main(String [] args)
	{
		simple s1=new simple();
		simple s2=new simple(25);
		simple s3=new simple(28,35);
		s1.show();
		s2.show();
		s3.show();
		
	}

}
