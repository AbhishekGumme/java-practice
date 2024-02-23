package day8;
interface aaa
{
	int max=500;
	void calculatemax();
}
interface bbb
{
	int min=100;
	void calculatemin();
	
}
class xyz
{
	int n1,n2;
	void shownumber()
	{
		System.out.println("number 1 is ="+n1);
		System.out.println("numse 2 is ="+n2);
	}
}
	
class interfaceexample extends xyz implements aaa,bbb
{
	int x;
	public interfaceexample(int a)
	{
		x=a;
		
	}
	public void calculatemax()
	{
		if(max>x)
		{
			System.out.println(x+"less than"+max);
		}
	}
	public void calculatemin()
	{
		if(min>x)
		{
			System.out.println(x+"grater than"+max);
		}
		
	}

}
public class Program1 {

	public static void main(String[] args) {
		interfaceexample obj=new interfaceexample(100);
		//interfaceexample obj2=new interfaceexample(100);

		obj.calculatemax();
		obj.calculatemin();
		//obj2.shownumber();
	}

}
