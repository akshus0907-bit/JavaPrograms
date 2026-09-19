/*Question 5: Write a Java program to demonstrate getName() and setName() methods of Thread.

Create a thread and change its name using setName(). Display the thread name using getName().
Asked In Practice Assignment
Input:
Enter thread name: WorkerThread

Output:
Thread name is: WorkerThread

Explanation:
Every thread has default name like "Thread-0", "Thread-1". Use setName() to assign custom name for identification. Use getName() to retrieve current thread name. Custom names help in debugging and monitoring threads. Useful for logging and tracking thread behavior in applications.*/

import java.util.*;
class MyThread extends Thread{
	
	public void run(){
		System.out.println("thred name="+getName());
	}
}
 public class SetandGetThread{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 MyThread t =new MyThread();
		 t.setName("Payment");
		 System.out.println(t.getName());
		 t.start();
	 }
 }