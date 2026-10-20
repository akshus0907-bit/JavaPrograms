/*Create a thread using the Thread class

Create a class MyThread that extends Thread. Print numbers from 1 to 5 inside run(). Start the thread using start().*/


class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(i);
		}
	}
	
}

public class PrintOneToFiveNumber{
	public static void main(String[]args){
		Thread m=new  MyThread();
	
	
	m.start();
	}
}
	