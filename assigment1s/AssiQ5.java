package assigment1s;
import java.util.Scanner;
public class AssiQ5 {
	public static void main(String [] args)
	{
		
//		Scanner in=new Scanner(System.in);
//  	    //int [] a=new int[5];
//  	    int i;
//		System.out.println("enter a number");
		int a[],i;
		a=new int[5];
		int count=0;
		System.out.println("enter a number");
		Scanner in=new Scanner(System.in);
		for(i=0;i<=4;i++) {
			a[i]=in.nextInt();
			
		}
		
		//int [] a = {1,2,5,3,5,6,2};
		System.out.println("enter duplicate number");
		for( i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				//a[i]=in.nextInt();
				if(a[i]==a[j])
				{
					System.out.println("occurance ="+a[i]);
					
				}
				
			}
		}
		
	}
}

/*out put:-

enter duplicate number
occurance =2
occurance =5
*/

