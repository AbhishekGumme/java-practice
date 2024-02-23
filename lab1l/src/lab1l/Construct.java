package lab1l;

class addamount
{
	int amount=0;
	int sum=0;
	addamount()
	{
		amount=50;
		System.out.println("amount is = "+amount);
	}
	addamount(int amount)
	{
		amount+=20;
		System.out.println("amount is = "+amount);
	}
}

public class Construct {

	public static void main(String[] args) {
		
		addamount a1=new addamount();
		addamount a2=new addamount(50);
	}

}
