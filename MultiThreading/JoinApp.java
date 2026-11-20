

class JoinApp{
	public static void main(String[]args){
		
        int a[]={10,20,30,50};
		
		int n=5;
		int sum=n*(10+50)/2;
		
		int sum2=0;
		for(int i=0;i<a.length;i++){
			sum2=sum2+a[i];
			
		}
		int missing=sum-sum2;
		
		System.out.println(missing);
		
		
    }
}







/*join() in thread



import java.util.*;
class MyThread extends Thread{
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
	}
	
	
}

public class JoinApp{
	public static void main(String[]args) throws Exception
	{
		MyThread t=new MyThread();
		
		
		t.start();
		
		t.join(1000);
	}	
}*/