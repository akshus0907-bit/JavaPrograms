/*Question 26: Write a Java program to display only odd marks from file.
Asked In Practice Assignment
Input:
File content:
Rahul 78
Amit 85
Neha 90
Pooja 67
Ravi 88

Output:
Odd marks:
Amit 85
Pooja 67

Explanation:
Read file line by line using BufferedReader. For each line, split on space to extract marks. Parse marks as integer. Check condition marks % 2 != 0 for odd numbers. If true, display complete student record (name and marks). If false, skip line. Continue through entire file. Odd marks are not divisible by 2. Only records with odd marks displayed. Even marks (78, 90, 88) excluded from output.*/

import java.util.*;
import java.io.*;
public class DisplayOddMarks{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		BufferedReader br=new BufferedReader(fr);
		String data;
		while((data=br.readLine())!=null){
			String part[]=data.split(" ");
			String name=part[0];
			int marks=Integer.parseInt(part[1]);
			if(marks%2!=0){
				System.out.println("odd marks\n"+name+" "+marks);
			}
		}
		br.close();
	}
}