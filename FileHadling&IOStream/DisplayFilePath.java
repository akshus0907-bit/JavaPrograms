/*Question 10: Write a Java program to display file path.
Asked In Practice Assignment
Input:
Input filename:
student.txt

Output:
File path: C:\Users\Java\student.txt

Explanation:
Create File object with filename. Use getAbsolutePath() method to get complete path from root directory. getPath() returns path as specified in File constructor. getCanonicalPath() returns simplified absolute path removing redundant components. Display file location showing where file is stored in system. Useful for verification and debugging file operations in application.*/

import java.util.*;
import java.io.*;

public class DisplayFilePath{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter file name");
		String name =in.nextLine();
		
		File f=new File(name);
		if(f.exists()){
			System.out.println(f.getAbsolutePath());
		}
		else{
			System.out.println("file not found");
		}
	}
}