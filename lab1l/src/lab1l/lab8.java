package lab1l;
class person
{
	int id;
	String name,nation,dob,doi,doe;
	char gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDos() {
		return doi;
	}
	public void setDos(String dos) {
		this.doi = dos;
	}
	public String getDoe() {
		return doe;
	}
	public void setDoe(String doe) {
		this.doe = doe;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void set(int id,String name,String dob,String nation,String doi,String doe,char gender)
	{
		this.name=name;
		this.id=id;
		this.dob=dob;
		this.nation=nation;
		this.doi=doi;
		this.gender=gender;
		this.doe=doe;
		
	}
	public void show() {
		System.out.println(name+"  "+id+"   "+dob+"  "+nation+"   "+doi+"   "+doe+"    "+gender);
	}
	
	
	
}
public class lab8 {

	public static void main(String[] args) {
		person p1=new person();
		//p1.set(01, "abhi", "10-09-2000", "indian", "12-1-2010", "12-12-2020", 'm');
		//p1.show();
		person a[]=new person[5];
		a[0]=new person();
		a[1]=new person();
		a[2]=new person();
		a[0].set(01, "abhi", "10-09-2000", "indian", "12-1-2010", "12-12-2020", 'm');
		a[1].set(02, "ggrf", "15-12-2000", "indian", "22-5-2010", "10-10-2020", 'f');		
		a[2].set(03, "ggfdh", "10-09-2000", "indian", "15-11-2010", "2-2-2020", 'm');
		a[0].show();
		a[1].show();
		a[2].show();
	}

}
