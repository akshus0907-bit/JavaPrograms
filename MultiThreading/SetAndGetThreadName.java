/*Set and get thread names

Create two threads. Set their names to "FirstThread" and "SecondThread", then print each thread's name using getName().*/


class MyThread extends Thread{
	public void run(){
		System.out.println("thread name :"+getName());
	}
}

public class SetAndGetThreadName{
	public static void main(String[]args){
		
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		
		m1.setName("FirstThread");
		m2.setName("SecondThread");
		
		m1.start();
		m2.start();
	}
}