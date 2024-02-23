package day2;
import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//int n=in.nextInt();
		int i,j=0,k=0,l=0;
		int []a=new int[10];
		int []b=new int[10];
		int []c=new int[10];
		int []d=new int[10];
		for(i=0;i<10;i++)
		{
			a[i]=in.nextInt();
			
		}
		for(i=0;i<10;i++)
		{
			if(a[i]>=1&&a[i]<100)
			{
				b[j]=a[i];
				System.out.println("[b"+j+"]= "+b[j]);
				j++;
			}
			else if(a[i]>=101&&a[i]<500)
			{
				c[k]=a[i];
				System.out.println("[c"+k+"]= "+c[k]);
				k++;
			}
			else if(a[i]>500)
			{
				d[l]=a[i];
				System.out.println("[d"+l+"]= "+d[l]);
				l++;
			}
		}
		

	}

}
