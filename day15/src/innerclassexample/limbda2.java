package innerclassexample;
interface calculate
{
	int calculateavg(int a,int b,int c);
}

public class limbda2 {

	public static void main(String[] args) {
		calculate ca1=(a,b,c)->(a+b+c);
		System.out.println("addition is ="+ca1.calculateavg(10,15 ,11));
		calculate ca2=(a,b,c)->{return((a+b+c)/3);};
		System.out.println("average is = "+ca2.calculateavg(25, 80, 100));
		calculate ca3=(a,b,c)->{
			if(a==0)
				a=100;
			return((a+b+c)/3);};
		System.out.println("average2 is = "+ca3.calculateavg(0, 80, 100));
	}

}
