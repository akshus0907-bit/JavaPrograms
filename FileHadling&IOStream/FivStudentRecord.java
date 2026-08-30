/*Question 11: Write a Java program to store 5 student records into file.
Asked In Practice Assignment
Input:
Input:
Rahul 78
Amit 85
Neha 90
Pooja 67
Ravi 88

Output:
Records stored successfully.

Explanation:
Create FileWriter to open file in write mode. Use loop to iterate exactly 5 times for storing 5 records. For each iteration, read student name and marks from user input or predefined data. Write each record to file with name and marks separated by space. Add newline character after each record for proper formatting. Close FileWriter after storing all 5 records to save file properly.*/

import java.util.*;
import java.io.*;
public class FivStudentRecord{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		System.out.println("enter file name");
		String name=in.nextLine();
		
		FileWriter fw=new FileWriter(name);
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		for(int i=0;i<5;i++){
			System.out.println("enter Stuname");
			String stuname=in.nextLine();
			
			System.out.println("enter marks");
			int marks=in.nextInt();
			
			in.nextLine();
			
			bw.write(stuname +"="+marks);
			bw.newLine();
			
		}
			
			bw.close();
			
			System.out.println("data write successfully");
		
	}
}
			