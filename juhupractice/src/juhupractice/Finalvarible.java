package juhupractice;
class finalvar
{
	static int i;
	int a,b;
	finalvar(int x,int y)
	{
		a=x;
		b=y;
		
	}
}

public class Finalvarible {

	public static void main(String[] args) {
		final finalvar f1=new finalvar(12,15);
		finalvar f2=new finalvar(15,15);

	}

}
