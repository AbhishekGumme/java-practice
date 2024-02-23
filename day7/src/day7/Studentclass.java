package day7;
import java.util.Scanner;
class student
{
	String name;
	int rono;
	char gender;
	//int a[];
	student(String name,int rono,char gender)
	{
		this.name=name;
		this.rono=rono;
		this.gender=gender;
	}

	void getinformation()
	{
		System.out.println("nmae is ="+name+  "  roll numer ="+rono+  "  gender is ="+gender);
	}
}

public class Studentclass {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter count student ");
		int countstudent=Integer.parseInt(in.nextLine());
		student arr[]=new student[countstudent];
		//arr[0]=new student();
		//arr[1]=new student();
		String name;
		int rono;
		char gender;
		
		for(int i=0;i<countstudent;i++)
		{
			System.out.println("enter student name");
			name=in.next();
			System.out.println("enter roll name");
			rono=in.nextInt();
			System.out.println("enter gender");
			gender=in.next().charAt(0);
			arr[i]= new student(name,rono,gender);
			
		}
		int count=0;
		for(int i=0;i<countstudent;i++)
		{
			if(arr[i].gender=='F')
			{
				
				arr[i].getinformation();
				count++;
			}
		}
		System.out.println("total count is = "+count);
		
		
		

	}

}
