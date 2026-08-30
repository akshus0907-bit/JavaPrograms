/*Question 24: Write a Java program to count spaces in file.
Asked In Practice Assignment
Input:
File content:
Java Programming Language

Output:
Total spaces = 5

Explanation:
Read file character by character using FileReader. For each character, check if it equals space character (" "). Increment space counter when space found. Continue reading until file end. Count all space characters including multiple consecutive spaces. Display total space count. Different from word count as spaces are actual character occurrences. Example: Java Programming has 1 space, Java Programming (with 3 spaces) has 3 spaces.*/

import java.util.*;
import java.io.*;
public class CountSpace{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		
		int count=0;
		int data;
		while((data=fr.read())!=-1){
	    char ch=(char)data;
		
		if(ch==' '){
			count++;
		}
		}
		System.out.println("total space="+count);
	}
}
