/*Question 7: Write a Java program to check whether a number is even or odd using constructor initialization.

Description: Create NumberCheck class with one integer variable. Initialize 
using constructor and check even or odd using logical condition.
INPUT:
Enter Number: 17

OUTPUT:
17 is Odd Number

EXPLANATION:
Create NumberCheck class with int number field. Use constructor public 
NumberCheck(int num) to initialize. Check if number % 2 == 0 then "Even" else "Odd". 
Display number and type. Create object new NumberCheck(17) and display result.*/

import java.util.*;
public class EvenOdd{
	private int  No;
	
	EvenOdd(int n){
		No=n;
	}
	void display(){
		if(No%2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		EvenOdd e=new EvenOdd(n);
		e.display();
	}
}
		
