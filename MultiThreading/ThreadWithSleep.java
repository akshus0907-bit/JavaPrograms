/*we want to create thread and start thread and maintain 
1 second waiting period in every iteration of thread */

class MyThread extends Thread{
	public void run(){
	try{
		
			for(int i=0;i<10;i++){
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		}
	
	
	catch(Exception e){
		System.out.println(e);
	}
}
}

class MyThread2 extends Thread{
	public void run(){
	try{
		
			for(int i=0;i<40;i++){
				
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
	
	catch(Exception e){
		System.out.println(e);
	}
}
}


public class ThreadWithSleep{
	public static void main(String[]args){
		MyThread t=new MyThread();
		t.start();
		
		
		MyThread2 t2=new MyThread2();
		t2.start();
	}
}