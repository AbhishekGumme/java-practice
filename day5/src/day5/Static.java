package day5;

public class Static {
	private String stuname;
	static String collname="met bkc";
	private char div;
	private int rollno;
	
	public void get()
	{
		System.out.println(rollno+" student name ="+stuname+"---------collage name= "+collname+"----divsion = "+div);
		
		
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public static String getCollname() {
		return collname;
	}
	public static void setCollname(String collname) {
		Static.collname = collname;
	}
	public char getDiv() {
		return div;
	}
	public void setDiv(char div) {
		this.div = div;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	

}
