package lab1l;
class student
{
	int rno,mark;
	String name;
	void set(int rno,int mark,String name)
	{
		this.rno=rno;
		this.mark=mark;
		this.name=name;
	}
	void get()
	{
		System.out.println(rno+"  =  "+mark+"  = "+name);
	}
}

public class lab5 {
	 public static void main(String [] args)
	 {
		 student s1=new student();
		 student s2=new student();
		 s1.set(01,80,"abhi");
		 s1.get();	
		 s2.set(02,80,"prassa");
		 s2.get();
	 }

}
