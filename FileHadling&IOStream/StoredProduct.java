/*Question 28: Write a Java program to store product name and price.
Asked In Practice Assignment
Input:
Input:
Laptop 50000
Phone 20000
Tablet 30000

Output:
Product data stored successfully.

Explanation:
Create FileWriter to write product inventory data. Accept product name and price from user input. Write product name and price to file separated by space or specific delimiter. Store multiple products using loop. Each product record on separate line for proper formatting and easy parsing. Close FileWriter after storing all products. File contains product inventory data for business operations. Format allows easy retrieval and sorting.*/

import java.util.*;
import java.io.*;
public class StoredProduct{
	public static void main(String[]args)throws Exception{
		Scanner in=new Scanner(System.in);
		
		FileWriter fw=new FileWriter("product.txt");
		for(int i=0;i<3;i++){
			System.out.println("enter product name");
			String name=in.nextLine();
			
			System.out.println("enter price");
			int price=in.nextInt();
			
			in.nextLine();
			
			fw.write(name+ " "+price);
			fw.write("\n");
			
	}
	fw.close();
	System.out.println("data stored successfully");
}
}
		