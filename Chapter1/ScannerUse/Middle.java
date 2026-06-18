/*Question 51: Write a Java program to find the middle value among three distinct integers using ternary operator.
Input:
p = 10
q = 20
r = 15

Output:
Middle Number = 15

Explanation:
The middle number is the value that lies between the other two numbers.
Here, 15 lies between 10 and 20.*/

import java.util.*;
public class Middle{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter three number");
		int p=in.nextInt();
		int q=in.nextInt();
		int r=in.nextInt();
		
		if(p<q&&p<r){
			System.out.println("middle is = "+p);
		}else if(q<r){
			System.out.println("middle is = "+q);
		}
		else{
			System.out.println("middle is=" +r);
		}
	}
}
			