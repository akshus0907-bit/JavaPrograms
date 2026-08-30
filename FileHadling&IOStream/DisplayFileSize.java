/*Question 8: Write a Java program to display file size.
Asked In Practice Assignment
Input:
Input filename:
student.txt

Output:
File size = 120 bytes

Explanation:
Create File object with filename. Use length() method which returns file size in bytes as long value. Check if file exists before calling length() using exists() method. For larger files, convert bytes to KB by dividing by 1024, to MB by dividing by 1024*1024. If file not found, length() returns -1 or throws exception. Display file size with appropriate unit.*/

import java.util.*;
import java.io.*;

public class DisplayFileSize{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter file name");
		String name=in.nextLine();
		
		File f=new File(name);
		if(f.exists()){
			System.out.println("File size= "+f.length()+"bytes");
		}
		else{
			System.out.println("file not found");
		}
	}
}