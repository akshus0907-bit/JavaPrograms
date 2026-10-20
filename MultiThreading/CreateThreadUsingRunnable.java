/*Create a thread using Runnable

Create a class MyTask that implements Runnable. Print "Thread is running" five times.

Concept: Runnable interface.*/


class MyThread implements Runnable{
	
	public void run(){
	 for(int i=1;i<=5;i++){
		 System.out.println("Thread is running");
	 }
	}
}

public class CreateThreadUsingRunnable{
	
	public static void main(String[]args){
		
		MyThread m=new MyThread();
		
		Thread t=new Thread(m);
		
		t.run();
	}
}