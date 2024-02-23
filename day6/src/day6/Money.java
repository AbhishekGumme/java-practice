package day6;
class grandperent
{
	int grandmoney;
}
class parent extends grandperent
{
	int parentmoney;
}
class child extends parent
{
	int childmoney;
	void showmoney()
	{
		System.out.println("grandmoneuy ="+grandmoney);
		System.out.println("parentmoneuy ="+parentmoney);
		System.out.println("childmoneuy ="+childmoney);
	}
	void totalmoney()
	{
		int totalmoney=grandmoney+parentmoney+childmoney;
		System.out.println("total money is = "+totalmoney);
	}
}

public class Money {
	public static void main(String [] args)
	{
		child salary=new child();
		salary.grandmoney=50000;
		salary.parentmoney=80000;
		salary.childmoney=80000;
		salary.showmoney();
		salary.totalmoney();
	}

}
