package day14;
class abc implements Runnable
{
	Thread t1;
	public abc(String name)
	{
		System.out.println("i am inside main");
		t1=new Thread(this,name);
		t1.start();
		
	}
	@Override
	public void run() {
		System.out.println("i am inside run");
		
	}
}

public class runnableexam {

	public static void main(String[] args) {
		System.out.println("i am in main");
		abc rt1=new abc("runnable1 thread");
		//abc rt2=new abc("runnable2 thread");
	
		System.out.println("last statement");
		

	}

}
