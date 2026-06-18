/*Question 35: Write a Java program to implement a Number Range Analyzer using POJO class.
Create a POJO class RangeCheck with variable number.
Using getter and setter methods, determine:
- number < 0 => Negative
- number 0 to 100 => Normal Range
- number > 100 => Large Number
Input:
Enter Number : 135

Output:
Number : 135
Category : Large Number

Explanation:
A POJO class RangeCheck has private field: number.
setNumber(135) stores the value. getNumber() retrieves it for checking.
If-else ladder:
- number < 0 => Negative
- number >= 0 && number <= 100 => Normal Range
- number > 100 => Large Number
Since 135 > 100, Category = Large Number.
If number = -5, output would be Negative.
If number = 50, output would be Normal Range.
This demonstrates range checking logic using POJO encapsulation.*/

import java.util.*;
public class NumberRange{
	private double No;
	 
	public void  setNo(double n){
		No=n;
	}
	public double getNo(){
		return No;
	}
	public String getCategory(){
		if(getNo()<0){
			return "Negative";
		}
		else if(getNo()>=0 &&getNo()<=100){
			return "Normal Number";
		}
		else{
			return "Large Number";
		}
	}
	public static void main(String[]args){
		NumberRange n=new NumberRange();
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		double No=in.nextDouble();
		n.setNo(No);
		System.out.println("--------------------------");
		System.out.println("Number ="+n.getNo());
		System.out.println("Category="+n.getCategory());
	}
}
