package assigment1s;

class Collage
{
	public
	int rno;
	float pr;
	String s;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public float getPr() {
		return pr;
	}
	public void setPr(float pr) {
		this.pr = pr;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	
}

public class cLASS {

	public static void main(String[] args) {
		Collage s1=new Collage();
		s1.setRno(01);
		//s1.getRno();
		System.out.println(s1.getRno());
		s1.setS("abhishek gumme");
		System.out.println(s1.getS());
		s1.setPr(86);
		System.out.println(s1.getPr());
		Collage s2=new Collage();
		s2.setRno(02);
		System.out.println(s2.getRno());
		s2.setS("prasad gumme");
		System.out.println(s2.getS());
		s2.setPr(80);
		System.out.println(s2.getPr());
		Collage s3=new Collage();
		s3.setRno(03);
		System.out.println(s3.getRno());
		s3.setS("swaraj gumme");
		System.out.println(s3.getS());
		s3.setPr(90);
		System.out.println(s3.getPr());
		if(s1.pr>s2.pr&&s1.pr>s3.pr)
		{
			System.out.println("maximum persentage is rno = 01");
		}
		else if(s2.pr>s1.pr&&s2.pr>s3.pr)
		{
			System.out.println("maximum persentage is rno = 02");
		}
		else if(s3.pr>s1.pr&&s3.pr>s2.pr)
		{
			System.out.println("maximum persentage is rno = 03");
		}
		

	}

}
