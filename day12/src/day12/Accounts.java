package day12;
class loan
{
	String name;
	String cnum;
	void set(String name,String cnum)
	{
		//super.set(name,cnum);
		this.name=name;
		this.cnum=cnum;
		
	}
	void getinformation()
	{
		
		System.out.println("account interst = "+name+"-----"+cnum);
	}
	
	
}
class customer extends loan
{
	String number;
	String type;
	int amount,year;
	double rate;
	void set(String name,String cnum,String number,String type,int amount,int year)
	{
		super.set(name,cnum);
		this.number=number;
		this.type=type;
		this.amount=amount;
		this.year=year;
		int rate=5;
		double interst=amount*2*rate;
		double loanamo=amount+interst;
		System.out.println("total lloan ammount = "+loanamo);
		
	}
	void getinformation()
	{
		
		System.out.println("account interst = "+name+"-----"+cnum+"----"+number+"----"+type+"----"+amount+"---"+"---"+year);
	}
	
}

public class Accounts {

	public static void main(String[] args) {
		customer c1=new customer();
		c1.set("abui", "615488754", "4875124578", "current", 80000, 2);
		c1.getinformation();
		
		

	}

}
