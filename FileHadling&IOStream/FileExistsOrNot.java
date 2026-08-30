/*Question 7: Write a Java program to check whether file exists or not.
Asked In Practice Assignment
Input:
Input filename:
student.txt

Output:
File exists
OR
File does not exist

Explanation:
Create File object with filename as parameter. Use exists() method which returns boolean value. Returns true if file exists at specified path, false if file does not exist. Also can use isFile() method to verify if path refers to actual file. Use if-else statement to display appropriate message based on existence check result.*/

import java.util.*;
import java.io.*;
public class FileExistsOrNot{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter file name");
		String name=in.nextLine();
		
		File f=new File(name);
		if(f.exists()){
			System.out.println("file exists");
		}
		else{
			System.out.println("file not exists");
		}
	}
}