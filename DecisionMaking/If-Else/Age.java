/*Question 12: Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
Input:
Age = 18

Output
Eligible to vote

Explanation:
According to voting rules, a person must be at least 18 years old to vote.
If age ? 18 ? Eligible
Otherwise ? Not Eligible*/

import java.util.*;
public class Age{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter age");
		int age=in.nextInt();

		if(age>=18){
			System.out.println("Eligible to vote");
		}
		else{
			System.out.println(" Not Eligible to vote");
		}
	}
}
			