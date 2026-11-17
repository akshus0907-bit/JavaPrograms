//Create a thread using Lambda that prints numbers from 1 to 10.

public class PrintNumberUsingThread {
	public static void main(String[]args){
		
		Runnable r=()->{
		for(int i=0;i<=10;i++){
			System.out.println(i);
		}
		};
		
		Thread t=new Thread(r);
		t.start();
	
	       
		
	}
	
	}
