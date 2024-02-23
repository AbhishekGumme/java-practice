package day6;

class abc
{
	int n1;
	int n2;
	abc(int x,int y)
	{
		n1=x;
		n2=y;
		
	}
	void set1(int n)
	{
		n1=n;
		
	}
	void show()
	{
		System.out.println("b no1= "+n1);
		System.out.println("b no2 ="+n2);
	}
	
}
class def extends abc
{
	int n3;
	int n1;
	def(int x,int y,int z)
	{
		super(x,y);
		n3=z;
		n1=x;
	}
	void show()
	{
		super.show();
		System.out.println("b no1= "+n1);
		System.out.println("b no3 ="+n3);
	}
}

public class Superover {

	public static void main(String[] args) {
		def b1=new def(10,20,30);
		b1.show();
		
	}

}
