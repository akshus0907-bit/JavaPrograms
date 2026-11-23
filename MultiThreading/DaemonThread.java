//is daemon

class MyThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			 System.out.println(i);
		try{
			Thread.sleep(1000);
			}
		
		catch(Exception e){
			System.out.println(e);
		}
	  }
	}
}
public class DaemonThread{
	public static void main(String[]args){
	 MyThread t=new MyThread();
	 
	 t.setDaemon(true);
	 
	 System.out.println(t.isDaemon());
	}
}