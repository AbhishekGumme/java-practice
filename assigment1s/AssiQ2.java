package assigment1s;
import java.util.Scanner;

public class AssiQ2 {
	public static void main(String [] args)
	{
		int i,sum=0;
		Scanner in=new Scanner(System.in);
		int a[]=new int[5];
		a[0]=55;
		a[1]=50;
		a[2]=60;
		a[3]=70;
		a[4]=35;
		System.out.println("divisible by 10 is = ");
		for( i=0;i<5;i++)
		{ 
			if(a[i]%10==0)
			{
				
				System.out.println(a[i]);
				sum+=a[i];
			}
		
		}
		System.out.println("sum of number"+sum);
		
	}

}

/*out put
 divisible by 10 is = 
  50
  60
  70
sum of number180*/
