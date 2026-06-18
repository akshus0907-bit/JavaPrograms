/*Question 28: Write a Java program to implement a Number Property Checker using POJO class.
Create a POJO class Number with variable num.
Using getter and setter methods, determine:
- Whether the number is Even or Odd
- Whether the number is Positive or Negative
Input:
Enter Number : -14

Output:
Number : -14
Even Number
Negative Number

Explanation:
A POJO class Number has private field num.
setNum(-14) stores the value. getNum() retrieves it for checking.
Even/Odd check: (-14) % 2 == 0 => Even Number.
Positive/Negative check: -14 < 0 => Negative Number.
Both checks run independently on the same stored value.
Note: The number -14 is both Even AND Negative, so two lines are printed.
This program shows how POJO encapsulation is used with two separate logical checks.*/

import java.util.*;
public class EvenOdd{
	private int No;
	
	public void setNo(int n){
		No=n;
	}
	public int getNo(){
		return No;
	}
	public String getResult(){
		if(No%2==0){
			return "Even number";
		}
		else{
			return "odd number";
		}
	}
	public String getFinaResult(){
		if(No>0){
			return "Positive";
		}
		else{
			return "Negative";
		}
	}
	public static void main(String[]args){
		EvenOdd e=new EvenOdd();
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int No=in.nextInt();
		e.setNo(No);
		System.out.println("number="+e.getNo());
		System.out.println(e.getResult());
		System.out.println(e.getFinaResult());
	}
}
