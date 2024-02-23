package assigments3;
class car
{
	String brand;
	int value;
	public car(String brand,int value)
	{
		this.brand=brand;
		this.value=value;
	}
	public String getbrand()
	{
		return brand;
	}
	public void show()
	{
		System.out.println("car brand is = "+brand+" car value is = "+value);
	}
}
public class Assi3Q4 {

	public static void main(String[] args) {
		car c1=new car("ford",2000000);
		String brand=c1.getbrand();
		//System.out.println(brand);
		c1.show();
		}

}

/*out put:-
 * car brand is = ford car value is = 2000000
*/
