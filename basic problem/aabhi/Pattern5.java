package aabhi;

public class Pattern5 {
	public static void main(String [] args)
	{
		int i,j,n=5;
		//System.out.println("enter anumber");
		//Scanner in=new Scanner(System.in);
		//n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				//System.out.print("*");
				{
					System.out.print("0");
					//System.out.println();
				}
				else
					System.out.print("*");
					
				
				//System.out.print(i+" ");
				//System.out.print(j%2+" ");
				//System.out.print(j%2+" ");
			}
			System.out.println();
		}
		 
	}

}
