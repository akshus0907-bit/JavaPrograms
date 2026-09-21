/*Question 14: Write a Java program to demonstrate synchronized blocks.

Use synchronized block instead of synchronized method to protect critical section.
Asked In Practice Assignment
Input:
No input required

Output:
Thread1 accessing resource
Thread2 waiting
Thread2 accessing resource

Explanation:
Synchronized blocks provide finer control than synchronized methods, allowing synchronization of only critical sections. Syntax: synchronized(object) { critical code }. Only specified code block is synchronized, rest executes concurrently. More efficient than synchronizing entire method as non-critical code remains concurrent.*/

class Resource{
	void access(){
		synchronized (this){
			System.out.println(Thread.currentThread().getName()+" accessing resource");
		}
	}
}
class MyThread extends Thread{
	Resource r;
	MyThread(Resource r,String name){
		this.r=r;
		setName(name);
	}
	public void run(){
		r.access();
	}
}
public class synchronizedBlocks{
	public static void main(String[]args){
		Resource r=new Resource();
		
		MyThread t1=new MyThread(r,"thread1");
		MyThread t2=new MyThread(r,"thread2");
		t1.start();
		t2.start();
	}
}