package day6;
class rbibank
{
	int accountnumber;
	String accounttype;
	void calculateinterst()
	{
		System.out.println("inside rbi");
	}
	
}
class icici extends rbibank
{
	String icici;
	double roi;
	public icici(double roi)
	{
		this.roi=roi;
		
	}
	void calculateinterst()
	{
		System.out.println("inside sbi");
	}
}
class hdfc extends rbibank
{
	String hdfc;
	double roi;
	public hdfc(double roi)
	{
		this.roi=roi;
		
	}
	void calculateinterst()
	{
		System.out.println("inside bob");
	}
}

public class Runtimereferance {

	public static void main(String[] args) {
		rbibank bankobj=new hdfc(8.6);
		bankobj.calculateinterst();
		bankobj=new icici(10.1);
		bankobj.calculateinterst();
//		rbibank bankobj1=new rbibank();
//		bankobj1.calculateinterst();
		

	}

}
