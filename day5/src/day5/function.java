package day5;
class addnumber{
	int a;
	int b;
	public addnumber() 
	{
		a=0;b=0;
	}
	public void addnumber(int x,int y)
	{
		
		int ans=x+y;
		System.out.println("addition of integer ="+ans);
		
	}
	public void addnumber(double x,double y)
	{
		double ans=x+y;
		System.out.println("addition of double ="+ans);
	}
}

public class function {

	public static void main(String[] args) {
		addnumber num=new addnumber();
		num.addnumber(10, 20);
		num.addnumber(1.5, 2.7);
	}

}
