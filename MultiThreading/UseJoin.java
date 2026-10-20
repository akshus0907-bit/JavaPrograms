//print 1 to 5 and after 6 to 10 using join

class FirstThread extends Thread{
	
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(+i);
		}
		System.out.println("First thred complete");
	}
	
	
}



class SecondThread extends Thread{
	public void run(){
	for(int i=6;i<=10;i++){
		System.out.println(i);
	}
	}
}

public class UseJoin{
	public static void main(String[]args) throws Exception{
		
		FirstThread t1=new FirstThread();
		SecondThread t2=new SecondThread();
		
		t1.start();
		t1.join();
		
		
		t2.start();
		t2.join();
		
		
		
	}
}