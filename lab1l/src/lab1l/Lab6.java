package lab1l;

class empinfo
{
	int id,salary;
	String name;
	public void set(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void get()
	{
		System.out.println(id+" = "+name+"  =  "+salary);
	}
}
class emppersonal
{
	String bdate;
	String con,adharno;
	public void set(String bdate,String con,String adharno)
	{
		this.bdate=bdate;
		this.con=con;
		this.adharno=adharno;
	}
	public void get()
	{
		System.out.println(bdate+"  = "+con+" "+ adharno);
		
	}
}

public class Lab6 {
	public static void main(String [] args)
	{
		empinfo e=new empinfo();
		emppersonal p=new emppersonal();
		e.set(01,"abhi",80000);
		e.get();
		p.set("10.09.2000","9010147810","7455234220");
		p.get();
		
		
	}
	

}
