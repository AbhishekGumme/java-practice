package assigments3;
class rectangle
{
	int l,b;
	rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void show()
	{
		int area=l*b;
		System.out.println("area of rectangle = "+area);
	}
}

public class Assi3Q5 {

	public static void main(String[] args) {
		rectangle r1=new rectangle(12,25);
		rectangle r2=new rectangle(25,35);
		r1.show();
		r2.show();
		

	}

}
/*out put:-
 * area of rectangle = 300
area of rectangle = 875*/
