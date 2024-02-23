package day7;
abstract class a
{
	int n1;
	int n2;
	abstract public void show();
	abstract public void addnumber(int n1,int n2);

}
class b extends a
{
	int n2p;
	public void show()
	{
		System.out.println("class b");
	}
	public void addnumber(int n1,int n2)
	{
		int resulit=n1+n2;
		System.out.println("resuli = "+resulit);
	}
	
}
class c extends b
{
	int n3;
	public void show()
	{
		System.out.println("class c");
	}
	public void addnumber(int n1,int n2)
	{
		int resulit=n1+n2;
		System.out.println("resuli = "+resulit);
	}
}
public class Abstractclass {

	public static void main(String[] args) {
		
		b b1=new b();
		b1.show();
		b1.addnumber(10,20);
		c c1=new c();
		c1.show();
		
		
	

	}

}
