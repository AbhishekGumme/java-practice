package innerclassexample;
class student
{
	//int a;
	
}

public class exceptionclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c1=Class.forName("innerclassexample.student");
		System.out.println(c1.getName());

	}

}
