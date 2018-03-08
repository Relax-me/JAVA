package Ïß³Ì;


public class MyThread2 implements Runnable{

	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
		System.out.println(Thread.currentThread().getName()+"½áÊø");
	}

}
