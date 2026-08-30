/*Question 13: Write a Java program to copy data from one file to another.
Asked In Practice Assignment
Input:
Source file (source.txt):
Java Programming
Destination: destination.txt

Output:
Data copied successfully.

Explanation:
Create FileReader to open source file for reading. Create FileWriter to open destination file for writing. Read source file character by character using read() method in loop. Write each character to destination file using write() method. Continue reading until read() returns -1 indicating file end. Close both FileReader and FileWriter to save changes. Destination file now contains exact copy of source.*/

import java.util.*;
import java.io.*;
public class CopyFile{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileWriter fw=new FileWriter("source.txt");
		FileInputStream fi=new FileInputStream("student.txt");
		FileOutputStream out=new FileOutputStream("source.txt");
		
		int data;
		while((data=fi.read())!=-1){
			out.write(data);
		}
		System.out.println("data copied successfully");
	}
	
	
}