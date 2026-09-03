/*Question 23: Write a Java program to replace a word in file.
Asked In Practice Assignment
Input:
Original file content:
Java is great
Replace: Java with Python

Output:
New file content:
Python is great

Explanation:
Read entire file content as string using BufferedReader and StringBuilder. Use replace(oldWord, newWord) method to replace all occurrences of specific word. Use replaceAll() method for pattern-based replacement using regular expressions. Write modified content to file (can overwrite original or create new). Replacement affects all occurrences throughout entire file. Case-sensitive replacement. Verify replacement by reading modified file.*/
import java.io.*;
import java.util.*;

public class ReplaceWord {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        FileReader fr = new FileReader("student.txt");
        BufferedReader br = new BufferedReader(fr);

        StringBuilder sb = new StringBuilder();

        String data;

        while ((data = br.readLine()) != null) {
            sb.append(data);
            sb.append("\n");
        }

        br.close();

        System.out.println("Enter old word:");
        String oldWord = in.nextLine();

        System.out.println("Enter new word:");
        String newWord = in.nextLine();

        String result = sb.toString().replace(oldWord, newWord);

        FileWriter fw = new FileWriter("student.txt");
        fw.write(result);
        fw.close();

        System.out.println("Word replaced successfully.");
    }
}