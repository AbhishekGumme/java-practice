//package day6;

class a
{
	int no1;
	void showno1()
	{
		System.out.println("first number is");
		System.out.println("no1="+no1);
	}
}
class b extends a
{
	int no2;
	void showno2()
	{
		System.out.println("seciund number is");
		System.out.println("no2="+no2);
	}
}
class c extends b
{
	int no3;
	void showno3()
	{
		System.out.println("third number is");
		System.out.println("no3="+no3);
	}
}


public class program1 {

	public static void main(String[] args) {
		c obj=new c();
		obj.no1=10;
		obj.no2=20;
		obj.no3=50;
		obj.showno1();
		obj.showno2();
		obj.showno3();
		
		

	}

}
