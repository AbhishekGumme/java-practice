package lab1l;
class Spers
{
	public void show()
	{
		System.out.println("super class");
	}
}

 class xyz extends Spers{
	public void showinfo()
	{	super.show();
		System.out.println("sub class test");
	}
	
}

class Spersubmain {
	public static void main(String args[])
	{
//		spers t1=new spers();
		//t1.show();
		xyz t2=new xyz();
		//t2.show();
		t2.showinfo();
		
		
	}

}
