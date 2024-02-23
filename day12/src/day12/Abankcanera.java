package day12;
class bank
{
	String name_bank;
	String bank_id;
	void set(String name_bank,String bank_id)
	{
		this.name_bank=name_bank;
		this.bank_id=bank_id;
	}
	void show()
	{
		System.out.println();
	}
	
}
class fixeddeposit extends bank
{
	String cust_name;
	int principal,years;
	double rate;
	double simpleinterst;
	double netamount;
	double interst;
	void set(String name_bank,String bank_id,int princiapl,int years,double rate)
	{
		super.set(name_bank, bank_id);
		this.principal=princiapl;
		this.years=years;
		this.rate=rate;
		simpleinterst=(principal*rate*years)/100;
		netamount=principal+simpleinterst;
		
	}
	public void show()
	{
		System.out.println("name of bank = "+name_bank);
		System.out.println("name of bank id = "+bank_id);
		System.out.println("years  = "+years);
		System.out.println("principal amount = "+principal);
		System.out.println("rate of amount = "+rate);
		System.out.println("simple interst = "+simpleinterst);
		System.out.println("net amount  = "+netamount);
	}
	
	
	
}

public class Abankcanera {

	public static void main(String[] args) {
		fixeddeposit a1=new fixeddeposit();
		a1.set("sbi", "14541",1500, 2, 12.0);
		a1.show();
		

	}

}
