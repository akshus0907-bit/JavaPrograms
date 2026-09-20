/*Question 8: Write a Java program to check whether a thread is alive or not.

Create a thread and check thread status using isAlive() before and after execution.
Asked In Practice Assignment
Input:
No input required

Output:
Thread alive before start: false
Thread alive after start: true
Thread alive after execution: false

Explanation:
isAlive() returns true if thread has started and not yet terminated. Before calling start(), thread is not alive. After calling start() and thread enters run() method, it becomes alive. After run() method completes and thread terminates, isAlive() returns false. Useful for checking thread execution status.*/

import java.util.*;
class MyThread extends Thread{
	public void run(){
	}
}
public class IsAliveMethod{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		MyThread t=new MyThread();
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());
	}
}