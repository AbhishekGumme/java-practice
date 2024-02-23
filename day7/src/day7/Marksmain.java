package day7;
import java.util.Scanner;

public class Marksmain {

	public static void main(String[] args) {
		int rno;
		String name;
		int m1[]=new int[5];
		int m2[]=new int[5];
		int m3[]=new int[5];
		double avg;
		//markdmain arr[]=new markdmain[];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter student details");
			System.out.println("enter roll no");
			rno=in.nextInt();
			System.out.println("enter name");
			name=in.next();
			m1[i]=in.nextInt();
			m2[i]=in.nextInt();
			m3[i]=in.nextInt();
		}
		System.out.println("show result");
		for(int i=0;i<5;i++)
		{
			
			avg=(m1[i]+m2[i]+m3[i])/3;
			//System.out.println("Name is = "+name);
			//System.out.println("roll numbe = "+rno);
			System.out.println("average is "+avg);
			if(avg>75) {
				System.out.println("it is a excellent ");
			}
			else if(avg<=75&&avg>60)
			{
				System.out.println("it is super");
			}
			else if(avg<=60&&avg>40)
			{
				System.out.println("it is moderate");
			}
			else if(avg<=40)
			{
				System.out.println("it is a poor");
			}
		}
		

	}

}

/*OUT PUT :-
 enter student details
enter roll no
01
enter name
ABHISHEK
80
70
90
enter student details
enter roll no
02
enter name
PRASAD
80
70
80
enter student details
enter roll no
03
enter name
SWARAJ
90
80
85
enter student details
enter roll no
04
enter name
SEHAWAG
80
90
80
enter student details
enter roll no
05
enter name
SACHIN
80
70
70
show result
average is 80.0
it is a excellent 
average is 76.0
it is a excellent 
average is 85.0
it is a excellent 
average is 83.0
it is a excellent 
average is 73.0
it is super*/
