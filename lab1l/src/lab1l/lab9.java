package lab1l;
import java.util.Scanner;
class worker
{
	static int rate=200;
	int hour;
	String name;
	double salary;
	public void gate(String name,int hour)
	{
		this.name=name;
		this.hour=hour;
	}
	public void calculate()
	{
		double salary=hour*rate;
		System.out.println("total salary of worker"+salary);
	}
}

public class lab9 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter dateials");
		String name=in.next();
		int hour=in.nextInt();
		worker w1=new worker();
		w1.gate(name, hour);
		w1.calculate();
		

	}

}
