/*Question 29: Write a Java program to display products above price 500.
Asked In Practice Assignment
Input:
File contains:
Laptop 50000
Pen 20
Phone 20000
Notebook 100

Output:
Products above 500:
Laptop 50000
Phone 20000

Explanation:
Read file line by line using BufferedReader. For each line, split on space to extract product name and price. Parse price as integer. Compare if price > 500 (strictly greater than). If condition true, display product record with name and price. If condition false, skip to next line. Continue processing entire file. Products with price exactly 500 excluded. Filters show only expensive products. Display filtered product list.*/

import java.util.*;
import java.io.*;
public class PriceAbove500{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileReader fr=new FileReader("product.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String data;
		while((data=br.readLine())!=null){
			String part[]=data.split(" ");
			String name=part[0];
			int price=Integer.parseInt(part[1]);
			if(price>500){
				System.out.println(name+" "+price);
			}
		}
			br.close();
			fr.close();
		}
}
		