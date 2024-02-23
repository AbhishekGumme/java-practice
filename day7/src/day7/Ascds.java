package day7;
abstract class aa
{
	int a1,a2,a3;
	abstract void show(int n1,int n2);
}
class bb extends aa
{
	
	void show(int n1,int n2)
	{
		int ans=a1+a2;
		System.out.println("answere = "+ans);
		
	}
}
abstract class cc extends aa
{
	abstract void getvalue(int n1,int n2);
	
}
class dd extends cc
{
	void show(int n1,int n2)
	{
		int ans=a1+a2;
		System.out.println("answere = "+ans);
		
	}
	void getvalue(int n1,int n2)
	{
		System.out.println("values are "+a1+"secound cvalue ="+a2);
	}
}
class ee extends cc
{
	void show(int n1,int n2)
	{
		int ans=a1+a2;
		System.out.println("answere = "+ans);
	}
	void getvalue(int n1,int n2)
	{
		System.out.println("values are "+a1+"secound cvalue ="+a2);
	}
}
class ff extends cc
{
	void show(int n1,int n2)
	{
		int ans=a1+a2;
		System.out.println("answere = "+ans);
	}
	void getvalue(int n1,int n2)
	{
		System.out.println("values are "+a1+"secound cvalue ="+a2);
	}
}


public class Ascds {
	public static void main(String [] args)
	{
		ff a1=new ff();
		a1.show(2,3);
	}

}
