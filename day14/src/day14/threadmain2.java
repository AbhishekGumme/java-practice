package day14;

public class threadmain2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread("thread one");
		System.out.println("thhread name is ="+t1.getName());
		System.out.println("thhread prority is ="+t1.getPriority());
		System.out.println("thhread state is ="+t1.getState());
		t1.start();
		System.out.println("thhread state is ="+t1.getState());
		t1.setPriority(10);
		System.out.println("thhread priority is ="+t1.getPriority());
		t1.sleep(1000);
		System.out.println("thread state is = "+t1.getState());
		
	}

}
