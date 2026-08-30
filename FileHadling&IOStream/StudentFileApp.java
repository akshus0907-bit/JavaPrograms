/*Question 1: Write a Java program to create a file student.txt and store student name and marks into it.
Asked In Practice Assignment
Input:
Enter student name: Rahul
Enter marks: 78

Output:
File created successfully.
Data written successfully.

Explanation:
Create file using FileWriter class with filename student.txt. Accept student name and marks from user using Scanner. Write name and marks to file using write() method separated by space. Close FileWriter properly using close() method to save data. FileWriter automatically creates new file if not exists and overwrites if already exists. Proper file closure ensures no data loss.*/


import java.io.FileWriter;

import java.util.*;
 public class StudentFileApp{
	 public static void main(String[]args) throws Exception{
		 Scanner in=new Scanner(System.in);
		 
		 System.out.print("enter student name");
		 String name=in.nextLine();
		 
		 System.out.println("enter marks");
		 int marks=in.nextInt();
		 
		 FileWriter fw=new FileWriter("student.txt");
		 
		 fw.write(name+" "+ marks);
		 
		 fw.close();
		 
		 System.out.println("file created successfully");
		 
		 System.out.println("data written successfully");
		 
		 
		 in.close();
	 }
 }