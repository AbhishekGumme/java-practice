package day14;

public class oddnumbers extends Thread
{
	String thredname;
	int num;
	public oddnumbers(int limit,String tname)
	{
		super(tname);
		this.thredname=tname;
		num=limit;
	}
	public void run()
	{
		try
		{
			sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<num;i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd numbers = "+i);
			}
		}
	}
}
