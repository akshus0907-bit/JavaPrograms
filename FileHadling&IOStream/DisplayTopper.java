/*Question 31: Write a Java program to store student records and display topper.
Asked In Practice Assignment
Input:
File contains:
Rahul 78
Amit 95
Neha 88
Pooja 67

Output:
Topper: Amit 95

Explanation:
Read file line by line using BufferedReader. Initialize maxMarks with Integer.MIN_VALUE and topperName as empty string. For each line, split and extract student name and marks. Parse marks as integer. If current marks > maxMarks, update maxMarks and topperName variables. Continue processing entire file. After reading all records, display topper (student with highest marks). Topper is unique student achieving maximum marks in class.*/
import java.util.*;
import java.io.*;
public  class DisplayTopper{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String data;
		String TopperName="";
		int max=Integer.MIN_VALUE;
		while((data=br.readLine())!=null){
			String part[]=data.split(" ");
			String name=part[0];
			int marks=Integer.parseInt(part[1]);
			
			if(marks>max){
				max=marks;
				TopperName=name;
			}
		}
		System.out.println(TopperName+" "+max);
		br.close();
		fr.close();
	}
}
				