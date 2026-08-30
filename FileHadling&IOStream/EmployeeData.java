/*Question 14: Write a Java program to store employee id, name and salary into file.
Asked In Practice Assignment
Input:
Input:
101 Rahul 25000
102 Amit 30000
103 Neha 28000

Output:
Employee data stored.

Explanation:
Create FileWriter for file output. Read employee structured data: id (number), name (string), and salary (number). Write all three fields to file separated by space for proper parsing. Store multiple employee records using loop. Each record on separate line for clarity and easy retrieval. Close FileWriter after storing all employee data. File contains complete employee information for future access.*/

import java.util.*;
import java.io.*;

public class EmployeeData{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileWriter fw=new FileWriter("emp.txt");
		for(int i=0;i<3;i++){
			System.out.println("enter id ,name and salary");
			
			int id=in.nextInt();
			in.nextLine();
			String name=in.nextLine();
			long sal=in.nextLong();
			
			
			fw.write(id+" "+name+" "+sal);
			fw.write("\n");
		}
		fw.close();
		System.out.println("data stord successfully");
	}
}
		
		