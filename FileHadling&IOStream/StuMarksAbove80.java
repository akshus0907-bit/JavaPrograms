/*Question 12: Write a Java program to read all student records and display students having marks above 80.
Asked In Practice Assignment
Input:
File contains:
Rahul 78
Amit 85
Neha 90
Pooja 67
Ravi 88

Output:
Students above 80:
Amit 85
Neha 90
Ravi 88

Explanation:
Use BufferedReader to read file line by line. For each line, split on space character to extract name and marks. Parse marks string as integer. Compare if marks > 80 (greater than, not equal to). If condition true, display that student record with name and marks. If condition false, skip to next line. Continue until end of file. Only students with marks 81 or above displayed.*/

import java.util.*;
import java.io.*;

public class StuMarksAbove80{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
			
			
			FileReader fr =new FileReader("student.txt");
		
		BufferedReader bf=new BufferedReader(fr);
		
		String data;
		 while ((data = bf.readLine()) != null){
			String[]part=data.split(" ");
			String stuname=part[0];
			int marks=Integer.parseInt(part[1]);
			if(marks>80){
				System.out.println(stuname+" "+marks);
			}
		}
		}
	}