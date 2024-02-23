package assigment2s;
class employ
{
	public
	int rno;
	String s;	
	float per;
	
	employ(int a,String st,float pr)
	{
		rno=a;
		s=st;
		per=pr;
	}
	
	void show() {
		System.out.println("roll no="+rno);
		System.out.println("name = "+s);
		System.out.println("persentage = "+per);
		
	}
	float comp()
	{
		return per;
	}
}

public class Assi2Q6 {
	public static void main(String [] args)
	{
		employ a1=new employ(01,"abhi",86);
		a1.show();
		employ a2=new employ(02,"prasad",80);
		a2.show();
//		employ a3=new employ(01,"swaraj",90);
//		a3.show();
	
	
	if(a1.comp()>a2.comp())
	{
		System.out.println("maximum persentage is abhi");
		a1.show();
		//System.out.println("maximum persentage is abhi");
	}
	else if(a1.comp()<a2.comp())
	{
		System.out.println("maximum persentage is prasad");
		a2.show();
		//System.out.println("maximum persentage is prasad");

	}
	}
	
}

/*out put:-
roll no=1
name = abhi
persentage = 86.0
roll no=2
name = prasad
persentage = 80.0
maximum persentage is abhi
roll no=1
name = abhi
persentage = 86.0*/
