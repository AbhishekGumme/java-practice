package aaa;

public class discgf {
	public static void main(String args[])
	
	{

	double  dis,amount,markedprice,s;
               
	markedprice=1000;

        dis=10;  			
	
	System.out.println("markedprice= "+markedprice);

	System.out.println("discount rate="+dis);
         
        s=100-dis;

	amount= (s*markedprice)/100;

	System.out.println("amount after discount="+amount);

	}

}
