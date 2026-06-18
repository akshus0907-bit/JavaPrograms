/*6. Find Length Without Built-in Function (No LeetCode)
Given a string, determine its length without using any built-in length function. Traverse the
string manually and count the characters.
Example: Input: "coding" → Output: 6*/

import java.util.*;
public class Q6{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		int count =0;
		
		for(int i=0;i<s.length();i++){
			
			count ++;
		}
		System.out.println("length of string="+count);
	}
}
		
