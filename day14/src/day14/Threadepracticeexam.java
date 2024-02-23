package day14;
class addthread1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		int sum=0;
		for(int i=0;i<10;i++)
		{
			sum=sum+i;
		}
			System.out.println("sumition is ="+sum+"-----"+Thread.currentThread().getName());
	}
	
}
class multithread1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		int res=1;
		for(int i=0;i<10;i++)
		{
			res=res*i;
			res++;
		}
			System.out.println("multiplication is ="+res+"-----"+Thread.currentThread().getName());
	}
	
}

public class Threadepracticeexam {

	public static void main(String[] args) {
		addthread1 at=new addthread1();
		at.setName("add thread");
		multithread1 mt=new multithread1();
		mt.setName("multi thread");
		at.start();
		mt.start();
		System.out.println(Thread.currentThread().getName());
		
		//anonoumes inner class
		Thread evenadd=new Thread() {
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
				for(int i=0;i<10;i++)
				{
					if(i%2==0)
					{
						System.out.println(i);
					}
				}
					
				}
					System.out.println("multiplication is ="+res+"-----"+Thread.currentThread().getName());
			}};
		
		}

}
