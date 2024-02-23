package day14;

public class threadmain4 {

	public static void main(String[] args) {
		evennumbers eventhread=new evennumbers(20,"eventhr");
		oddnumbers oddthraed=new oddnumbers(20,"oddthr");
		System.out.println("i am here");
		eventhread.start();
		oddthraed.start();
		System.out.println("thhread name is ="+eventhread.getName());
	}

}
