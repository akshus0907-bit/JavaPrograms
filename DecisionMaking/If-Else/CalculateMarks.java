/*Question 27: Write a java program to input marks of five subjects Physics, Chemistry, Biology,
       Mathematics and Computer, calculate percentage and grade according to given conditions:
                    percentage >= 90% : Grade A
                    percentage >= 80% : Grade B
                    percentage >= 70% : Grade C
                    percentage >= 60% : Grade D
                    percentage >= 40% : Grade E
                    percentage < 40% : Grade F
Input:
Physics = 85
Chemistry = 80
Biology = 75
Mathematics = 90
Computer = 70

Output:
Percentage = 80%
Grade = B

Explanation:
Total Marks = 85 + 80 + 75 + 90 + 70 = 400
Percentage = 400 / 5 = 80%
Since percentage is 80%, Grade B is assigned*/

import java.util.*;
public class CalculateMarks{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter physcis,chemistry,biology,mathemtics,computer marks");
		int phy=in.nextInt();
		int chem=in.nextInt();
		int bio=in.nextInt();
		int math=in.nextInt();
		int comp=in.nextInt();
		char  grade;
		
		int total =phy+chem+bio+math+comp;
		int percentage=(total/5);
		System.out.println(percentage);
		
		if(percentage>=90){
			grade='A';
			System.out.println(grade);
		}
	    else if(percentage>=80){
			grade='B';
		System.out.println(grade);
		}
		else if(percentage>=70){
			grade='C';
			System.out.println(grade);
		}
		else if(percentage>=60){
			grade='D';
			System.out.println(grade);
		}
		else if(percentage>=40){
			grade='E';
			System.out.println(grade);
		}
		else if(percentage<40){
			grade='F';
			System.out.println(grade);
		}
		else {
			System.out.println("invalid input");
		}
	}
}
	