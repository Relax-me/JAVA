package 线程;

//import java.util.concurrent.Callable;
//import java.util.concurrent.FutureTask;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread1().start();
		new MyThread1().start();
//		new MyThread1().start();
//		new MyThread1().start();
//		new Thread(new MyThread2()).start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for(int i=1;i<=100;i++) {
//					System.out.println(Thread.currentThread().getName()+"--"+i);
//				}
//				System.out.println(Thread.currentThread().getName()+"结束");
//			}
//		}).start();
//		System.out.println(new Thread().getClass());
//		System.out.println(
//		new Thread(new FutureTask <String>(new Callable<String>() {
//
//			@Override
//			public String call() throws Exception {
//				// TODO Auto-generated method stub
//				System.out.println("123");
//				return "很好";
//			}
//		}),"线程0").getName());
		
	}
}
