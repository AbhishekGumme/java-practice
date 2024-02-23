package innerclassexample;
@FunctionalInterface
interface number
{
	int addnumber1(int a,int b);
}

public class limbdaexpresion {

	public static void main(String[] args) {
		number n1=(a,b)->(a+b);
		System.out.println("addition is = "+n1.addnumber1(15, 20));
		number n2=(a,b)->(a-b);
		System.out.println("sustraction is = "+n2.addnumber1(25, 21));
		number n3=(a,b)->(a*b);
		System.out.println("multiplicatio is = "+n3.addnumber1(14, 7));
		

	}

}
