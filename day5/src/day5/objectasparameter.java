package day5;
class add{
	int n1;
	int n2;
	public add() 
	{
		n1=0;n2=0;
	}
	public add(int x,int y) 
	{
		n1=x;
		n2=y;
	}
	public void add(int x,int y)
	{
		
		int ans=x+y;
		System.out.println("addition of integer ="+ans);
		
	}
	public void add(double x,double y)
	{
		double ans=x+y;
		System.out.println("addition of double ="+ans);
	}
	public void show()
	{
		
		System.out.println("num 1 = "+n1);
		System.out.println("num 2 = "+n2);
	}
	public void assignobject(add ran)
	{
		n1=ran.n1;
		n2=ran.n2;
//		this.n1=ran.n1;
//		this.n2=ran.n2;
	}
}

public class objectasparameter {
	public static void main(String [] args)
	{
		add num1=new add(10,20);
		add num2=new add();
		num2.assignobject(num1);
		System.out.println("for first object");
		num1.show();
		System.out.println("**************************");
		System.out.println("for secound object");
		num2.show();
		//num1.add(10, 20);
		
		
		
	}

}
