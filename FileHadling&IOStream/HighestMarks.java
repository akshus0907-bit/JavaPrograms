/*Question 15: Write a Java program to find highest marks from file.
Asked In Practice Assignment
Input:
File contains:
Rahul 78
Amit 85
Neha 90
Pooja 67

Output:
Highest marks = 90

Explanation:
Read file line by line using BufferedReader. Initialize max variable with Integer.MIN_VALUE or first student marks. For each line, split and extract marks value. Parse as integer. Compare current marks with max value. If current marks greater than max, update max variable. Continue processing entire file. Display highest marks found after reading all records. Example: Among 78, 85, 90, 67 highest is 90.*/
import java.util.*;
import java.io.*;
public class HighestMarks{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("student.txt");
		BufferedReader br=new BufferedReader(fr);
		br.readLine();
		int max=0;
		String data;
		while((data=br.readLine())!=null){
			String[] part = data.split(" ");

			int marks = Integer.parseInt(part[1]);

			if(marks>max){
				max=marks;
			}
		}
		br.close();
		System.out.println(max);
	}
}
		
		