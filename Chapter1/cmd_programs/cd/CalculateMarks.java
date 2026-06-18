/*Question 11: Write a Java program to enter marks of five subjects and calculate total marks and percentage.
Input:
Marks = 70, 75, 80, 65, 60

Output:
Total = 350
Percentage = 70%

Explanation:
Total marks are calculated by adding all five subject marks.
Percentage = Total ÷ 5.*/

public class CalculateMarks{
	public static void main(String x[]){
		int marks1 = Integer.parseInt(x[0]);
		int marks2 = Integer.parseInt(x[1]);
		int marks3 = Integer.parseInt(x[2]);
		int marks4 = Integer.parseInt(x[3]);
		int marks5 = Integer.parseInt(x[4]);
		
		int total= marks1+marks2+marks3+marks4+marks5;
		float percentage =total/5;
		System.out.println("total marks is ="+total +"\npercentage is = "+percentage);
	}
}