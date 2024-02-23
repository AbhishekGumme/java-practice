package day4;
class acd
{
	private String name,adress,grade;
	private int capicity;
	private boolean canteen;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getCapicity() {
		return capicity;
	}
	public void setCapicity(int capicity) {
		this.capicity = capicity;
	}
	public boolean isCanteen() {
		return canteen;
	}
	public void setCanteen(boolean canteen) {
		this.canteen = canteen;
	}
//	public void set(String name,String adress,String grade,int capicity,boolean canteen)
//	{
//		this.name=name;
//		this.adress=adress;
//		this.grade=grade;
//		this.capicity=capicity;
//		this.canteen=canteen;
//	}
//	public void get()
//	{
//		System.out.println("information about our collage");
//		System.out.println(name+"----"+adress+"------"+grade+"------"+capicity+"-----"+canteen);
//	}
}
public class program3 {
	public static void main(String[] args) {
		acd c1=new acd();
		acd c2=new acd();
//		c1.set("shahu collage" ,"basweshwar chowck latur", "A", 120, true);
//		c2.set("batu collage" ,"lonere", "A", 80, true);
//		c1.get();
//		
//		if(c1.capicity>c2.capicity)
//		{
//			c1.get();
//		}
//		else
//		{
//			c2.get();
//		}
		c1.setAdress("met");
		System.out.println(c1.getAdress());
		c1.setName("met collage");
		System.out.println("collage nemae"+c1.getName());
		c1.setGrade("A");
		System.out.println("greade is = "+c1.getGrade());
		
		c1.setCapicity(120);
		System.out.println("capacity is = "+c1.getCapicity());
		c1.setCanteen(true);
		System.out.println(c1.isCanteen());
		
		c2.setCapicity(80);
		System.out.println(c2.getCapicity());
		if(c1.getCapicity()>c2.getCapicity())
		{
			System.out.println("get capacity = "+c1.getCapicity());
		}
		else
		{
			System.out.println(c2.getCapicity());
		}
		

	}
	

}
