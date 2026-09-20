/*Question 7: Write a Java program to create multiple threads and display their priorities.

Create three threads and assign different priorities using setPriority(). Display their priorities.
Asked In Practice Assignment
Input:
No input required

Output:
Thread1 Priority: 3
Thread2 Priority: 6
Thread3 Priority: 9

Explanation:
Thread priorities range from 1 (MIN_PRIORITY) to 10 (MAX_PRIORITY), default is 5 (NORM_PRIORITY). Higher priority threads are favored for execution. Set priority using setPriority() before starting thread. Get priority using getPriority(). Priority affects scheduler behavior but does not guarantee execution order.*/

import java.util.*;
class MyThread extends Thread{
	public void run(){
	}
	
}
public class prioritiesThread{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		t1.setPriority(3);
		t2.setPriority(6);
		t3.setPriority(9);
		
		System.out.println("Thread1 Priority:"+t1.getPriority()+"\nThread2 Priority:"+t2.getPriority()+" \nThread3 Priority:"+t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
	}
}
	