/*Question 26: Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
   PerHeight < 150.0  : The person is Dwarf.
   PerHeight >= 150.0 && PerHeight < 165.0  :   The   person is  average heighted.
  PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.

Test Data : 135
 
Expected Output : The person is Dwarf.
Input:
Height = 135

Output:
The person is Dwarf

Explanation:
Since 135 is less than 150, the person is categorized as Dwarf.*/

import java.util.*;
public class PersonHeight{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter height");
		int height=in.nextInt();
		if(height<=150){
			System.out.println("the person is dwarf");
		}
		else if(height>=151 && height<165){
			System.out.println("the person is average heighted");
		}
		else if(height>=165 &&height<=195){
			System.out.println("the person is taller");
		}
	}
}