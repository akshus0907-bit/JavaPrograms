/*Question 9: Write a Java program to calculate average of three subject marks using constructor.

Description: Create Result class with three subject marks. Initialize using constructor. 
Calculate average and display result.
INPUT:
Enter Marks: 70 80 90

OUTPUT:
Average Marks: 80

EXPLANATION:
Create Result class with fields mark1, mark2, mark3. 
Use constructor public Result(int m1, int m2, int m3) to initialize. Calculate average as (m1 + m2 + m3) / 3.
 Create method displayAverage() to print average. Create object new Result(70, 80, 90) and display average.*/
 import java.util.*;
 public class CalAvg{
	 private int Marks1;
	 private int Marks2;
	 private int Marks3;
	 
	 CalAvg(int m1,int m2,int m3){
		 Marks1=m1;
		 Marks2=m2;
		 Marks3=m3;
	 }
	 void displayAverage(){
		 double result=(Marks1+Marks2+Marks3)/3.0;
		 System.out.println("Average marks="+result);
	 }
	
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter marks1");
		int marks1=in.nextInt();
		System.out.println("enter marks2");
		int marks2=in.nextInt();
		System.out.println("enter mark3");
		int marks3=in.nextInt();
		CalAvg c=new CalAvg(marks1,marks2,marks3);
		c.displayAverage();
	}
 }
