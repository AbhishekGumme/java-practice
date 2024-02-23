package assigments3;
class student
{
	int rno;
	String name;
	int count=0;
	student()
	{
		rno=01;
		name="abhi";
		count++;
	}
	student(int rno,String name)
		{
			this.rno=rno;
			this.name=name;
			count++;
		}
	public void show()
	{
		System.out.println("informaion student roll no ="+rno+"    --   "+name);
	}
}
	


public class Assi3Q1 {

	public static void main(String[] args) {
		student s1=new student();
		student s2=new student(02,"swaraj");
		s1.show();
		s2.show();
		System.out.println("count is"+count);
		

	}

}
