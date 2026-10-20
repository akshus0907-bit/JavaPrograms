/*Odd and even numbers

Create two threads. One prints odd numbers from 1 to 9, and the other prints even numbers from 2 to 10.

Expected format:
Odd Thread: 1 3 5 7 9
Even Thread: 2 4 6 8 10*/

class EvenThread extends Thread{
	public  void run(){
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println("\t"+i);
			}
		}
	
	}
}

class OddThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			if(i%2!=0){
				System.out.println("\t"+i);
			}
		}
	}
}


public class EvenOddThread{
	public static void main(String[]args){
		EvenThread e=new EvenThread();
		OddThread o=new OddThread();
		
		e.start();
		o.start();
	}
}