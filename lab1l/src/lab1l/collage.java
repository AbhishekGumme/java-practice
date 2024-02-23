package lab1l;
class degree
{
	void getdegree()
	{
	
		System.out.println("i got a degree");
	}
}
class undergraduate extends degree
{
	void getdegree()
	{
		super.getdegree();
		System.out.println("i am undergraduate");
	}
	
}
class postgraduate extends undergraduate
{
	void getdegree()
	{
		super.getdegree();
		System.out.println("i am postgraduate");
	}
}

public class collage {

	public static void main(String[] args) {
		postgraduate p1=new postgraduate();
		p1.getdegree();

	}

}
