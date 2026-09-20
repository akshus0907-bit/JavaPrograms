/*Question 13: Write a Java program to demonstrate synchronization using synchronized methods.

Create a shared object and multiple threads accessing the same method. Use synchronized keywords to avoid conflict.
Asked In Practice Assignment
Input:
No input required

Output:
Thread1 entered
Thread1 completed
Thread2 entered
Thread2 completed

Explanation:
Synchronized methods ensure only one thread can execute method at a time on same object. Other threads wait until method completes and lock is released. Prevents race conditions and data inconsistency. Synchronization serializes access to shared resource, ensuring data integrity.*/

import java.util.*;
class Shared{
	
	public synchronized  void display(String name){
		System.out.println(name+"entered");
		System.out.println(name+"completed");
	}
}

class Thread1 extends Thread{
	Shared obj;
	
	Thread1(Shared obj){
		this.obj=obj;
	}
	public void run(){
		obj.display("Thread1");
	}
}

class Thread2 extends Thread{
	Shared obj;
	
	Thread2(Shared obj){
		this.obj=obj;
	}
	public void run(){
		obj.display("thread2");
	}
}
public class SynchronizationMethod{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		Shared obj=new Shared();
		
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();
	}
}
	
	
	