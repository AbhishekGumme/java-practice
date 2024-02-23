package day14;

public class adress {
	String city;
	int pin;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

	public adress(String city, int pin) {
		
		this.city = city;
		this.pin = pin;
	}
//	public void getinformation()
//	{
//		System.out.println("information is ="+city+"------"+pin);
//	}
	

}
