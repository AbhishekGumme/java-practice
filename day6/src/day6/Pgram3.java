package day6;
class grandperents
{
	int grandmoney;
	void showmoney()
	{
		System.out.println("grandmoneuy ="+grandmoney);
		
	}
}
class parents extends grandperents
{
	int parentmoney;
	void showmoney()
	{
		super.showmoney();
		System.out.println("parentmoneuy ="+parentmoney);
	}
}
class childs extends parents
{
	
	int childmoney;
	void showmoney()
	{
		super.showmoney();
		System.out.println("childmoneuy ="+childmoney);
	}
	void totalmoney()
	{
		int totalmoney=grandmoney+parentmoney+childmoney;
		System.out.println("total money is = "+totalmoney);
	}
}


public class Pgram3 {

	public static void main(String[] args) {
		child salary=new child();
		salary.grandmoney=50000;
		salary.parentmoney=80000;
		salary.childmoney=80000;
		salary.showmoney();
		salary.totalmoney();
		
	}

}
