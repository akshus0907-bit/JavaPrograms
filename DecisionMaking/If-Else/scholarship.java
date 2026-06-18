/*Question 39: Check whether a student is eligible for scholarship:

   Attendance >= 75% and marks >= 80**
   Input: Attendance %, marks
   Logic: if-else
   Output: Eligible or not.
Input:
Attendance = 80%
Marks = 85

Output:
Eligible for Scholarship

Explanation:
Eligibility conditions:
Attendance ? 75% AND Marks ? 80
If both conditions true ? Eligible
Else ? Not Eligible*/

import java.util.*;
public class scholarship{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
			System.out.println("enter attendance and marks");
			int attendance=in.nextInt();
			int marks=in.nextInt();
			 
			 if(attendance>=75 && marks>=80){
				 System.out.println("eligible for scholarship");
			 }
			 else{
				 System.out.println("not eligible for scholarship");
			 }
		}
	}
