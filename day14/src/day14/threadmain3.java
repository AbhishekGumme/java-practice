package day14;
class shownumber extends Thread
{
	int no;
	String name;
	public shownumber(int no, String name) {
		super(name);
		this.no = no;
		this.name = name;
	}
	public void run()
	{
		for(int i=0;i<no;i++)
		{
			System.out.println("current thread is = "+getName()+"---"+i);
		}
	}
	
}

public class threadmain3 {

	public static void main(String[] args) throws InterruptedException {
		shownumber thread1=new shownumber(9,"thread1");
		shownumber thread2=new shownumber(10,"thread2");
		shownumber thread3=new shownumber(9,"thread3");
		shownumber thread4=new shownumber(9,"thread4");
		thread3.setPriority(10);
		thread1.start();
		thread2.sleep(10000);
		thread2.start();
		//thread3.setPriority(10);
		//thread3.start();
		thread3.start();

	}

}
