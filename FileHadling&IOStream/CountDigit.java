/*Question 20: Write a Java program to count digits in file.
Asked In Practice Assignment
Input:
File content:
Java123Programming456

Output:
Total digits = 6

Explanation:
Read file character by character using FileReader. For each character, check if it is digit (0-9). Use Character.isDigit() method or compare character with range 0 to 9. Increment digit counter when digit found. Continue reading until file end. Count includes all numeric digits. Display total digit count. Non-digit characters are ignored. Example: Java123 contains 3 digits (1, 2, 3) and Java456 contains 3 digits (4, 5, 6).*/

import java.util.*;
import java.io.*;

public class CountDigit{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		int data;
		int count=0;
		while((data=fr.read())!=-1){
			char ch=(char)data;
			
			if(ch>='0' && ch<='9'){
				count++;
				
			}
		}
		System.out.println(count);
		fr.close();
	}
}