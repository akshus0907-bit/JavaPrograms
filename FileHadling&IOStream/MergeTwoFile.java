/*Question 27: Write a Java program to merge two files.
Asked In Practice Assignment
Input:
File1 content:
Rahul 78
Amit 85
File2 content:
abc 90
Pooja 67

Output:
Merged file content:
Rahul 78
Amit 85
abc 90
Pooja 67

Explanation:
Read first file line by line using BufferedReader. Write each line to merged output file using FileWriter. After first file completes, open second file and read line by line. Append each line from second file to merged file. Close all file readers and writers. Merged file contains all content from both source files in order. Useful for combining multiple data sources. Verify by checking merged file size and line count.*/


import java.util.*;
import java.io.*;
public class MergeTwoFile{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		BufferedReader br=new BufferedReader(fr);
		
		
		FileWriter fw=new FileWriter("marged.txt");
		String data;
		while((data=br.readLine())!=null){
			fw.write(data);
			fw.write("\n");
		}
		br.close();
		
		FileReader fr1=new FileReader("emp.txt");
		BufferedReader br1=new BufferedReader(fr1);
		while((data=br1.readLine())!=null){
			fw.write(data);
			fw.write("\n");
		}
		br.close();
		fw.close();
		System.out.println("file merge sucessfully");
	}
}
		