package day7;
abstract class shape
{
	double area;
	abstract void calculatearea();
}
class circle extends shape
{
	int r;
	circle(int r)
	{
		this.r=r;
	}
	void calculatearea()
	{
	area=3.14*r*r;
	System.out.println("area of circle="+area);
	}
}
class rectangle extends shape
{
	int l,b;
	rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	void calculatearea()
	{
	area=l*b;
	System.out.println("area of rectangle ="+area);
	}
	
}
class triangle extends shape
{
	int b,h;
	triangle(int b,int h)
	{
		this.b=b;
		this.h=h;
	}
	void calculatearea()
	{
	area=0.5*b*h;
	System.out.println("area of triangle ="+area);
	}
	
}
public class Shapemain {

	public static void main(String[] args) {
		rectangle s1=new rectangle(12,16);
		s1.calculatearea();
		circle s2=new circle(25);
		s2.calculatearea();
		triangle s3=new triangle(20,45);
		s3.calculatearea();

	}

}
