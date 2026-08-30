/*Question 4: Write a Java program to count total words in a file.
Asked In Practice Assignment
Input:
File content:
Java is easy language

Output:
Total words = 4

Explanation:
Read entire file content as string using BufferedReader and StringBuilder. Split string using space delimiter with split method. Count number of elements in resulting string array which represents total words. Handle multiple consecutive spaces correctly using regex pattern. Alternatively use StringTokenizer to count words. Display total word count.*/

import java.util.*;
import java.io.*;
public class CountWord{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String data =br.readLine();
		String word[]= data.trim().split(" ");
		
		System.out.println("total words="+word.length);
		
		br.close();
	}
}
		
		
		