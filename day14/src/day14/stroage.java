package day14;

import java.util.LinkedList;
class asce {
	LinkedList<Integer> obj=new LinkedList<>();
	int stroagelimit =2;
	public void addMaterial() throws InterruptedException
	{
		int count=0;
		while(true)
		{                                         
			synchronized(this)
			{ 
		while(obj.size()==count)
			wait();
		System.out.println("producer adding stock");
		Thread.sleep(1000);
		}
	}
}
public void removematerial() throws InterruptedException
{
	int count=0;
	while(true)
	{
		synchronized (this) 
		{
			while(obj.size()==count)
				wait();
			System.out.println("producer adding stock");
			Thread.sleep(1000);
		}
	}
}
}
public class stroage
{
	public static void main(String [] args)throws InterruptedException
	{
		final asce s1=new asce();
		Thread t1=new Thread(new Runnable() 
		{
			@Override
			public void run() {
				try {
					 s1.addMaterial();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});
		Thread t2=new Thread(new Runnable()
				{
					@Override
					public void run() {
						try
						{
							s1.removematerial();
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
	
}
