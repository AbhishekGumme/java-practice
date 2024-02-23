package aabhi;

public class Pattern2 {
	public static void main(String [] args)
	{
		int i,j,n=5;
		//System.out.println("enter anumber");
		//Scanner in=new Scanner(System.in);
		//n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				//System.out.print("*");
				System.out.print(j+" ");
				//System.out.print(i+" ");
				//System.out.print(j%2+" ");
				//System.out.print(j%2+" ");
			}
			System.out.println();
		}
		 
	}      

}
