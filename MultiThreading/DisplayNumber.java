/*Question 1: Write a Java program to create a thread using Thread class and display numbers from 1 to 10.

Create a class that extends Thread. Override the run() method and print numbers from 1 to the given limit. Start the thread from the main method.
Asked In Practice Assignment
Input:
Enter limit: 10

Output:
Thread started
1 2 3 4 5 6 7 8 9 10
Thread finished

Explanation:
Creating threads using Thread class involves extending Thread and overriding run() method. The run() method contains the code to execute in thread. Call start() method to begin thread execution, not run() directly. Calling start() initializes thread state and calls run() internally, ensuring proper thread execution*/

import java.util.*;

class MyThread extends Thread{
	int limit;
	
	MyThread(int limit){
		this.limit=limit;
	}
	public void run(){
		System.out.println("all thread");
		
		for(int i=1;i<=limit;i++){
			System.out.println(i);
		}
		System.out.println("thread finished");
	}
}
public class DisplayNumber{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter limit");
		int limit=in.nextInt();
		
		MyThread t=new MyThread(limit);
		t.start();
	}
}
		