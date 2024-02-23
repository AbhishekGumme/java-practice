package day4;

public class Arryobject {
	public static void main(String [] args)
	{
		hospital ha[]=new hospital[4];
		ha[0]=new hospital();
		ha[0].setName("gandhi hospital");
		ha[0].setType("multi special");
		ha[0].setBeds(500);
		ha[1]=new hospital();
		ha[1].setinformation("lokmanya hospital","super multi",1000);
		
		System.out.println(ha[0].getName());
		System.out.println(ha[0].getType());
		System.out.println(ha[0].getBeds());
		System.out.println(ha[1].getName());
		System.out.println(ha[1].getType());
		System.out.println(ha[1].getBeds());
		ha[2]=new hospital();
		ha[2].setinformation("virat hospital","multi great great",1500);
		ha[2].get();
		
	}

}
