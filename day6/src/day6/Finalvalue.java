package day6;
class finals
{
	int age;
	String name;
	final String pan;
	public finals()
	{
		pan="abj123455";
		age=0;
		name="";
		
	}
	void setinformation(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	void show()
	{
		System.out.println("pan number = "+pan);
		System.out.println("age is = "+age);
		System.out.println("name is = "+name);
	}
	
}

public class Finalvalue {

	public static void main(String[] args) {
		finals obj=new finals();
		obj.setinformation(23,"abhjshek");
		obj.show();
		// final variable will not be change once declared
		//obj.pan="bgadcs";

	}

}
