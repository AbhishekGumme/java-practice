package lab1l;
class news
{
	private int a,b;
	news(int x,int y)
	{
		a=x;
		b=y;
		
	}
	void show()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	void add(news n1,news n2)
	{
		a  =  n1.a+n2.a;
		b  =   n1.b+n2.b;
		}
}

public class lab7 {

	public static void main(String[] args) {
		news n1=new news(10,20);
		n1.show();
		news n2=new news(100,23);
		n2.show();
		news n3=new news(0,0);
		n3.add(n1,n2);
		n3.show();
		
	}

}
