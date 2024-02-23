package day5;

public class employnew {
	private String ename;
	private  int eid;
	static int count=0;
	public void get()
	{
		System.out.println("name="+ename);
		System.out.println("employ id= "+eid);
		
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount() {
		count++;
	}
	
	

}
