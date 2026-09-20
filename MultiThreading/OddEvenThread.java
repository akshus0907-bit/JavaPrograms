/*Question 11: Write a Java program where two threads print odd and even numbers separately.

Create two threads. One prints odd numbers and another prints even numbers from 1 to N.
Asked In Practice Assignment
Input:
Enter limit: 10

Output:
Odd Thread: 1 3 5 7 9
Even Thread: 2 4 6 8 10

Explanation:
Two separate threads execute independently to print different number ranges. First thread checks i%2!=0 for odd, second checks i%2==0 for even. Threads run concurrently, allowing parallel number processing. Output order may vary due to thread scheduling, but both complete independent tasks.*/

import java.util.*;
class EvenThread extends Thread{
	int limit;
	EvenThread(int limit){
		this.limit=limit;
	}
	public void run(){
		System.out.print("even thread :");
		for(int i=0;i<limit;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		
	}
}
class OddThread extends Thread{
	int limit ;
	OddThread(int limit){
		this.limit=limit;
	}
	public void  run(){
	System.out.print("\n odd thread :");
		for(int i=0;i<limit;i++){
			if(i%2!=0){
				System.out.print(i+ " ");
				
			}
		}
		
	}
}
	
public class OddEvenThread{
	public static void main(String[]args)throws InterruptedException{
		Scanner in=new Scanner(System.in);
		System.out.println("enter limit");
		int limit=in.nextInt();
		
		EvenThread t1=new EvenThread(limit);
		OddThread t2=new OddThread(limit);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	}
}
