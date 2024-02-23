package assigment1s;

public class AssiQ6 {
	public class StringLengthWithoutLibrary {

		  public static void main(String[] args) {
		    String str = "Hello, world!";
		    int length = findLength(str);
		    System.out.println("The length of the string \"" + str + "\" is: " + length);
		  }

		  public static int findLength(String str) {
		    int count = 0;
		    for (char c : str.toCharArray()) {
		      count++;
		    }
		    return count;
		  }

		}
}
