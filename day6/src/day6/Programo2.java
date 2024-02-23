package day6;
  //single inhertance
class A
{
	int no1;
	void showno5()
	{
		System.out.println("first number is");
		System.out.println("no1="+no1);
	}
}
class B extends A
{
	int no2;
	void showno6()
	{
		System.out.println("seciund number is");
		System.out.println("no2="+no2);
	}
}
public class Programo2 {
	public static void main(String[] args) {
		B obj=new B();
		obj.no1=25;
		obj.no2=35;
		obj.showno5();
		obj.showno6();

	}

}
