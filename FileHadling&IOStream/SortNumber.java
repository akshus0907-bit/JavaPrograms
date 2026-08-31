/*Question 30: Write a Java program to sort numbers stored in file.
Asked In Practice Assignment
Input:
File content:
45 23 67 12 89 34

Output:
Sorted numbers:
12 23 34 45 67 89

Explanation:
Read file content as string using BufferedReader. Split string on space to extract individual numbers as string array. Convert each string to integer and store in integer array. Sort integer array using Arrays.sort() method in ascending order. For descending order, sort and then reverse array. Write sorted numbers to output file or display. Ascending sort arranges smallest to largest. Descending sort arranges largest to smallest.*/
import java.util.*;
import java.io.*;
public class SortNumber{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("product.txt");
		
		BufferedReader br=new BufferedReader(fr);
		String data;
		int max=0;
		while((data=br.readLine())!=null){
			String part[]=data.split(" ");
			String name=part[0];
			int price=Integer.parseInt(part[1]);
			if(price>max){
				int temp=price;
				price=max;
				max=temp;
			