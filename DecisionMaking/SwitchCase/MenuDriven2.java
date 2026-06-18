/*Question 63: Write a menu-driven program in java using switch case.
          1.Check Number is positive , negative or zero.
          2.Check Number is even or odd.
          3.Write a c program to find the max number using 2 numbers.
Input:
Choice = 1
Number = -5

Output:
Negative Number

Explanation:
Program checks if number is less than zero and prints Negative.

Input:
Choice = 3
Number1 = 10
Number2 = 20

Output:
Maximum Number = 20

Explanation:
Program compares two numbers and prints the greater one.*/

import java.util.*;
public class MenuDriven2{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("1.Check Number is positive , negative or zero\n2.Check Number is even or odd \n3.Write a c program to find the max number using 2 numbers.");
		System.out.println("enter choice");
		int choice=in.nextInt();
		System.out.println("enter two number");
		int n=in.nextInt();
		int b=in.nextInt();
		
		    switch(choice){
			case 1:
			if(n>0){
				System.out.println("number is positive");
			}
			else if(n==0){
				System.out.println("numberis zero");
			}
			else {
				System.out.println("number is negative");
			}
			if(b>0){
				System.out.println("number is positive");
			}
			else if (b==0){
				System.out.println("number is zero");
			}
			else{
				System.out.println("number is negative");
			}
			case 2:
			if(n%2==0){
				System.out.println("number is even");
			}
			else{
				System.out.println("number is odd");
			}
			if(b%2==0){
				System.out.println("number is even");
			}
			else{
				System.out.println("number is odd");
			}
			case 3:
			if(n>b){
				System.out.println("max="+n);
			}
			else{
				System.out.println("max="+b);
			}
		}
	}
}
				
		