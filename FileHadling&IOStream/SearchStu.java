/*Question 18: Write a Java program to search student by name in file.
Asked In Practice Assignment
Input:
Search name: Amit
File contains:
Rahul 78
Amit 85
Neha 90

Output:
Record found:
Amit 85

Explanation:
Read file line by line using BufferedReader. For each line, split on space to extract student name. Compare extracted name with search keyword using equals() method for exact case-sensitive match. If match found, display complete record (name and marks) and exit search. If no match found after processing entire file, display Record not found message. Search is linear sequential comparison of each line.*/

import java.util.*;
import java.io.*;
public class SearchStu{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter name for search");
		String ser=in.nextLine();
		
		FileReader fr=new FileReader("student.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		boolean found=false;
		String data;
		
		while((data=br.readLine())!=null){
			String part[]=data.split(" ");
			String name =(part[0]);
			
			if(name.equals(ser)){
				System.out.println("record found="+data);
				found=true;
				break;
			}
		}
			if(!found){
				System.out.println("record not found");
			}
			br.close();
		
	}
}
				
				