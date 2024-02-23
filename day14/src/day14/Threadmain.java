package day14;
class numbers extends Thread
{
	int no;
	public numbers(String thradname,int n)
	{
		super(thradname);
		System.out.println("inside constructor");
		no=n;
		start();
	}
	public void run()
	{
		System.out.println("logic heare");
		for(int i=0;i<no;i++)
		{
			System.out.println(i);
		}
	}
}

public class Threadmain {

	public static void main(String[] args) {
		numbers thread1=new numbers("thread1",10);
		System.out.println("end of execution");
		//thread1.start();

	}

}
