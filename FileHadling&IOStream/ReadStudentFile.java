/*Question 2: Write a Java program to read data from student.txt and display it.
Asked In Practice Assignment
Input:
File exists with content:
Rahul 78

Output:
Student Data:
Rahul 78

Explanation:
Open student.txt using FileReader and wrap with BufferedReader for efficient reading. Use readLine() method to read complete line from file. Parse the line to extract student name and marks. Display extracted data in formatted output. Handle FileNotFoundException if file does not exist. Close BufferedReader after reading completes to free system resources.*/

import java.util.*;
import java.io.*;

public class ReadStudentFile{
	public static void main(String[]args)  throws Exception{
		Scanner in=new Scanner(System.in) ;
		
		FileReader fr =new FileReader("student.txt");
		
		BufferedReader bf=new BufferedReader(fr);
		
		String data=bf.readLine();
		
		System.out.println(data);
		
	}
}
		


