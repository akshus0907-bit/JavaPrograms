/*Question 9: Write a Java program to demonstrate join() method.

Create two threads. The first thread prints numbers and the second thread waits until the first thread completes using join().
Asked In Practice Assignment
Input:
No input required

Output:
Thread1 running
Thread1 completed
Thread2 started after Thread1

Explanation:
join() method causes calling thread to wait until specified thread completes execution. In example, main thread calls thread1.join(), so main waits for thread1 to finish before starting thread2. Useful for ensuring sequential execution of dependent tasks among threads.*/

import java.util.*;
class MyThread extends Thread{
	public void run(){
		System.out.println("thread is running");
	}
}

public class JoinMethod{
	public static void main(String[]args) throws InterruptedException{
		Scanner in=new Scanner(System.in);
		
		MyThread t=new MyThread();
		MyThread t2=new MyThread();
		
		t.start();
		t.join();
		System.out.println("main thread is continue");
	}
}