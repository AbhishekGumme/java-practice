package day4;

public class hospital {
	private String name,type;
	private int beds;
	
	public void setinformation(String name,String type,int beds)
	{
		this.name=name;
		this.type=type;
		this.beds=beds;
	}
	public void get()
	{
		System.out.println("name of hospital = "+name+"  tyope of hospital ="+type+"  total beds ="+beds);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBeds() {
		return beds;
	}
	public void setBeds(int beds) {
		this.beds = beds;
	}
	

}
