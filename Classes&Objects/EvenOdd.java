/*Question 2: Write a Java program to implement a Number Checker.
Create a class NumberCheck with a variable number.
Check whether the number is Even or Odd using a class object.
Input:
Enter Number : 45

Output:
Number : 45
Result : Odd Number

Explanation:
A class NumberCheck is created with an instance variable number.
An object of the class is created and the user enters a number using Scanner.
The condition used: if (number % 2 == 0) then Even, else Odd.
The modulo operator (%) gives the remainder when divided by 2.
Since 45 % 2 = 1 (not zero), the number is Odd.
If the user had entered 44, then 44 % 2 = 0, and it would print Even Number.
This program demonstrates class objects with basic arithmetic conditions.*/

import java.util.*;
public class EvenOdd{
	int no;
	String result;
	public void set(int n){
		no=n;
		
	}
	public void Result(int no){
		if(no%2==0){
			result="Even";
		}
		else{
			result="Odd";
		}
	}
	public void get(){
		System.out.println("Number="+no);
		System.out.println("Result="+result);
	}

 public static void main(String[]args){
	 EvenOdd e=new EvenOdd();
	 Scanner in=new Scanner(System.in);
	 System.out.println("enter number");
	 int n=in.nextInt();
	 e.set(n);
	 e.Result(n);
	 e.get();
 }
}
 
 
			