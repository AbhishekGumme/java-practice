package aabhi;

public class PtreenSpace {
	public static void main(String [] args)
	{
		int i,n=5,space;
		//System.out.println("enter anumber");
		//Scanner in=new Scanner(System.in);
		//n=in.nextInt();
		for(space=1,i=5;space<=n&&i>=1;space++,i--)
		{
			for(int s=1;s<=space;s++)
			{
				System.out.print(" ");
				//System.out.print(j+" ");
				//System.out.print(i+" ");
				//System.out.print(j%2+" ");
				//System.out.print(j%2+" ");
				//System.out.print(ans+" ");
				//ans++;
				
			}
			for(int j=1;j<=i;j++)
				System.out.print("x ");
			System.out.println();
			
			
			
		}
		 
	}

}
