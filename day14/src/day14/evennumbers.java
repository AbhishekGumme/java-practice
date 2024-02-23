package day14;

public class evennumbers extends Thread
{
	String threadname;
	int num;
	public evennumbers(int limit,String name)
	{
		super(name);
		this.threadname=name;
		num=limit;
	}
	public void run()
	{
		for(int i=0;i<num;i++)
		{
			if(i%2==0)
			{
				System.out.println("even numbers = "+i);
			}
		}
	}

	

}
