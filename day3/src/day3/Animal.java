package day3;
class ani
{
	String vo;
	public void setvoice(String v)
	{
		vo=v;
	}
	public void getvoice()
	{
		System.out.println("voice = "+vo);
	}
}

public class Animal {
	public static void main(String [] args)
	{
		ani cat=new ani();
		ani dog=new ani();
		cat.setvoice("maumau");
		cat.getvoice();
		dog.setvoice("bhaubhau");
		dog.getvoice();
	}

}
