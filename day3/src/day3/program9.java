package day3;

public class program9 {
	private int seatingcapicity;
	private String color;
	private int chesenumber;
	private int cc;
	public void setinformation(int sc,String c,int cn,int enginecapicity)
	{
		seatingcapicity=sc;
		color=c;
		chesenumber=cn;
		cc=enginecapicity;
	}
	public void getinformation()
	{
		
		System.out.println("seating capicity = "+seatingcapicity);
		System.out.println("color is  = "+color);
		System.out.println("chese bnumber is  = "+chesenumber);
		System.out.println("engine capicity = "+cc);
	}
	public static void main(String [] args)
	{
		program9 maruti=new program9();
		maruti.setinformation(4,"yellow",123,1500);
		maruti.getinformation();
		System.out.println("new car scoda is aussume");
		program9 scoda=new program9();
		scoda.setinformation(6,"red",777,45000);
		scoda.getinformation();
	}

}
