package day6;
class vehical
{
	int cc;
	int wheels;
	int topspeed;
	void showinformation()
	{
		System.out.println("i am here in vehicle");	
	}
	public vehical(int x,int y,int e)
	{
		cc=e;
		wheels=x;
		topspeed=y;
		System.out.println("cc  ="+x);	
		System.out.println("wheels ="+y);	
		System.out.println("top ="+e);	
	}
}
class car extends vehical
{
	boolean airbag;
	String cartype;
	//int topspeed;
	public car(boolean a,String g,int x,int y,int e)
	{
		super(x,y,e);
		airbag=a;
		cartype=g;
		System.out.println("air bag ="+a);
		System.out.println("cartype ="+g);	
		
		
	}
	void showinformation()
	{
		super.showinformation();
		System.out.println("i am here in car");	
	}
}
class nexon extends car
{
	int grpundclearance;
	
	public nexon(int z,boolean a,String g,int x,int y,int e)
	{
		super(a,g,x,y,e);
		grpundclearance=z;
		System.out.println("grpundclearance="+z);
	}
	void showinformation()
	{
		super.showinformation();
		System.out.println("i am here in nexon");	
	}
}
public class Mulitlevelexample {

	public static void main(String[] args) {
		nexon c1=new nexon(20,true,"best",4,7,100);
		c1.showinformation();
		
		
	}

}
