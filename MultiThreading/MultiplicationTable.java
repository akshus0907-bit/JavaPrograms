/*Question 10: Write a Java program to create a thread that prints a multiplication table.

Create a thread that accepts a number and prints its multiplication table.
Asked In Practice Assignment
Input:
Enter number: 5

Output:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25

Explanation:
Thread can perform calculations and display results. Create thread to accept number and iterate from 1 to 10 to print multiplication table. Demonstrates thread performing computational task independently. Thread execution allows other operations to proceed while calculation runs.*/

import java.util.*;
class TableMul extends Thread{
	int n;
	TableMul(int n){
		this.n=n;
	}
	public void run(){
		for(int i=1;i<11;i++){
			System.out.println(n*i);
		}
	}
}
public class MultiplicationTable{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=in.nextInt();
		TableMul t=new TableMul(n);
		
		t.start();
	}
}
			