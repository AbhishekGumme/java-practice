package day14;

public class employ {
	int employnumber;
	adress add;
	public employ(int employnumber, adress add) {
		super();
		this.employnumber = employnumber;
		this.add = add;
	}
	public int getEmploynumber() {
		return employnumber;
	}
	public void setEmploynumber(int employnumber) {
		this.employnumber = employnumber;
	}
	public adress getAdd() {
		return add;
	}
	public void setAdd(adress add) {
		this.add = add;
	}
	public void getinformation()
	{
		System.out.println("information is ="+employnumber+"------"+add);
	}

}
