package day4;
import java.util.Scanner;
class collage
{
	String name,adress,grade;
	int capicity;
	boolean canteen;
	
	public void set(String name,String adress,String grade,int capicity,boolean canteen)
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

public class Program1 {

	public static void main(String[] args) {
		collage c1=new collage();
		collage c2=new collage();
		c1.set("shahu collage" ,"basweshwar chowck latur", "A", 120, true);
		c2.set("batu collage" ,"lonere", "A", 80, true);
		if(c1.capicity>c2.capicity)
		{
			c1.get();
		}
		else
		{
			c2.get();
		}
		
		

	}

}
