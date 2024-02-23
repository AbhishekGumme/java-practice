package lab1l;
class studen
{
	String name,s;
	studen(String name)
	{
		this.name=name;
	}
	studen()
	{
		s="unkown";
	}
	public void show()
	{
		System.out.println("name of student = "+name);
	}
}

public class Studentclass {
	public static void main(String [] args)
	{
	studen s1=new studen("abhishek");
	studen s2=new studen();
	s1.show();
	s2.show();
	}
	
	

}
