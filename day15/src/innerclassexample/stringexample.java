package innerclassexample;
class tostringe
{
	String name;
	int no;
	public tostringe(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getNo() {
//		return no;
//	}
//	public void setNo(int no) {
//		this.no = no;
//	}
	public String toString() {
		return this.name+"    "+this.no;
	}
	
}

public class stringexample {

	public static void main(String[] args) {
		tostringe s1=new tostringe("abhi",10);
		System.out.println(s1);
	}

}
