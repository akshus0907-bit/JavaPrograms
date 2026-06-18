/*Question 19: Given a score out of 100, print Excellent (?90), Good (?75), Average (?50), Poor (< 50) — using nested ternary operators.
Input:
Score = 82

Output:
Good

Explanation:
82 is greater than 75 but less than 90, so the grade is "Good".
Nested ternary operators are used instead of multiple if-else statements.*/

import java.util.*;
public class Score{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter score");
		int score=in.nextInt();
		if(score>=90){
			System.out.println("excellent");
		}
		else if(score>=75){
			System.out.println("good");
		}
		else if(score >=50){
			System.out.println("average");
		}
		else if(score<50){
			System.out.println("poor");
		}
		else{
			System.out.println("invalid input");
		}
	}
}