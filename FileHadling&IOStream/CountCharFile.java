/*Question 3: Write a Java program to count total characters in a file.
Asked In Practice Assignment
Input:
File content:
Java Programming

Output:
Total characters = 17

Explanation:
Open file using FileReader to read character by character. Initialize counter to zero. Use read() method in loop to read each character including spaces. Increment counter for every character read. When read() returns -1, file end is reached. Count includes all characters: letters, digits, spaces, and special characters. Display final count.*/

import java.util.*;
import java.io.*;

public class CountCharFile{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		
		int count =0;
		int data;
		while((data=fr.read())!=-1){
			count++;
		}
		System.out.println(count);
	}
}