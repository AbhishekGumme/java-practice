package lab1l;
class as
{
	int eno;
	String name;
	int salary;
	int hour;
	public void set(int eno,String name)
	{
		this.eno=eno;
		this.name=name;
		
	}
	public void show()
	{
		salary=120*hour;
		System.out.println("salary one = "+salary);
	}
}
class bs extends as
{
	int salary1;
}
class cs extends bs
{
	int salary3;
}

public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
