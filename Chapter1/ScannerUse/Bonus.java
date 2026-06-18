/*Question 55: Write a Java program to determine bonus based on performance rating.
Input:
Rating = 9

Output:
15% Bonus

Explanation:
If rating > 8 ? 15% bonus
If rating between 5 and 8 ? 10% bonus
Otherwise ? No bonus
Since rating is 9, employee gets 15% bonus.*/

import java.util.*;
public class Bonus{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter rating");
		int rate=in.nextInt();
		String result=(rate>8)?"15% bonus":
		               (rate>=5 &&rate<=8)?"10%bonus":"no bonus";
					   
		System.out.println(result);
	}
}	