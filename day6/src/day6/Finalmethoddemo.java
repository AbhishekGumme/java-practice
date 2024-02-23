package day6;
class finalmethod
{
	String branchname;
	int intake;
	final public void admissionprocess()
	{
		System.out.println("inside adimission  process");
	}
	
}
class method extends finalmethod
{
	String adress;
	//final method will not be change once declared
	public void admissionprocess()
	{
		System.out.println("inside adimission  process 2");
	}
}

public class Finalmethoddemo {

	public static void main(String[] args) {
		
		method m1=new method();
		m1.admissionprocess();

	}

}
