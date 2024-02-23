package lab1l;



public class String1 {

	public static void main(String[] args) {
		String s1="cfsg";
		String s2="Cfsg";
		System.out.println("concate is = "+s1.concat(s2));
		System.out.println(s1+123);
		System.out.println(s2+12/2);
		System.out.println(10+20+s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.length());
		if(s1.equals(s2))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		System.out.println(s1.isEmpty());
		System.out.println("string arte equals or not");
		if(s1.equals(s2))
		{
			System.out.println("string are equals");
		}
		else
		{
			System.out.println("string are not equals");
		}
		System.out.println("equal ignore case upper later ignore ");
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("string are equals");
		}
		else
		{
			System.out.println("string are not equals");
		}
		System.out.println("string are empty check");
		if(s1.equals(" "))
		{
			System.out.println("string are empty");
		}
		else
		{
			System.out.println("string are not empty");
		}
		System.out.println("string compersion");
		System.out.println("cpmare are = "+s1.compareTo(s2));
		System.out.println("cpmare toignore are = "+s1.compareToIgnoreCase(s2));
		System.out.println();
		String s3="asd";
		String s4="";
		System.out.println("cpmare are = "+s3.compareTo(s4));
		//System.out.println(String join(";",s1,s2));
		String s5="this is demo";
		System.out.println(s5.subSequence(3, 6));
		System.out.println(s5.substring(3));
		

	}

	

}
