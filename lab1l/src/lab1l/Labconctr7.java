package lab1l;
class abc
{
	int id,salary;
	String name,bdate,con,adn;
	
	abc(int id,String name,int salary,String bdate,String con,String adn)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.bdate=bdate;
		this.con=con;
		this.adn=adn;
		
	}
	void show()
	{
		System.out.println(id+" = "+name+" salary=  "+salary+"  barthday= "+bdate+"  contact= "+con+" adhar= "+adn);
	}
	
	
}

public class Labconctr7 {
	public static void main(String [] args)
	{
		abc a=new abc(1,"abhishek",80000,"10.09.2000","9014528753","1478521475");
		a.show();
		
	}

}
