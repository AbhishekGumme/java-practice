package day3;

public class programclass10 {
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
		programclass10 maruti=new programclass10();
		maruti.setinformation(4,"yellow",123,1500);
		maruti.getinformation();
		System.out.println("new car scoda is aussume");
		programclass10 scoda=new programclass10();
		scoda.setinformation(6,"red",777,45000);
		scoda.getinformation();
		System.out.println("new car ");
		programclass10 farari=new programclass10();
		farari.seatingcapicity=8;
		farari.color="white";
		farari.chesenumber=12589;
		farari.cc=4578754;
		System.out.println(farari.seatingcapicity+" "+farari.color+" "+farari.chesenumber+" "+farari.cc);
		
		
	}

}
