/*Question 6: Write a Java program to append data into an existing file.
Asked In Practice Assignment
Input:
Existing file contains:
Rahul 78
New data to append:
Amit 85

Output:
Data appended successfully.

Explanation:
Create FileWriter with filename and append parameter set to true. FileWriter(filename, true) opens file in append mode. When append is true, new data adds at file end without overwriting existing content. When false (default), file content is overwritten. Write new data using write() method. Close FileWriter to save appended data. Previous content is preserved.*/

import java.util.*;
import java.io.*;
public class AppendFileData{
	public static void main(String[]args) throws Exception{
		Scanner in=new Scanner(System.in);
		
		 System.out.print("Enter student name: ");
        String name = in.nextLine();

        System.out.print("Enter marks: ");
        int marks = in.nextInt();

        FileWriter fw = new FileWriter("student.txt", true);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.newLine();
        bw.write(name + " " + marks);

        bw.close();

        System.out.println("Data appended successfully.");
    }
}
		
		
		
		
			
		
		