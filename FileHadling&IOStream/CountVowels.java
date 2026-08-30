/*Question 19: Write a Java program to count vowels in file.
Asked In Practice Assignment
Input:
File content:
Java Programming

Output:
Total vowels = 5

Explanation:
Read file character by character using FileReader. Vowels are: a, e, i, o, u in lowercase and A, E, I, O, U in uppercase. For each character, check if it is vowel using toLowerCase() for case-insensitive comparison. Increment vowel counter when vowel found. Continue until file end. Display total vowel count. Note: Only count actual vowels, not consonants or other characters. Example: Java has 2 vowels (a, a).*/

import java.util.*;
import java.io.*;
public class CountVowels{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		int data;
		int count=0;
		while((data=fr.read())!=-1){
			char ch=(char)data;
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'
			||ch=='O'||ch=='U'){
				count++;
			}
		}
		System.out.println("total count="+count);
		fr.close();
	}
}