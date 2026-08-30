/*Question 21: Write a Java program to convert file content into uppercase.
Asked In Practice Assignment
Input:
File content:
java programming

Output:
Converted output:
JAVA PROGRAMMING

Explanation:
Read entire file content as string using BufferedReader combined with StringBuilder. Apply toUpperCase() method to convert all characters to uppercase. Alternatively read character by character and apply Character.toUpperCase() for each. Write converted content to new file or display on console. Original file remains unchanged. Uppercase conversion affects only letters. Digits and special characters remain unchanged. Useful for standardizing text format.*/


import java.util.*;
import java.io.*;
public class ConvertUpperCase{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String data;
		while((data=br.readLine())!=null){
			
			
			data=data.toUpperCase();
				System.out.println(data);
			}
		
		br.close();
	}
}