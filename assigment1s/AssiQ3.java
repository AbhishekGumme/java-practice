package assigment1s;
import java.util.Scanner;

public class AssiQ3 {

	public static void main(String[] args) {
		int  i=0,j=1,fib=0,sum=0,num;
		Scanner in =new Scanner(System.in);
		System.out.println("enter a number");
		num=in.nextInt();
		
			for(int a=0;a<=num;a++)
			{
				i=j;
				j=fib;
				fib=i+j;
				sum=sum+fib;
				
			}
			System.out.println("sum of febonachi series a number = "+sum);
			
		}

}

/*output:-
enter a number
25
sum of febonachi series a number = 317810*/
