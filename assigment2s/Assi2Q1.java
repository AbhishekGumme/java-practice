package assigment2s;

import java.util.Scanner;

public class Assi2Q1 {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		
		int sum=0,i;
		System.out.println("enter a number");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			sum+=a[i];
			
		}
		for(i=1;i<n;i++) 
		{
			System.out.println("[a"+i+"]="+a[i]);
		}
		System.out.println("sum of all numbers= "+sum);
		float avg;
		avg=sum/10;
		System.out.println("average of number= "+avg);
	}

}

/*out put:-
enter a number
23
34
56
23
12
45
67
54
23
34
[a1]=34
[a2]=56
[a3]=23
[a4]=12
[a5]=45
[a6]=67
[a7]=54
[a8]=23
[a9]=34
sum of all numbers= 371
average of number= 37.0*/
