package day6;
class bank
{
	int accountnumber;
	String accounttype;
	
}
class sbi extends bank
{
	String tfsc;
	double roi;
	public sbi(double roi)
	{
		this.roi=roi;
		
	}
	void calculateinterst()
	{
		System.out.println("inside sbi");
	}
}
class bob extends bank
{
	String ifsc;
	double roi;
	public bob(double roi)
	{
		this.roi=roi;
		
	}
	void calculateinterst()
	{
		System.out.println("inside bob");
	}
}


public class Hirical {

	public static void main(String[] args) {
		sbi panchavati=new sbi(8.6);
		bob adagaon=new bob(7.6);
		panchavati.calculateinterst();
		adagaon.calculateinterst();
				
		
	}

}
