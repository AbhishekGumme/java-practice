package aaa;
import java.util.Scanner;

public class discuser {
	static int findFinalPrice(int price, int discount) {
        return (price * discount) / 100;
    }

	
//	discount()
//	{
//		double  dis,amount,markedprice,s;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter markedprice ");	
//	    markedprice=sc.nextDouble();
//	    System.out.println("enter discount percentage ");	
//	    dis=sc.nextDouble();			
//	    s=100-dis;
//	    amount= (s*markedprice)/100;
//	    System.out.println("amount after discount="+amount);
//	}
	public static void main(String args[])
	{
 
//		double  dis,amount,markedprice,s;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter markedprice ");	
//	    markedprice=sc.nextDouble();
//	    System.out.println("enter discount percentage ");	
//	    dis=sc.nextDouble();			
//	    s=100-dis;
//	    amount= (s*markedprice)/100;
//	    System.out.println("amount after discount="+amount);
//		discuser e1=new discuser();
//		e1.discount();
		

	    {
	        int price;
	        int discount;

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter price of the product :");
	        price = sc.nextInt();

	        System.out.println("Enter Discount of the product :");
	        discount = sc.nextInt();

	        System.out.println("Final price is " + findFinalPrice(price, discount));
 
	}
	    
	}

}
