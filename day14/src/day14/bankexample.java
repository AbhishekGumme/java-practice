package day14;
class bank
{
	int balance;
	public bank(int amount)
	{
		balance=amount;
	}
	synchronized public void withdraamount(int amount)
	{
		if(balance>=amount)
		{
			balance=balance-amount;
		}
		else if(balance <amount)
		{
			System.out.println("money has been not debiated");
		}
		System.out.println("remaing balance is ="+balance);
	}
}
class metatm extends Thread
{
	int withamt;
	String name;
	bank b1;
	public metatm(int withamt, String name, bank b1) {
		super(name);
		this.withamt = withamt;
		this.name = name;
		this.b1 = b1;
		start();
	}
	public void run()
	{
		System.out.println("amount withdraw by = "+getName());
		System.out.println("name of bank is sbi");
		b1.withdraamount(withamt);
	}
	
	
}
class adgaon extends Thread
{
	int withamt;
	String name;
	bank b1;
	public adgaon(int withamt, String name, bank b1) {
		super(name);
		this.withamt = withamt;
		this.name = name;
		this.b1 = b1;
		start();
	}
	public void run()
	{
		System.out.println("amount withdraw by = "+getName());
		System.out.println("name of bank is sbi");
		b1.withdraamount(withamt);
	}
	
	
}

public class bankexample {

	public static void main(String[] args) {
		bank sbi=new bank(10000);
		metatm m1=new metatm(10000, "akash", sbi);
		adgaon a1=new adgaon(1000, "anish", sbi);
		

	}

}
