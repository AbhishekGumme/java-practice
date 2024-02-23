package day4;
class school
{
	String name,adress,grade;
	int capicity;
	boolean canteen;
	
	school(String name,String adress,String grade,int capicity,boolean canteen)
	{
		this.name=name;
		this.adress=adress;
		this.grade=grade;
		this.capicity=capicity;
		this.canteen=canteen;
	}
	public void get()
	{
		System.out.println("information about our collage");
		System.out.println(name+"----"+adress+"------"+grade+"------"+capicity+"-----"+canteen);
	}
}

public class program2 {
	public static void main(String[] args) {
		school s1=new school("shahu collage" ,"basweshwar chowck latur", "A", 120, true);
		school s2=new school("d batu" ,"lonere", "civil", 120, true);
		//c1.set("shahu collage" ,"basweshwar chowck latur", "A", 120, true);
		s1.get();
		s2.get();
		
		

	}

}
