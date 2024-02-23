package day14;

public class threadgroupexample {

	public static void main(String[] args) {
		ThreadGroup tgrp=new ThreadGroup("thread group");
		Thread t1=new Thread(tgrp,"one");
		Thread t2=new Thread(tgrp,"two");
		Thread t3=new Thread(tgrp,"three");
		Thread t4=new Thread(tgrp,"four");
		System.out.println(tgrp.activeCount());
		t1.start();
		t2.start();
		System.out.println(tgrp.activeCount());
		System.out.println(tgrp.getName());
		tgrp.list();
		tgrp.suspend();
		System.out.println(tgrp.activeCount());

	}

}
