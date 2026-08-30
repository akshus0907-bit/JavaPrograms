/*Question 25: Write a Java program to display only even marks from file.
Asked In Practice Assignment
Input:
File content:
Rahul 78
Amit 85
Neha 90
Pooja 67
Ravi 88

Output:
Even marks:
Rahul 78
Neha 90
Ravi 88

Explanation:
Read file line by line using BufferedReader. For each line, split on space to extract marks. Parse marks as integer. Check condition marks % 2 == 0 for even numbers. If true, display complete student record (name and marks). If false, skip line. Continue through entire file. Even marks are divisible by 2. Only records with even marks displayed. Odd marks (85, 67) excluded from output.*/

import java.util.*;
import java.io.*;
public class DisplayEvenMarks{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		FileReader fr=new FileReader("student.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String data;
		while((data=br.readLine())!=null){
			String[]part=data.split(" ");
			String stuname=part[0];
			int marks=Integer.parseInt(part[1]);
			if(marks%2==0){
				System.out.println("Even marks\n"+stuname+" "+marks);
			}
		}
		br.close();
	}
}