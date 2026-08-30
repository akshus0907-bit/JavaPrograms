/*Question 22: Write a Java program to convert file content into lowercase.
Asked In Practice Assignment
Input:
File content:
JAVA PROGRAMMING

Output:
Converted output:
java programming

Explanation:
Read entire file content as string using BufferedReader combined with StringBuilder. Apply toLowerCase() method to convert all characters to lowercase. Alternatively read character by character and apply Character.toLowerCase() for each. Write converted content to new file or display on console. Original file remains unchanged. Lowercase conversion affects only letters. Digits and special characters remain unchanged. Opposite of uppercase conversion.*/
import java.util.*;
import java.io.*;
public class ConvertLowerCase{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String data;
		while((data=br.readLine())!=null){
			data=data.toLowerCase();
			System.out.println(data);
		}
	br.close();
	}
}