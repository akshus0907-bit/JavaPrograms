/*Question 27: Write a Java program to toggle the case of an alphabet using ASCII values.
Input:
a

Output:
A

Explanation:
Lowercase and uppercase letters differ by 32 in ASCII values.
By adding or subtracting 32, the case of the alphabet can be changed.*/

import java.util.*;
public class aTOA{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter alphabet:");
		char ch=in.next().charAt(0);
		if(ch>='A' &&ch<='Z'){
			ch=(char)(ch+32);
			System.out.println(ch);
			
		}
		else if(ch>='a'&&ch<='z'){
			ch=(char)(ch-32);
		
		System.out.println(ch);
		}
		else{
			System.out.println("invalid alphabet");
	}
}
}
		