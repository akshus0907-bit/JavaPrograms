//start and run difference

class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
public class StartAndRun{
	public static void main(String[]args){
		MyThread t=new MyThread();
		
		t.run();
		t.start();
		System.out.println(t.isAlive());
	}
}