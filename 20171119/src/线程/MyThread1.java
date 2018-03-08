package Ïß³Ì;

public class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
		System.out.println(Thread.currentThread().getName()+"½áÊø");
	}
}
