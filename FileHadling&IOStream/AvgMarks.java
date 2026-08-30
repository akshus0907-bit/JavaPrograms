/*Question 17: Write a Java program to calculate average marks from file.
Asked In Practice Assignment
Input:
File contains:
Rahul 78
Amit 85
Neha 90

Output:
Average marks = 84.33

Explanation:
Read file line by line using BufferedReader. Initialize sum=0 and count=0. For each line, split and extract marks. Parse as integer and add to sum. Increment count for each student. After reading complete file, calculate average = sum divided by count. Handle division properly to get decimal result. Display average with appropriate decimal places (2-3 decimal places). Formula: Average = Total Sum / Total Count.*/

import java.util.*;
import java.io.*;

public class AvgMarks{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		br.readLine();
		
		String data;
		int sum=0;
		int count=0;
		
		
		while((data=br.readLine())!=null){
			String part[]=data.split(" ");
			int mark=Integer.parseInt(part[1]);
			
			sum=sum+mark;
			count++;
		}
			float avg=(float)sum/count;
			
		
		System.out.println("avg is ="+avg);
		br.close();
	
	}
}
			
			