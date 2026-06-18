/*Question 36: Check if a person is a child, teenager, adult, or senior based on age.

   Input: Age
   Logic: if-else if
   Output: Age category.
Input:
Age = 16

Output
Teenager

Explanation:
Age < 13 ? Child
13–19 ? Teenager
20–59 ? Adult
60+ ? Senior*/

import java.util.*;
public class PersonAge{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter age");
		int age=in.nextInt();
		
		if(age<=10){
			System.out.println("child");
		}
		else if(age<=20){
			System.out.println("teenager");
		}
		else if(age <30){
			System.out.println("adult");
		}
		else{
			System.out.println("senior");
		}
	}
}