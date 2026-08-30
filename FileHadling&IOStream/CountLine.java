/*Question 5: Write a Java program to count total lines in a file.
Asked In Practice Assignment
Input:
File content:
Java
Python
C++

Output:
Total lines = 3

Explanation:
Use BufferedReader to read file. Initialize line counter to zero. Loop continuously using readLine() method to read each line. Increment counter for each non-null line read. When readLine() returns null, end of file reached, stop loop. Display total line count. Each line terminated by newline character is counted as one line.*/

import java.util.*;
import java.io.*;

public class CountLine{
	public static void main(String[]args) throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		
		BufferedReader br=new BufferedReader(fr);
		int count=0;
		String data;
		
		while(( data=br.readLine())!=null){
			count++;
		}
		System.out.println("total line="+count);
	}
}