package lab1l;
class test
{
	private int a,b;
	private String name,address;
	private boolean status;
	private float x,y,z;
	public void set()
	{
		a=100;
		b=500;
		System.out.println("value of a is ="+a);
		System.out.println("value of b is ="+b);
		
	}
	
	public int set(int x,int y)
	{
		a=x;
		b=y;
		return (a+b);
	}
	boolean set(boolean y)
	{
		status=y;
		return(status);
	}
}

public class Methodoverloading {
	public static void main(String [] args)
	{
		test abc=new test();
		System.out.println(abc.set(12,34));
		abc.set();
		System.out.println(abc.set(false));
	}

}
