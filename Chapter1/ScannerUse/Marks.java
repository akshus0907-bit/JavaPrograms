/*Question 49: Given marks out of 100, print grade using nested ternary operators.
Input:
Marks = 82

Output:
Good

Explanation:
Grades are assigned based on marks range:
? 90 ? Excellent
? 75 ? Good
? 50 ? Average
< 50 ? Poor

Since 82 lies between 75 and 89, the grade is Good.*/

import java.util.*;
public class Marks{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=in.nextInt();
		 String result = (marks >= 90) ? "Excellent" : 
                        (marks >= 75) ? "Good" : 
                        (marks >= 50) ? "Average" : "Poor";
		System.out.println(result);
	}
}