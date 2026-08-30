/*Question 16: Write a Java program to find lowest marks from file.
Asked In Practice Assignment
Input:
File contains:
Rahul 78
Amit 85
Neha 90
Pooja 67

Output:
Lowest marks = 67

Explanation:
Read file line by line using BufferedReader. Initialize min variable with Integer.MAX_VALUE or first student marks. For each line, split and extract marks value. Parse as integer. Compare current marks with min value. If current marks less than min, update min variable. Continue processing entire file. Display lowest marks found after reading all records. Example: Among 78, 85, 90, 67 lowest is 67.*/

import java.util.*;
import java.io.*;

public class LowestMarkFile{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		
		BufferedReader br=new BufferedReader(fr);
		br.readLine();
		
		String data;
		int min=Integer.MAX_VALUE;
		
		while((data=br.readLine())!=null){
			String part[]=data.split(" ");
			int mark=Integer.parseInt(part[1]);
			
			if(mark<min){
				min=mark;
			}
		}
		br.close();
		System.out.println("min marks ="+min);
	}
}
				