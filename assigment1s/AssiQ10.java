package assigment1s;
import java.util.Scanner;
public class AssiQ10 {
	public static void main(String [] args)
	{
		int a[],i;
		a=new int[5];
		int count=0;
		System.out.println("enter a number");
		Scanner in=new Scanner(System.in);
		for(i=0;i<=4;i++) {
			a[i]=in.nextInt();
			
		}
		for(i=0;i<=4;i++)
		{
			if(a[i]%2==1)
			{
				a[i]=a[i]*a[i]*a[i];
				count++;
			}
			System.out.println("arr["+i+"] = "+a[i]);
		}
		System.out.println("total count of odd digit replaced by = "+count);
	}
	
}

/*out put:-
enter a number
2
5
7
5
4
arr[0] = 2
arr[1] = 125
arr[2] = 343
arr[3] = 125
arr[4] = 4
total count of odd digit replaced by = 3
*/