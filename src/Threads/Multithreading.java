package Threads;

public class Multithreading  extends Thread {
	public void run() {
	   for (int i = 1; i <=10; i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
	class demo extends Thread{
		public void run() {
			for(int i=111;i<=120;i++) {
				System.out.println(i);
				try {
					Thread.sleep(4000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public class mainclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading s =new Multithreading();
		Thread t1 =new Thread(s);
		t1.start();
		
		demo d =new demo();
		Thread t2=new Thread(d);
		t2.start();
		
	}

}}
